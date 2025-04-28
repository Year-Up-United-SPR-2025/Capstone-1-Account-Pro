package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reader_and_Writer readerAndWriter = new Reader_and_Writer("transactions.csv");

        //Deposit
        System.out.println("What is your Name: ");
        String name = scanner.nextLine();

        System.out.println("Card Type Debit or Credit: ");
        String CredorDeb = scanner.nextLine();

        System.out.println("Enter the deposit amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter date (YYYY-MM-DD):");
        String date = scanner.nextLine();

        //Ledger
        System.out.println("Ledger Opening Now............");

        //Calls Reader and Writer Class
        Reader_and_Writer.saveDeposit(name, CredorDeb, amount, date);
        Reader_and_Writer.Reader();

        //Exit app
        ExitHandler exitHandler = new ExitHandler(scanner);
        exitHandler.waitForExit();
    }
}

