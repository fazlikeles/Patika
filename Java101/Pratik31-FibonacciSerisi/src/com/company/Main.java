package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int elemanSayisi,sayi=0,tempSayi=1,toplam;


        System.out.print("Fibonacci serisi kaç elemanlı olsun:");
        elemanSayisi = scan.nextInt();

        System.out.print(sayi+" "+tempSayi);

        for (int x = 2; x <= elemanSayisi; x++) {

            toplam=sayi+tempSayi;
            System.out.print(" "+toplam);

            sayi=tempSayi;
            tempSayi=toplam;
        }
    }
}
