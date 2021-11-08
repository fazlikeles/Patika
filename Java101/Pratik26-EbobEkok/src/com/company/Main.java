package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi1, sayi2,ebob = 0,ekok=0;

        System.out.print("Sayınızı giriniz:");
        sayi1 = scan.nextInt();
        System.out.print("Sayınızı giriniz:");
        sayi2 = scan.nextInt();

        int y = 1;
        while (y <= sayi1) {
            if (sayi1 % y == 0 && sayi2 % y == 0) {
                ebob = y;
            }
            y++;
        }
        System.out.println("EBOB: " + ebob);

        int a = 1;
        while (a <= sayi1 * sayi2) {
            if (a % sayi1 == 0 && a % sayi2 == 0) {
                ekok = a;
                break;
            }
            a++;
        }
        System.out.println("EKOK: " + ekok);
        

    }
}
