package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Tutarı giriniz:");
        int tutar = scan.nextInt();
        System.out.println("Kdvsiz Fiyat:"+tutar);
        if (tutar>0){
            System.out.println("Kdvli Fiyat:"+kdvHesapla(tutar));
            System.out.println("Kdv tutarı:" + (kdvHesapla(tutar)-tutar));
        }else {
            System.out.println("Tutar 0 dan küçük olamaz !");
        }



    }


    static double kdvHesapla(int tutar){
        if (tutar>0 && tutar <=1000){
            return tutar * 1.18;
        }else {
            return tutar*1.08;
        }
    }
}
