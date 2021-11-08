package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double elemanSayisi,eleman;
        double ortalama,toplam=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz:");
        elemanSayisi = scan.nextDouble();
        double[]dizi = new double[(int) elemanSayisi];
        for (int i=0; i<dizi.length;i++){
            System.out.print("Dizinin"+(i+1)+". değerini giriniz:");
            eleman = scan.nextInt();
            dizi[i] = eleman;
            toplam+=(1/eleman);
        }
        for (double e:dizi){
            System.out.print(e+" ");
        }
        ortalama= (dizi.length/toplam);

        System.out.println("Harmonik ortalama:"+ortalama);
    }
}
