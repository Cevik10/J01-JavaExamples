package com.hakancevik;
// girilen sayının rakamları toplamı hesaplama
import java.util.Scanner;

public class Example08 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("\nRakamlarının toplamını bulmak istediğiniz sayı --> ");
        int numb=input.nextInt();
        int toplam=0;
        int birler_bas;

        while (numb>0){

            birler_bas=numb % 10;
            toplam+=birler_bas;
            numb=numb/10;

        }
        System.out.println("Rakamlar toplamı = "+toplam);

    }
}
