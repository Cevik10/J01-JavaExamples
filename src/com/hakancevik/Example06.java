package com.hakancevik;
// vize ve final notu alıp harf değerlendirmesini bulunuz.

import java.util.Scanner;


public class Example06 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("NOT HESAPLAMA PROGRAMI");
        System.out.println("___________________________\n");

        System.out.print("Vize Notunuzu Giriniz: ");
        int exam1 = input.nextInt();

        System.out.print("Final Notunuzu Giriniz: ");
        int final1 = input.nextInt();

        double result=(exam1*0.3)+(final1*0.7);

        System.out.println("Ortalama: "+result);

        if (result>=90 && result<=100){
            System.out.println("Harf Notu: AA (BAŞARILI)");
        }
        else if (result>=80){
            System.out.println("Harf Notu: BA (BAŞARILI)");
        }
        else if (result>=70){
            System.out.println("Harf Notu: BB (BAŞARILI)");
        }
        else if (result>=65){
            System.out.println("Harf Notu: CB (BAŞARILI)");
        }
        else if (result>=60){
            System.out.println("Harf Notu: CC (BAŞARILI)");
        }
        else if (result>=50){
            System.out.println("Harf Notu: DD (KOŞULLU BAŞARILI)");
        }
        else if (result>=30){
            System.out.println("Harf Notu: FD (BAŞARISIZ)");
        }
        else {
            System.out.println("Harf Notu: FF (BAŞARISIZ)");
        }









    }
}
