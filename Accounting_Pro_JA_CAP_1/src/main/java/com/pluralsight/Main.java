package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Deposit
        System.out.println("What is your Name: ");
        String name = scanner.nextLine();

        System.out.println("Card Type Debit or Credit: ");
        String CredorDeb = scanner.nextLine();

        System.out.println("Enter the deposit amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter date (YYYY-MM-DD):");
        String date = scanner.nextLine();

        // Format: name,amount,date
        String depositRecord = name + "|" + CredorDeb + "|" + amount + "|" + date;

        //Write to file
        try (FileWriter writer = new FileWriter("transactions.csv", true)) {
            writer.write(depositRecord + "\n");
            System.out.println("Deposit saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read from the file
        System.out.println("Current contents of transactions.csv:");
        try (BufferedReader reader = new BufferedReader(new FileReader("transactions.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}

