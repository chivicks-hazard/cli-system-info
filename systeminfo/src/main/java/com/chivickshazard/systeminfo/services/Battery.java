package com.chivickshazard.systeminfo.services;
import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.PowerSource;
import oshi.util.FormatUtil;

public class Battery {
    private static final SystemInfo systeminfo = new SystemInfo();
    private static final HardwareAbstractionLayer hai = systeminfo.getHardware();
    private static final PowerSource battery = hai.getPowerSources().get(0);

    public static String getBatteryInfo() {
        String name = battery.getName();
        long remainingTime = (long) battery.getTimeRemainingInstant();
        int currentCapacity = battery.getCurrentCapacity();
        int fullCapacity = battery.getMaxCapacity();
        double percent = currentCapacity / (double) fullCapacity * 100;

        return "Name: " + name + "\n" +
                "Full Capacity: " + fullCapacity + "\n" +
                "Current Capacity: " + currentCapacity + "\n" +
                "Percent: " + (int) Math.round(percent) + "%" + "\n" +
                "Remaining Time: " + FormatUtil.formatElapsedSecs(remainingTime) + "\n";
    }
    
    public static String getChargeStatus() {
        boolean isCharging = battery.isCharging();
        boolean isDischarging = battery.isDischarging();
        boolean isPlugged = battery.isPowerOnLine();

        return "Charging: " + isCharging + "\n" +
                "Discharging: " + isDischarging + "\n" +
                "Plugged: " + isPlugged;
    }
}
