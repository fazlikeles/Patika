package com.company;

import java.util.Scanner;

public class Main {

    static boolean isPrime(int x, int i) {

        if (x == i || x == 1)
            return true;
        if (x % i == 0)
            return false;
        return isPrime(x, i + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi,sayi2;
        System.out.print("Sayınızı giriniz:");
        sayi = scan.nextInt();
        sayi2=2;

        System.out.println(isPrime(sayi,sayi2)?"Asal":"Asal değil");
    }
}
