package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi,toplam=0;

        do {
            System.out.print("Sayınızı giriniz(Çıkmak için tek sayı girebilirsiniz):");
            sayi = scan.nextInt();
            if (sayi%2==0){
                toplam+=sayi;
            }
        }while (sayi%2==0);
        System.out.println("Girilen çift sayıların toplamı="+toplam);

    }
}
