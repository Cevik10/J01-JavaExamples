package com.hakancevik;
// prime number

import java.util.Scanner;

@SuppressWarnings("InfiniteLoopStatement")

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println("*********************************");
        System.out.println("       CHECK PRIME NUMBER");
        System.out.println("*********************************");


        while (true) {

            System.out.println("_______________________________");
            System.out.print("Enter a number: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();


            if (isPrimeNumber(number)) {
                System.out.println(number + "---> Prime Number");
            } else {
                System.out.println(number + "---> Not Prime Number");
            }

        }
    }

    public static boolean isPrimeNumber(int number) {

        if (number == 0 || number == 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        if (number < 0) return false;

        int v = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < v; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }


}


