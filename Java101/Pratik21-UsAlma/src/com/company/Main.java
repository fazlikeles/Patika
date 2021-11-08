package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int sayi,us;
        int toplam=1;
        System.out.print("Taban sayısını giriniz:");
        sayi = scan.nextInt();
        System.out.print("Us sayısını giriniz:");
        us = scan.nextInt();

        for (int i=1; i<=us;i++){
            toplam*=sayi;
        }
        System.out.println("Toplam:"+toplam);
    }
}
