package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int elemanSayisi,eleman,tempSayi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Diziniz kaç elemanlı olacak:");
        elemanSayisi = scan.nextInt();
        int[] dizi = new int[elemanSayisi];
        for (int i=0;i<elemanSayisi;i++){
            System.out.print("Dizinin "+ (i+1)+". elemanını giriniz:");
            eleman = scan.nextInt();
            dizi[i] = eleman;
        }
        for (int i=0;i<dizi.length;i++){
            for (int j=i+1;j<dizi.length;j++){
                if (dizi[j]<dizi[i]){
                    tempSayi = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = tempSayi;
                }
            }
        }
        System.out.print("Sıralama: ");
        for (int e:dizi){
            System.out.print(e+" ");
        }
    }
}
