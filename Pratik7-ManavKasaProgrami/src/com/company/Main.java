package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double armutFiyat=2.14;
        double elmaFiyat=3.67;
        double domatesFiyat=1.11;
        double muzFiyat=0.95;
        double patlicanFiyat=5;
        double armutkg, elmakg, domateskg, muzkg, patlicankg;

        System.out.print("Armut kac kg:");
        armutkg = scan.nextDouble();
        System.out.print("Elma kac kg:");
        elmakg = scan.nextDouble();
        System.out.print("Domates kac kg:");
        domateskg = scan.nextDouble();
        System.out.print("Muz kac kg:");
        muzkg = scan.nextDouble();
        System.out.print("Patlican kac kg:");
        patlicankg = scan.nextDouble();

        double toplam = (armutFiyat*armutkg)+(domatesFiyat*domateskg)+(elmaFiyat*elmakg)+(muzFiyat*muzkg)+(patlicanFiyat*patlicankg);
        System.out.println("Toplam Tutar:"+toplam);



    }
}
