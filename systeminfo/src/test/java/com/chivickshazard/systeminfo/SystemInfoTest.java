package com.chivickshazard.systeminfo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import oshi.SystemInfo;

public class SystemInfoTest {
    SystemInfo systemInfo = new SystemInfo();

    @Test
    public void testSystemInfo() {
        Assertions.assertNotNull(systemInfo);
    }
}
