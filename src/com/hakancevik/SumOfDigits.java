package com.hakancevik;
// calculate sum of digits program

import java.util.Scanner;

@SuppressWarnings("InfiniteLoopStatement")

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("************************");
        System.out.println("Sum of digits program");
        System.out.println("************************");


        while (true) {
            int number;
            while (true) {
                System.out.println("________________________");
                System.out.print("\nEnter a number --> ");
                number = scanner.nextInt();
                if (number >= 0) break;
                else System.out.println("Please enter a positive number.");
            }

            int sum = 0;
            int precedingDigit;

            while (number > 0) {

                precedingDigit = number % 10;
                sum += precedingDigit;
                number = number / 10;

            }
            System.out.println("Sum of digits = " + sum);

        }
    }
}
