package com.hakancevik;
// factorial calculation

import java.util.Scanner;
@SuppressWarnings("InfiniteLoopStatement")

public class FactorialCalculation {

    public static long factorial(int number) {

        long factorial = 1;

        if (number >= 0) {
            int i;

            for (i = 2; i <= number; i++) {
                factorial *= i;
            }
        }

        return factorial;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("\nEnter the number, you want to calculate the factorial of --> :");
            int scanNumber = scanner.nextInt();

            if (scanNumber >= 0) {
                System.out.println(scanNumber + "! = " + factorial(scanNumber));
            }

            else {
                System.out.println("Please enter a non-negative number.");
            }
            System.out.println("_________________________________________________________");

        }



    }
}
