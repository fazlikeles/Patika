package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        boolean gectiKaldi;
        double ortalama=0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        matematik = scan.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik = scan.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya = scan.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce = scan.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih = scan.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik = scan.nextInt();

        ortalama = ((matematik+fizik+kimya+turkce+tarih+muzik)/6);

        gectiKaldi = ortalama>=60;
        System.out.println("Ortalama:"+ortalama);
        System.out.println("Sonuç:"+(gectiKaldi ? "geçti" : "kaldı"));

    }
}
