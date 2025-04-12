package com.chivickshazard.systeminfo.utils;

import java.text.DecimalFormat;

public class Data {
    private static final DecimalFormat df = new DecimalFormat("#.##");

    public static String Byte2MB(long data) {
        double convertedData = (double) data / Math.pow(1024, 2);
        return df.format(convertedData);
    }
    
    public static String Byte2GB(long data) {
        double convertedData = (double) data / Math.pow(1024, 3);
        return df.format(convertedData);
    }
}
