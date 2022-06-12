package com.hakancevik;
// greatest common divisor and least common multiple calculator.

import java.util.Scanner;


public class GcdAndLcmCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************");
        System.out.println("1 -> GCD");
        System.out.println("2 -> LCM");
        System.out.println("3 -> Exit");
        System.out.println("*******************");

        int number1, number2;

        while (true) {
            System.out.println("_______________________________");
            System.out.print("Please select the operation: ");
            int process = scanner.nextInt();
            System.out.println("_______________________________");

            switch (process) {
                case 1:
                    System.out.println("for GCD (a,b);");
                    System.out.print("a value: ");
                    number1 = scanner.nextInt();
                    System.out.print("b value: ");
                    number2 = scanner.nextInt();

                    System.out.println("GCD(" + number1 + ", " + number2 + ")" + " ---> " + GCD(number1, number2));
                    break;

                case 2:
                    System.out.println("for LCM (a,b);");
                    System.out.print("a value: ");
                    number1 = scanner.nextInt();
                    System.out.print("b value: ");
                    number2 = scanner.nextInt();

                    System.out.println("LCM(" + number1 + ", " + number2 + ")" + " ---> " + LCM(number1, number2));
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("please select a valid operation!");
                    break;
            }


        }


    }


    public static int GCD(int number1, int number2) {

        int i;
        number1 = Math.abs(number1); // for negative numbers.
        number2 = Math.abs(number2);
        if (number1 > number2) {
            for (i = number2; i > 0; i--) {
                if ((number1 % i == 0) && (number2 % i == 0)) break;
            }
            return i;
        } else if (number2 > number1) {
            for (i = number1; i > 0; i--) {
                if ((number1 % i == 0) && (number2 % i == 0)) break;
            }

            return i;
        }

        return number1; // GCD (number1 == number2)
    }

    public static int LCM(int number1, int number2) {

        return (number1 * number2) / GCD(number1, number2);

    }


}
