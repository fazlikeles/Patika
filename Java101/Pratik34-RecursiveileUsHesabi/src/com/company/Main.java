package com.company;

import java.util.Scanner;

public class Main {
    static int recursivePower(int x, int y) {
        if (x == 1)
            return 1;
        else if (y == 0)
            return 1;
        else
            return x * recursivePower(x, y - 1);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int taban,us;
        System.out.print("Taban sayısını giriniz:");
        taban = scan.nextInt();
        System.out.print("Üssü giriniz:");
        us = scan.nextInt();
        System.out.println(recursivePower(taban,us));
    }

}
