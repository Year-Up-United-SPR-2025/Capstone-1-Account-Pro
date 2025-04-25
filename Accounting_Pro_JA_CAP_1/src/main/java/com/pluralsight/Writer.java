package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //To Read and Write Data in a File
        try {
            FileWriter writer = new FileWriter("transactions.csv");
            writer.write("date|time|description|vendor|amount");
            writer.close();
            System.out.println("CSV file written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}