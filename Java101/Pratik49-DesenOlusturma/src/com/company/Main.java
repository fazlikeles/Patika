package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        System.out.print("N sayısı:");
        sayi = scan.nextInt();
        System.out.print("Çıktısı : ");
        int k=sayi;
        while(k>-5){
            System.out.print(k+" ");
            k-=5;
        }
        k+=5;
        while (k<sayi){
            System.out.print((k+=5)+" ");
        }

    }
}
