package com.addition;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        // Declaring and initializing scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello user.");

        // Retrieving 1st number
        System.out.println("Please enter 1st number");
        final int number_1 = scanner.nextInt();

        // Retrieving 2nd number
        System.out.println("Please enter 2nd number");
        final int number_2 = scanner.nextInt();

        // Calculating
        final int addition = number_1 + number_2;

        // Output
        System.out.printf("You entered numbers: %d and %d.\nAddition is: %d", number_1, number_2, addition);
    }
}
