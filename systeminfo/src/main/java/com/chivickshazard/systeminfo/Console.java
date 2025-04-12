package com.chivickshazard.systeminfo;

import java.util.Scanner;

import com.chivickshazard.systeminfo.services.Battery;
import com.chivickshazard.systeminfo.services.DeviceTime;
import com.chivickshazard.systeminfo.services.Memory;

public class Console {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // App logic
        System.out.println("Welcome to the application \nWhat do you want to see?");
        System.out.println("1. Date and Time");
        System.out.println("2. Power Status");
        System.out.println("3. Memory Status");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        System.out.println("");

        if (choice == 1) {
            Time();
        } else if (choice == 2) {
            Power();
        } else if (choice == 3) {
            Memory();
        }


        input.close();
        System.out.println("Thank you for your time!");
    }

    // For displaying time data
    static void Time() {
        System.out.println("Pick one: ");
        System.out.println("1. Date");
        System.out.println("2. Time");
        System.out.println("3. Date and Time");

        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        System.out.println("");

        if (choice == 1) {
            System.out.println(DeviceTime.getCurrentTime());
        } else if (choice == 2) {
            System.out.println(DeviceTime.getCurrentDate());
        } else if (choice == 3) {
            System.out.println(DeviceTime.getCurrentDate() + " " + DeviceTime.getCurrentTime());
        }
    }

    static void Power() {
        System.out.println("Pick one: ");
        System.out.println("1. Show Battery Info");
        System.out.println("2. Show Power Status");

        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        System.out.println("");

        if (choice == 1) {
            System.out.println(Battery.getBatteryInfo());
        } else if (choice == 2) {
            System.out.println(Battery.getChargeStatus());
        }
    }

    static void Memory() {
        System.out.println("1. Show RAM Info");

        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        System.out.println("");

        if (choice == 1) {
            System.out.println(Memory.getMemoryInfo());
        }
    }
}