package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        final int sayi = rnd.nextInt(100), right=5;
        System.out.println(sayi);
        int tahminSayisi,sayac=1;
        for (int i=1;i<=right;i++){
            System.out.print("Tahmin ettiğiniz sayıyı giriniz:");
            tahminSayisi = scan.nextInt();

            if (sayi==tahminSayisi){
                System.out.println("Tebrikler "+i+". denemede buldunuz.");
                break;
            }else {
                if (sayi<tahminSayisi){
                    System.out.println("İpucu:Tahmin ettiğiniz sayı bizdeki sayıdan büyük.");
                }else if (sayi>tahminSayisi){
                    System.out.println("İpucu:Tahmin ettiğiniz sayı bizdeki sayıdan küçük");
                }
                System.out.println("Maalesef bulamadınız. Kalan hak:"+(right-i));
                sayac++;
            }
        }
        if (sayac>=5){
            System.out.println("Maalesef kazanamadınız.");
        }

    }
}
