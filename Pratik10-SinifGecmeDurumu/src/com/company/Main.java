package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        double ortalama;
        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        matematik = scan.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        fizik = scan.nextInt();
        System.out.print("Türkçe notunuzu giriniz:");
        turkce = scan.nextInt();
        System.out.print("Kimya notunuzu giriniz:");
        kimya = scan.nextInt();
        System.out.print("Müzik notunuzu giriniz:");
        muzik = scan.nextInt();
        ortalama = (matematik+fizik+turkce+kimya+muzik)/5;

        if (ortalama>0 && ortalama<=100){
            if (ortalama>=55){
                System.out.println("Tebrikler sınıfı geçtiniz.");
            }else{
                System.out.println("Malesef sınıf tekrarına kaldınız.");
            }
        }else{
            System.out.println("Hatalı not girişi yaptınız !");
        }

    }
}
