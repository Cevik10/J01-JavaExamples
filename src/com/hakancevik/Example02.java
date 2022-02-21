package com.hakancevik;
// kullanıcıdan alınan iki değerin yerlerini değiştirin.

import java.util.Scanner;


public class Example02 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz:");
        int numb1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        int numb2=input.nextInt();
        System.out.println("Yer değiştiriliyor...");

        int temp;
        temp=numb1;
        numb1=numb2;
        numb2=temp;

        System.out.println("Birinci sayı --> "+numb1);
        System.out.println("İkinci sayı --> "+numb2);


    }
}
