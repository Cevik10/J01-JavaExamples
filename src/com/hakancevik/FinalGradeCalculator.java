package com.hakancevik;
// Midterm and Final Grade Calculator

import java.util.Scanner;
@SuppressWarnings("InfiniteLoopStatement")


public class FinalGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********************************************");
        System.out.println("       Midterm/Final Grade Calculator");
        System.out.println("********************************************\n");
        System.out.println("____________________________________________\n");

        while (true) {

            int midtermExam, finalExam;

            while (true){
                System.out.print("Midterm Exam: ");
                midtermExam = scanner.nextInt();
                if ((midtermExam >= 0) && (midtermExam <= 100)) break;
                else System.out.println("Enter value between 0-100.\n");
            }

            while (true) {
                System.out.print("Final Exam: ");
                finalExam = scanner.nextInt();
                if ((finalExam >= 0) && (finalExam <= 100)) break;
                else System.out.println("Enter value between 0-100.\n");

            }

            double result = (midtermExam * 0.3) + (finalExam * 0.7);

            System.out.println("Grade Point Average --> " + result);

            if (result >= 90 && result <= 100) {
                System.out.println("Letter Grade --> AA (successful)");
            } else if (result >= 80) {
                System.out.println("Letter Grade --> BA (successful)");
            } else if (result >= 70) {
                System.out.println("Letter Grade --> BB (successful)");
            } else if (result >= 65) {
                System.out.println("Letter Grade --> CB (successful)");
            } else if (result >= 60) {
                System.out.println("Letter Grade --> CC (successful)");
            } else if (result >= 50) {
                System.out.println("Letter Grade --> DD (conditional success)");
            } else if (result >= 30) {
                System.out.println("Letter Grade --> FD (unsuccessful)");
            } else {
                System.out.println("Letter Grade --> FF (unsuccessful)");
            }

            System.out.println("\n____________________________________________");


        }
    }
}
