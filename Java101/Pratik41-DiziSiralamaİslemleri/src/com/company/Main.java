package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int sayi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayınızı giriniz:");
        sayi = scan.nextInt();
        System.out.println("Sayınıza en yakın küçük sayı:"+ArrayHelper.findsSmallest(list,sayi));
        System.out.println("Sayınıza en yakın büyük sayı:"+ArrayHelper.findBiggiest(list,sayi));
    }
}
