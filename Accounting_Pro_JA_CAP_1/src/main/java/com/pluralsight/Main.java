package com.pluralsight;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Start the process from here
        startTransactionProcess(new Scanner(System.in));
    }

    public static void startTransactionProcess(Scanner scanner) {
        // Show current time once at the start
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

            // Save to file (assuming the save method exists)
            Reader_Writer_Time.saveDeposit(date, description, vendor, amount);

            System.out.println("\nTransaction Added!");

            // Ask if user wants to add another transaction
            System.out.print("\nDo you want to add another transaction? (y/n): ");
            String answer = scanner.nextLine();

            if (!answer.equalsIgnoreCase("y")) {
                keepRunning = false; // exit loop
            }
        }

        // After finishing, display all transactions (assuming the read method exists)
        Reader_Writer_Time.readDeposits();

        // Return to the Ledger home menu after finishing
        Ledger ledger = new Ledger();
        ledger.showHome();
    }
}