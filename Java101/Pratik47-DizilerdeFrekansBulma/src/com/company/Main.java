package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int elemanSayisi, eleman,sayac=0;
        System.out.print("Diziniz kaç elemanlı olsun:");
        elemanSayisi = scan.nextInt();
        int[] dizi = new int[elemanSayisi];
        for (int i=0;i<elemanSayisi;i++){
            System.out.print((i+1)+". elemanı giriniz:");
            eleman = scan.nextInt();
            dizi[i] = eleman;
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    for (int k = 0; k < i; k++) {
                        if (dizi[k] == dizi[i]) {
                            sayac = -1;
                        }
                    }
                    sayac++;
                }
            }

            if (sayac != 0) {
                System.out.println(dizi[i]+" sayısı "+sayac+" kere takrarlandı");
            }
            sayac = 0;
        }
    }
}
