package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,r,nFaktoryel=1,rFaktoryel=1;
        double kombinasyonSonuc;
        System.out.print("N değerini giriniz:");
        n = scan.nextInt();
        System.out.print("R değerini giriniz:");
        r = scan.nextInt();
        nFaktoryel=faktoryel(n);
        rFaktoryel=faktoryel(r);

        kombinasyonSonuc = nFaktoryel/(rFaktoryel*(faktoryel(n-r)));

        System.out.println("Kombinasyon sonucu:"+kombinasyonSonuc);
    }

    public static int faktoryel(int sayi){
        int faktoryel=1;
        for (int i=1;i<=sayi;i++){
            faktoryel*=i;
        }
        return faktoryel;
    }
}
