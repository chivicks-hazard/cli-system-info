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
        String choice = input.nextLine();

        System.out.println("");

        Action(input, choice);

        input.close();
        System.out.println("Thank you for your time!");
    }

    static void Action (Scanner scanner, String choice) {
        while(!choice.equalsIgnoreCase("no")) {
            switch (choice) {
                case "1":
                    Time();
                    break;

                case "2":
                    Power();
                    break;

                case "3":
                    Memory();
                    break;
            
                default:
                    break;
            }

            System.out.println("Do you still want to convert? Type 'no' to exit.");
            choice = input.nextLine();
            if (!choice.equalsIgnoreCase("no")) {
                System.out.println("Select an option: ");
                System.out.println("1. Date and Time");
                System.out.println("2. Power Status");
                System.out.println("3. Memory Status");
                choice = input.nextLine();
            }
        }

        System.out.println("Thank you for using our application :)");
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