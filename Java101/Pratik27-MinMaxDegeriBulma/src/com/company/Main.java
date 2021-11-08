package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int adet,kucukSayi=Integer.MAX_VALUE,buyukSayi=Integer.MIN_VALUE,sayac=0,tempSayi;

        System.out.print("Kaç tane sayı gireceksiniz:");
        adet=scan.nextInt();

        if (adet>=1){
            for (int i=1;i<=adet;i++){
                System.out.print(i+". Sayıyı giriniz:");
                tempSayi = scan.nextInt();
                if (tempSayi>buyukSayi){
                    buyukSayi=tempSayi;
                }else if (tempSayi<kucukSayi){
                    kucukSayi=tempSayi;
                }
            }
        }else {
            System.out.println("Girilen adet sayısı 1 den küçük olamaz !!");
        }

        System.out.println("En büyük sayı:"+buyukSayi);
        System.out.println("En küçük sayı:"+kucukSayi);

    }
}
