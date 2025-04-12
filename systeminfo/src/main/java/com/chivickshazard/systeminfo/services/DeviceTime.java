package com.chivickshazard.systeminfo.services;

import java.time.LocalDateTime;

public class DeviceTime {
    private static final LocalDateTime now = LocalDateTime.now();

    public static String getCurrentTime() {
        return "Time: " + now.getHour() + ":" + now.getMinute() + ":" + now.getSecond();
    }

    public static String getCurrentDate() {
        return "Date: " + now.getDayOfMonth() + "/" + now.getMonthValue() + "/" + now.getYear();
    }
}
