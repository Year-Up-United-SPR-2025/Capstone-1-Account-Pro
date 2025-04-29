package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//This is added because I forgot to add the ledger commits to GitHub
public class LedgerTimeLIne {
//    private List<Transaction> transactions = new ArrayList<>();
//    private Scanner scanner = new Scanner(System.in);
//
//    public Ledger() {
//        loadTransactionsFromCSV("transactions.csv");
//    }

//    //HomeScreen
//    public void showHome() {
//        while (true) {
//            System.out.println("\n=== Home Menu ===");
//            System.out.println("D) Deposits");
//            System.out.println("P) Payments");
//            System.out.println("R) Reports");
//            System.out.println("H) Home (Reload)");
//            System.out.println("E) Exit");
//            System.out.print("Enter your choice: ");
//            String choice = scanner.nextLine().toUpperCase();
//
//            if (choice.equals("D")) {
//                showDeposits();
//            } else if (choice.equals("P")) {
//                showPayments();
//            } else if (choice.equals("R")) {
//                showReports();
//            } else if (choice.equals("H")) {
//                System.out.println("Already at Home.");
//            } else if (choice.equals("E")) {
//                ExitHandler exitHandler = new ExitHandler(scanner);
//                exitHandler.waitForExit();
//            } else {
//                System.out.println("Invalid input.");
//            }
//        }
//    }
////Deposits
//private void showDeposits() {
//    System.out.println("\n=== Deposits ===");
//    for (Transaction t : transactions) {
//        if (t.amount > 0) {
//            System.out.println(t);
//        }
//    }
//}
//
//    //Payments
//    private void showPayments() {
//        System.out.println("\n=== Payments ===");
//        for (Transaction t : transactions) {
//            if (t.amount < 0) {
//                System.out.println(t);
//            }
//        }
//    }
//
//    //Show Reports
//    private void showReports() {
//        System.out.print("Enter vendor name to search: ");
//        String vendor = scanner.nextLine().toLowerCase();
//        System.out.println("\n=== Transactions Matching Vendor ===");
//        for (Transaction t : transactions) {
//            if (t.vendor.toLowerCase().contains(vendor)) {
//                System.out.println(t);
//            }
//        }
//    }

}
