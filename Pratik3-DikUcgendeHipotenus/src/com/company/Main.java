package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double  k1, k2, k3;
        Scanner input = new Scanner(System.in);

        System.out.print("Dik üçgenin 1. kenarını giriniz :");
        k1 = input.nextDouble();

        System.out.print("Dik üçgenin 2. kenarını giriniz :");
        k2 = input.nextDouble();


        k3 = Math.sqrt ((k1*k1)+(k2*k2));
        System.out.println("Hipotenüs :" + k3);

        System.out.print("1. kenarı giriniz :");
        k1 = input.nextInt();

        System.out.print(" 2. kenarı giriniz :");
        k2 = input.nextInt();

        System.out.print("3. kenarı giriniz :");
        k3 = input.nextInt();

        double alan, u;

        u=(k1+k2+k3)/2;
        alan = Math.sqrt (u*(u-k1)*(u-k2)*(u-k3));

        System.out.print("Üçgenin alanı :" + alan);

    }
}
