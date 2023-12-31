package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String input;
        Scanner userInput = new Scanner(System.in);
        System.out.println("what bedtime story would you like to read? ");
        System.out.println("Goldilocks");
        System.out.println("Hansel and Gretel");
        System.out.println("Mary had a little lamb");
        String storyBook = userInput.nextLine();


        FileInputStream fis;

        if (storyBook.equalsIgnoreCase("Goldilocks")) {

            try {
                fis = new FileInputStream("src/main/resources/goldilocks.txt");
                Scanner scanner = new Scanner(fis);

                while (scanner.hasNextLine()) {
                    input = scanner.nextLine();
                    System.out.println(input);
                }
                scanner.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);

            }

        }
        else if(storyBook.equalsIgnoreCase("Hansel and Gretel")){

            try {
                fis = new FileInputStream("src/main/resources/hansel_and_gretel.txt");
                Scanner scanner = new Scanner(fis);

                while (scanner.hasNextLine()) {
                    input = scanner.nextLine();
                    System.out.println(input);
                }
                scanner.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);

            }

        }
        else if(storyBook.equalsIgnoreCase("Mary had a little lamb")){
            try {
                fis = new FileInputStream("src/main/resources/mary_had_a_little_lamb.txt");
                Scanner scanner = new Scanner(fis);

                while (scanner.hasNextLine()) {
                    input = scanner.nextLine();
                    System.out.println(input);
                }
                scanner.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);

            }
        }
        
    }
}
