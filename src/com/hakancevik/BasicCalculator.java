package com.hakancevik;
// Simple calculator with switch-case.

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int operation;

        System.out.println("******************");
        System.out.println("1-> Addition");
        System.out.println("2-> Subtraction");
        System.out.println("3-> Multiplication");
        System.out.println("4-> Division");
        System.out.println("5-> Exit");
        System.out.println("******************\n");


        while (true) {

            while (true) {

                System.out.println("_______________________________");
                System.out.print("Please select the operation: ");
                operation = scanner.nextInt();
                if (operation > 0 && operation <= 5) break;
                else System.out.print("Please select a valid operation!\n");


            }


            if (operation == 5) {
                System.out.println("exiting..");
                System.exit(0);
            }


            System.out.print("Number 1: ");
            double num1 = scanner.nextDouble();
            System.out.print("Number 2: ");
            double num2 = scanner.nextDouble();

            switch (operation) {
                case 1 -> System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                case 2 -> System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                case 3 -> System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                case 4 -> System.out.print(num1 + " / " + num2 + " = " + (num1 / num2));
            }

        }


    }
}
