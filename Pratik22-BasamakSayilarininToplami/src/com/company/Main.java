package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi,toplam = 0;

        System.out.print("Sayınızı giriniz:");
        sayi=scan.nextInt();

        while (sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }
        System.out.println("Basamak toplamı:"+toplam);
    }
}
