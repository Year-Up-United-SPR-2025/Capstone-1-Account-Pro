package com.pluralsight;

public class Transaction {
    public String date;
    public String vendor;
    public double amount;

    public Transaction(String date, String vendor, double amount) {
        this.date = date;
        this.vendor = vendor;
        this.amount = amount;
    }
    
    public String toString() {
        return date + " | " + vendor + " | " + amount;
    }
}
