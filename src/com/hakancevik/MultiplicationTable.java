package com.hakancevik;
// multiplication table up to 10x

public class MultiplicationTable {

    public static void main(String[] args) {
        System.out.println("----------MULTIPLICATION TABLE----------");
        System.out.println("***************\n");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println("\n***************");
            System.out.println();
        }


    }
}
