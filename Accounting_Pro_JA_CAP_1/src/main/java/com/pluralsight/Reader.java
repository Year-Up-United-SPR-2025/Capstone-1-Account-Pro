package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        try {
            File file = new File("transactions.csv");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
            }
            scanner.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
