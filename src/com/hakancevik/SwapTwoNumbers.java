package com.hakancevik;
// Swap two numbers without third variable.

import java.util.Scanner;


public class SwapTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("_____________________________");
        System.out.println("swapping...");
        System.out.println("_____________________________");

        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;


        System.out.println("First number --> " + firstNumber);
        System.out.println("Second number --> " + secondNumber);


    }
}
