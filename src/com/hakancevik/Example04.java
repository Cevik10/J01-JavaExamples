package com.hakancevik;
// kullanıcıdan alınan 5 sayıdan en büyüğünü bulma

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayıyı giriniz: ");
        int max=input.nextInt();

        for(int i=2;i<=5;i++){
            System.out.print(i+".Sayıyı giriniz: ");
            int sayi=input.nextInt();
            if (sayi>max){
                max=sayi;
            }
        }

        System.out.println("Girilen sayılardan en büyüğü ---> "+max);

    }
}
