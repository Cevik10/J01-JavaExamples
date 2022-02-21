package com.hakancevik;
// iç içe döngü ile çarpım tablosu
public class Example11 {
    public static void main(String[] args){
        System.out.println("----------ÇARPIM TABLOSU----------");
        int i;
        int j;
        for (i=1;i<=10;i++){
            for (j=1;j<=10;j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println("***********");
            System.out.println("");
        }



    }
}
