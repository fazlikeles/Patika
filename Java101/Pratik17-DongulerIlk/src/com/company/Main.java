package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi, sayac = 0, toplam = 0;
        double ortalama = 0;

        System.out.print("Sayınızı giriniz:");
        sayi = scan.nextInt();
        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayac++;
            }
        }
        try {
            ortalama += toplam / sayac;
            System.out.println("Ortalama=" + ortalama);
        } catch (ArithmeticException e) {
            System.out.println("Sayınız 3 e veya 4 e tam bölünememektedir.");
        }

    }

}
