package com.pluralsight;

import java.io.*;
import java.util.*;

public class Ledger {
    private List<Transaction> transactions = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Ledger() {
        loadTransactionsFromCSV("transactions.csv");
    }

    public void showHome() {
        while (true) {
            System.out.println("\n=== Home Menu ===");
            System.out.println("D) Deposits");
            System.out.println("P) Payments");
            System.out.println("R) Reports");
            System.out.println("H) Home (Reload)");
            System.out.println("E) Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().toUpperCase();

            if (choice.equals("D")) {
                showDeposits();
            } else if (choice.equals("P")) {
                showPayments();
            } else if (choice.equals("R")) {
                showReports();
            } else if (choice.equals("H")) {
                System.out.println("Already at Home.");
            } else if (choice.equals("E")) {
                ExitHandler exitHandler = new ExitHandler(scanner);
                exitHandler.waitForExit();
            } else {
                System.out.println("Invalid input.");
            }
        }
    }

    private void showDeposits() {
        System.out.println("\n=== Deposits ===");
        for (Transaction t : transactions) {
            if (t.amount > 0) {
                System.out.println(t);
            }
        }
    }

    private void showPayments() {
        System.out.println("\n=== Payments ===");
        for (Transaction t : transactions) {
            if (t.amount < 0) {
                System.out.println(t);
            }
        }
    }

    private void showReports() {
        System.out.print("Enter vendor name to search: ");
        String vendor = scanner.nextLine().toLowerCase();
        System.out.println("\n=== Transactions Matching Vendor ===");
        for (Transaction t : transactions) {
            if (t.vendor.toLowerCase().contains(vendor)) {
                System.out.println(t);
            }
        }
    }

    private void loadTransactionsFromCSV(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String date = parts[0].trim();
                    String vendor = parts[1].trim();
                    double amount = Double.parseDouble(parts[2].trim());
                    transactions.add(new Transaction(date, vendor, amount));
                }
            }
        } catch (Exception e) {
            System.out.println("Failed to load transactions: " + e.getMessage());
        }
    }
}
