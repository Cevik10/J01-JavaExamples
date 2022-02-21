package com.hakancevik;
// vücut kitle indeksi hesaplama

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Boy (m):");
        double boy =input.nextDouble();

        System.out.print("Kilo (kg):");
        double kilo =input.nextDouble();

        double calculate = kilo/(boy*boy);

        if (calculate<18.5){
            System.out.println("VKİ ---> "+calculate+"  **(ZAYIF)**");
        }

        else if (calculate<25.5){
            System.out.println("VKİ ---> "+calculate+"  **(NORMAL)**");
        }
        else if (calculate<30){
            System.out.println("VKİ ---> "+calculate+"  **(KİLOLU)**");
        }
        else{
            System.out.println("VKİ ---> "+calculate+"  **(OBEZ)**");
        }

    }
}
