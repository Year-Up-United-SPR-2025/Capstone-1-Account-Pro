package com.pluralsight;

import java.time.LocalTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.io.FileWriter;
import java.io.IOException;

public class Time {
    private static final String FILE_NAME = "transactions.csv";

    public void run() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");  // Only hours, minutes. am/pm

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {  // Append to the file
            while (true) {
                String input = scanner.nextLine();
                if (!input.isEmpty()) {  // Only log if the user entered something
                    LocalTime now = LocalTime.now();  // Get current time (without date)
                    String timeStamp = now.format(formatter);
                    String logEntry = "You entered: \"" + input + "\" at " + timeStamp + "\n";
                    writer.write(logEntry);  // Write the log entry to the file
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}