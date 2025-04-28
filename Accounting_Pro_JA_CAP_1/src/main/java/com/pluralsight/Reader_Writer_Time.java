package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Reader_Writer_Time {

    private static final String FILE_NAME = "transactions.csv";

    // Save a deposit record
    public static void saveDeposit(String date, String description, String vendor, double amount) {
        // Get current time
        LocalTime now = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        String time = now.format(timeFormatter);

        // Format: date|time|description|vendor|amount
        String depositRecord = date + "|" + time + "|" + description + "|" + vendor + "|" + amount;

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(depositRecord + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Read and display all deposit records
    public static void readDeposits() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each record
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}