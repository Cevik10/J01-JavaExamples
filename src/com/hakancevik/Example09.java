package com.hakancevik;
//basit para çekme yatırma programı

import java.util.Scanner;

public class Example09 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("***************************");
        System.out.println("CEVIKBANK'A HOŞGELDİNİZ!");
        System.out.println("***************************\n");
        System.out.println( "1 --> Bakiye Sorgulama\n" +
                            "2 --> Para Çekme\n" +
                            "3 --> Para Yatırma\n" +
                            "4 --> Çıkış\n");
        int bakiye=2720;
        while (true){

            System.out.println("_________________________________");
            System.out.print("İşlem seçiniz:");
            int chose = input.nextInt();
            if (chose==1){
                System.out.println("Merhaba,");
                System.out.println("Mevcut Bakiyeniz : "+bakiye+" TL");
            }

            else if (chose==2){
                System.out.print("Kaç TL çekmek istiyorsunuz? >:");
                int cekilenTutar=input.nextInt();
                if (bakiye>=cekilenTutar){
                    System.out.println("Çekilen tutar : "+cekilenTutar+ " TL");
                    bakiye-=cekilenTutar;
                }
                else {
                    System.out.println("Yetersiz Bakiye!");
                    System.out.println(bakiye+" TL bakiyeniz bulunmaktadır.");
                }
            }
            else if (chose==3){
                System.out.println("Yatırmak istediğiniz tutar : ");
                int yatirilanTutar=input.nextInt();
                System.out.println(yatirilanTutar+" TL hesabınıza yatırılmıştır.");
                bakiye+=yatirilanTutar;
            }
            else if (chose==4){
                System.out.println("İyi Günler Dileriz...");
                break;
            }
            else {
                System.out.println("HATALI İŞLEM!");
                System.out.println("Lütfen doğru bir işlem seçiniz.");
            }
        }


    }
}
