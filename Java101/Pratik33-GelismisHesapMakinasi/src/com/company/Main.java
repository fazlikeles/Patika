package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap\n";

        int x = 0,y=0;

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            if (select==6){
                System.out.print("Sayınızı giriniz:");
                x = scan.nextInt();
            }else{
                System.out.print("İlk sayınızı giriniz:");
                x = scan.nextInt();
                System.out.print("İkinci sayınızı giriniz:");
                y = scan.nextInt();
            }
            switch (select) {
                case 1:
                    plus(x,y);
                    break;
                case 2:
                    minus(x,y);
                    break;
                case 3:
                    times(x,y);
                    break;
                case 4:
                    divided(x,y);
                    break;
                case 5:
                    power(x,y);
                    break;
                case 6:
                    factorial(x);
                    break;
                case 7:
                    mod(x,y);
                    break;
                case 8:
                    RectangularAreaandPerimeter(x,y);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }

    public static void plus(int x, int y){
        System.out.println("Sonuç:"+(x+y));
    }
    public static void minus(int x, int y){
        System.out.println("Sonuç:"+(x-y));
    }
    public static void times(int x, int y){
        System.out.println("Sonuç:"+(x*y));
    }
    public static void divided(int x, int y){
        System.out.println("Sonuç:"+(x/y));
    }
    public static void power(int x, int y){
        int sonuc=1;
        for (int i=1;i<=y;i++){
            sonuc*=x;
        }
        System.out.println("Sonuç:"+sonuc);
    }
    public static void factorial(int x){
        int sonuc=1;
        for (int i=1;i<=x;i++){
            sonuc*=i;
        }
        System.out.println("Sonuç:"+sonuc);
    }

    public static void mod(int x, int y){
        System.out.println("Sonuç:"+(x%y));
    }
    public static void RectangularAreaandPerimeter(int x, int y){
        System.out.print("Alan:" +(x*y));
        System.out.println("Çevre:"+(2*(x+y)));
    }

}
