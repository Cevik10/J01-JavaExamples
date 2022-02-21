package com.hakancevik;
//Switch-case yapısı ile basit hesap makinesi

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("******************");
        System.out.println("1->TOPLAMA");
        System.out.println("2->ÇIKARMA");
        System.out.println("3->ÇARPMA");
        System.out.println("4->BÖLME");
        System.out.println("******************\n");


        System.out.print("Lütfen İşlemi Seçiniz: ");
        int chose = input.nextInt();



        switch (chose) {

            case 1:
                    System.out.print("1.Sayı: ");
                    double num1 = input.nextDouble();
                    System.out.print("2.Sayı: ");
                    double num2 = input.nextDouble();
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;

            case 2:
                System.out.print("1.Sayı: ");
                num1 = input.nextDouble();
                System.out.print("2.Sayı: ");
                num2 = input.nextDouble();
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;

            case 3:
                System.out.print("1.Sayı: ");
                num1 = input.nextDouble();
                System.out.print("2.Sayı: ");
                num2 = input.nextDouble();
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                break;


            case 4:
                System.out.print("1.Sayı: ");
                num1 = input.nextDouble();
                System.out.print("2.Sayı: ");
                num2 = input.nextDouble();
                System.out.print(num1 + " / " + num2 + " = " + (num1 / num2));
                break;

            default:
                System.out.println("Lütfen,geçerli bir işlem seçiniz.");
                break;


        }

    }
}