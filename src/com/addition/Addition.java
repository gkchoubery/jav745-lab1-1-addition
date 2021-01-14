package com.addition;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello user.");

        System.out.println("Please enter 1st number");
        final int number_1 = scanner.nextInt();

        System.out.println("Please enter 2nd number");
        final int number_2 = scanner.nextInt();

        final int addition = number_1 + number_2;

        System.out.printf("You entered numbers: %d and %d.\nAddition is: %d", number_1, number_2, addition);
    }
}
