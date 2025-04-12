package com.chivickshazard.systeminfo.services;

import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.util.FormatUtil;

public class Memory {
    private static final SystemInfo systeminfo = new SystemInfo();
    private static final HardwareAbstractionLayer hai = systeminfo.getHardware();
    private static final GlobalMemory memory = hai.getMemory();

    public static String getMemoryInfo() {
        long totalMemory = memory.getTotal();
        long availableMemory = memory.getAvailable();
        long usedMemory = totalMemory - availableMemory;

        return "Total Memory: " + FormatUtil.formatBytes(totalMemory) + "\n" +
                "Available Memory: " + FormatUtil.formatBytes(availableMemory) + "\n" +
                "Used Memory: " + FormatUtil.formatBytes(usedMemory);
    }
}
