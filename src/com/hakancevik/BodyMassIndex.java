package com.hakancevik;
// Calculate your Body Mass Index (BMI) at.

import java.util.Scanner;
@SuppressWarnings("InfiniteLoopStatement")

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("__________________________________________________");
            System.out.print("Height(m): ");
            float height = scanner.nextFloat();

            System.out.print("Weigh(kg): ");
            float weight = scanner.nextFloat();

            float calculate = weight / (height * height);

            if (calculate < 18.5) {
                System.out.println("Your BMI ---> " + calculate + "  **(UNDERWEIGHT)**");
            } else if (calculate < 25.5) {
                System.out.println("Your BMI ---> " + calculate + "  **(NORMAL)**");
            } else if (calculate < 30) {
                System.out.println("Your BMI ---> " + calculate + "  **(OVERWEIGHT)**");
            } else {
                System.out.println("Your BMI ---> " + calculate + "  **(OBESE)**");
            }

        }

    }
}

