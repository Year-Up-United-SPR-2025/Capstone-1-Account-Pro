package com.pluralsight;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Show current time once at the start
        //Remeber that if you see an a at the end of hh:mm it means am/pm depending on where you live
        LocalTime now = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("Current time: " + now.format(timeFormatter));

        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\nEnter transaction details:");

            System.out.print("Enter the Date (YYYY-MM-DD): ");
            String date = scanner.nextLine();

            System.out.print("Enter the Description: ");
            String description = scanner.nextLine();

            System.out.print("Add your Vendor: ");
            String vendor = scanner.nextLine();

            System.out.print("Enter the Amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();

            // Save to file
            Reader_Writer_Time.saveDeposit(date, description, vendor, amount);

            System.out.println("\nTransaction Added!");

            // Ask if user wants to add another transaction
            System.out.print("\nDo you want to add another transaction? (y/n): ");
            String answer = scanner.nextLine();

            if (!answer.equalsIgnoreCase("y")) {
                keepRunning = false; // exit loop
            }
        }

        // After finishing, display all transactions
        System.out.println("\nID   |Date     | Time    | Description              | Vendor           | Amount            ");
        Reader_Writer_Time.readDeposits();

        //Exit app
        ExitHandler exitHandler = new ExitHandler(scanner);
        exitHandler.waitForExit();
    }
}