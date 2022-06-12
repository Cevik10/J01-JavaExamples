package com.hakancevik;
// For a right-angled triangle the sum of the squares on the other two shorter sides equals the hypotenuse squared.

import java.util.Scanner;
@SuppressWarnings("InfiniteLoopStatement")

public class CalculateHypotenuse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSide, secondSide;
        double hypotenuse;

        while (true) {

            System.out.println("__________________________________");
            System.out.println("For a right-angled triangle;");

            System.out.print("first side: ");
            firstSide = scanner.nextInt();
            System.out.print("second side: ");
            secondSide = scanner.nextInt();

            hypotenuse = Math.sqrt((firstSide * firstSide) + (secondSide * secondSide));
            System.out.println("The Hypotenuse value is " + hypotenuse);
            System.out.println("__________________________________");
        }


    }
}
