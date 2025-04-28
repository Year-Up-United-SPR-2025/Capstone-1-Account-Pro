package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Reader_Writer_Time {
    // CSV file name
    private static final String FILE_NAME = "transactions.csv";

    public static void saveDeposit(String name, String CredorDeb, double amount, String date) {
        // Get current time
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String time = now.format(formatter); // Get time in HH:mm:ss format

        // Format: name|CredorDeb|amount|date|time
        String depositRecord = name + "," + CredorDeb + "," + amount + "," + date + "," + time + "\n";

        // Write the deposit record to the CSV file
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {  // Append mode
            writer.write(depositRecord);  // Write the log entry to the file
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}