package com.chivickshazard.systeminfo;

import oshi.SystemInfo;

public class SystemInfoApp {
    public static void main(String[] args) {
        SystemInfo systemInfo = new SystemInfo();

        System.out.println(systemInfo.getHardware().getNetworkIFs());
    }
}