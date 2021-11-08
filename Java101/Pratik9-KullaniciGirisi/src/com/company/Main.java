package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kadi,sifre,secim,yeniSifre;
        System.out.print("Kullanıcı adınızı giriniz:");
        kadi = scan.next();
        System.out.print("Şifrenizi giriniz:");
        sifre = scan.next();

        if (kadi.equals("adana") && sifre.equals("demir")) {
            System.out.println("Başarılı giriş");
        }else {
            System.out.println("Hatalı giriş");
            System.out.print("Şifrenizi sıfırlama ister misiniz(E/H):");
            secim = scan.next();
            if (secim.toLowerCase().equals("e")){
                do {
                    System.out.print("Şifrenizi giriniz:");
                    yeniSifre = scan.next();
                    if ("demir".equals(yeniSifre)){
                        System.out.println("Eski şifre ile yeni şifreniz aynı olamaz !");
                    }else{
                        System.out.println("Şifreniz başarı ile değiştirildi");
                    }
                }while (yeniSifre.equals("demir"));
            }else if (secim.toLowerCase().equals("h")){
                System.out.println("Şifrenizi sıfırlamak istemediniz. Çıkış yapılıyor ...");
            }else {
                System.out.println("Hatalı bir giriş yaptınız. Çıkış yapılıyor ...");
            }
        }
    }
}
