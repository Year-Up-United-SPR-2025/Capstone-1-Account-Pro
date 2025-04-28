package com.pluralsight;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Reader_and_Writer {
    private static String filePath;

    public Reader_and_Writer(String filePath) {
        this.filePath = filePath;
    }

    public static void saveDeposit(String name, String CredorDeb, double amount, String date, String time) {
        // Format: name|CredorDeb|amount|date
        String depositRecord = name + "|" + CredorDeb + "|" + amount + "|" + date + "|" + time;

        // Write to file
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(depositRecord + "\n");
            System.out.println("Deposit saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void Reader() {
        //Read from File
        System.out.println("Current contents of " + filePath + ":");
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}