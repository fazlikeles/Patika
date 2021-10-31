package com.company;

import java.util.Scanner;

public class Main {
    static boolean isFind(int[] dizi, int n){
        for (int eleman:dizi){
            if (n==eleman){
                return  true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int elemanSayisi,eleman;
        int sayac=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Diziniz kaç elemanlı olacak:");
        elemanSayisi = scan.nextInt();
        int[] dizi = new int[elemanSayisi];
        int[] dizi2 = new int[elemanSayisi];
        for (int i=0;i<elemanSayisi;i++){
            System.out.print((i+1)+". elemanınızı giriniz:");
            eleman = scan.nextInt();
            dizi[i] = eleman;
        }
        for (int i=0;i<dizi.length;i++){
            for (int j=0;j<dizi.length;j++){
                if (dizi[i]%2==0){
                    if (dizi[i]==dizi[j]){
                        if (!isFind(dizi2, dizi[i])){
                            dizi2[sayac+1] = dizi[i];
                        }
                        break;
                    }
                }
            }

        }
        for (int e:dizi2){
            if(e!=0){
                System.out.println(e);
            }
        }

    }
}
