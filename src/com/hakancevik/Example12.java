package com.hakancevik;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Kullanıcı Girişine Hoşgeldiniz!\n");

        String sys_nickname="cevik10";
        String sys_password="sokratesdiyalektiği";
        int kalanHak=3;

        while (true) {
            System.out.println("_____________________");
            System.out.print("Kullanıcı adı: ");
            String nickname = input.nextLine();
            System.out.print("Parola: ");
            String password = input.nextLine();


            if (kalanHak==0){
                System.out.println("BAŞARISIZ GİRİŞ! e-postanıza kurtarma kodu gönderilmiştir.");
                System.out.println("_____________________");
                break;
            }

            else if ((sys_nickname.equals(nickname)) && (sys_password.equals(password))) {
                System.out.println("Başarı ile giriş yapılmıştır.");
                System.out.println("_____________________");
                break;
            }
            else {
                System.out.println("Kullanıcı adı veya Şifre Hatalı!");
                System.out.println("Kalan giriş hakkı --> "+kalanHak);
                System.out.println("_____________________");
                kalanHak--;
            }
        }

    }
}
