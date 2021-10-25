package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int basamakSayisi;
        System.out.print("Basamak sayısını giriniz:");
        basamakSayisi = scan.nextInt();

        for (int i = 0; i < basamakSayisi; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * basamakSayisi - 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
