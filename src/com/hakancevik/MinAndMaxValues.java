package com.hakancevik;
// find the minimum and maximum value of the ArrayList.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinAndMaxValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int frontier;
        int i;
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("How many number you want to enter? >: ");
        frontier = scanner.nextInt();


        for (i = 1; i <= frontier; i++) {
            System.out.print("Number " + i + " :");
            int number = scanner.nextInt();
            list.add(number);
        }

        System.out.println("\nMax ---> " + Collections.max(list));
        System.out.println("Min ---> " + Collections.min(list));

    }
}

