package com.hakancevik;
// Program to check the given number is Armstrong or not
/*
        An n-digit number that is the sum of the nth powers of its digits is called an n-narcissistic number.
        It is also sometimes known as an Armstrong number, perfect digital invariant , or plus perfect number.
        1634 = 1^4 + 6^4 + 3^4 + 4^4 ( 4 --> number of steps)
        371 = 3^3 + 7^3 + 1^3 (3 --> number of steps))                                                                      */

import java.util.Scanner;
@SuppressWarnings("InfiniteLoopStatement")

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char checkMark = '\u2713';
        System.out.println("*********************************");
        System.out.println(" CHECK ARMSTRONG NUMBER.");
        System.out.println("*********************************");

        while (true) {
            System.out.println("_________________________________");
            System.out.print("\nEnter the number: ");
            int number = scanner.nextInt();

            if (isArmstrong(number)) {
                System.out.println(number + " ---> Armstrong Number " + checkMark);
            } else System.out.println(number + " ---> Not Armstrong Number " + "x");

        }
    }


    public static boolean isArmstrong(int number) {

        int mainNumb = number;
        int mainNumb1 = mainNumb;
        int numberOfSteps = 0;

        while (number > 0) {
            number = number / 10;
            numberOfSteps += 1;
        }

        int i;
        int stepValue;
        double sum = 0;

        for (i = 1; i <= numberOfSteps; i++) {
            stepValue = mainNumb % 10;
            sum = sum + (Math.pow(stepValue, numberOfSteps));
            mainNumb = mainNumb / 10;
        }


        return mainNumb1 == sum;


    }


}

