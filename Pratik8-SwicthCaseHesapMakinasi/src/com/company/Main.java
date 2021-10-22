package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double s1, s2;
        int secim;
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        s1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        s2 = scan.nextInt();
        System.out.println("Yapmak istediğiniz işlemi seçiniz:\n1-)Toplama\n2-)Çıkarma\n3-)Bölme\n4-)Çarpma");
        System.out.print("Seçim:");
        secim = scan.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Sonuç:" + (s1 + s2));
                break;
            case 2:
                System.out.println("Sonuç:" + (s1 - s2));
                break;
            case 3:
                System.out.println("Sonuç:" + (s1 / s2));
                break;
            case 4:
                System.out.println("Sonuç:" + (s1 * s2));
                break;
            default:
                System.out.println("Hatalı bir giriş yaptınız !!!");
                break;
        }
    }
}
