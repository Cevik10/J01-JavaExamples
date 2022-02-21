package com.hakancevik;
// Dik üçgen için hipotenüs hesaplama

import java.util.Scanner;

public class Example03 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int a;
        int b;
        double hipo;
        System.out.println("Dik üçgen için;");
        System.out.print("birinci kenar: ");
        a=input.nextInt();
        System.out.print("ikinci kenar: ");
        b=input.nextInt();

        hipo=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs değeri = "+hipo);

    }
}
