package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reader_Writer_Time readerAndWriter = new Reader_Writer_Time();


        System.out.println("Enter date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        System.out.println("What is your Name: ");
        String name = scanner.nextLine();
        //
        System.out.println("Card Type Debit or Credit: ");
        String CredorDeb = scanner.nextLine();

        //Deposit
        System.out.println("Enter the deposit amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        //Ledger
        System.out.println("Ledger Opening Now............");
        String ledger = scanner.nextLine();

        //Calls Reader Writer Time Class
//        Reader_Writer_Time.saveDeposit();

        //Exit app
        ExitHandler exitHandler = new ExitHandler(scanner);
        exitHandler.waitForExit();
    }
}

