package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Home Screen

        //Deposit
        System.out.println("What is your Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the deposit amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter date (YYYY-MM-DD):");
        String date = scanner.nextLine();

        // Format: name,amount,date
        String depositRecord = name + "," + amount + "," + date;

        try (FileWriter writer = new FileWriter("transactions.csv", true)) {
            writer.write(depositRecord + "\n");
            System.out.println("Deposit saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

