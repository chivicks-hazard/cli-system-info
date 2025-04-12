package com.chivickshazard.systeminfo.utils;

public class Time {
    public static double Sec2Min(double time) {
        time = ((time - Sec2HR(time)) / 60);
        return time > 60 ? (int) Math.round(time) - 60 :
                time > 120 ? (int) Math.round(time) - 120 :
                (int) Math.round(time);
    }

    public static int Sec2HR(double time) {
        time = time / Math.pow(60, 2);
        return (int) Math.round(time);
    }
}
