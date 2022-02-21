package com.hakancevik;
// n değeri alan ve n+n^2+n^3 döndüren foksiyon.


import java.util.Scanner;

public class Example13 {
    static double calculate(int n){
        return n=n+(n*n)+(n*n*n);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("______________________________________");
        System.out.println("f(x) = x + x^2 + x^3 fonksiyonu için;");
        System.out.print("x değerini giriniz: ");
        int x = input.nextInt();
        System.out.println("f(x) = "+calculate(x));
        System.out.println("______________________________________");


    }
}
