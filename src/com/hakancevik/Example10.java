package com.hakancevik;
// armstrong sayısı sorgulama programı.
/*
        Girilen bir sayının armstrong sayısını olup olmadığını bulmaya çalışın.
        Örneğin, 4 basamaklı bir sayının armstrong sayısı olması için şu şartı sağlaması gerekmektedir.
        1634 = 1^4 + 6^4 + 3^4 + 4^4 (Buradaki 4 basamak sayısı)
        371 = 3^3 + 7^3 + 1^3 (Buradaki 3 basamak sayısı)  */
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("*********************************");
        System.out.println(" ARMSTRONG SAYISI BULMA PROGRAMI");
        System.out.println("*********************************");
       while (true) {
           System.out.println("______________________________________________");
           System.out.print("\nSorgulamak istediğiniz sayıyı giriniz: ");
           long numb = input.nextLong();
           long mainNumb = numb;
           long mainNumb1 = mainNumb;
           int basamakSayisi = 0;
           while (numb > 0) {
               numb = numb / 10;
               basamakSayisi += 1;
           }
           int i;
           long basamakDegeri = 0;
           double sum = 0;
           for (i = 1; i <= basamakSayisi; i++) {
               basamakDegeri = mainNumb % 10;
               sum = sum + (Math.pow(basamakDegeri, basamakSayisi));
               mainNumb = mainNumb / 10;
           }


           if (mainNumb1 == sum) {
               System.out.println(mainNumb1 + " ---> ARMSTRONG Sayısıdır.\n");
           } else {
               System.out.println(mainNumb1 + " ---> ARMSTRONG Sayısı Değildir!\n");
           }

       }
    }
}
