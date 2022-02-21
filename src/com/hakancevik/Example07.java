package com.hakancevik;
// faktöriyel hesaplama

import java.util.Scanner;


public class Example07 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("\nFaktöriyelini hesaplamak istediğiniz sayıyı giriniz --> ");
        int numb= input.nextInt();
        if (numb>=0) {
            long fact = 1;
            int i;

            for (i = 2; i <= numb; i++) {
                fact = fact * i;
            }
            System.out.println(numb + "! = " + fact);
        }
        else System.out.println("Lütfen pozitif tam sayı giriniz.");

    }
}
