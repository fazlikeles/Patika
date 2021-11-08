package com.company;

import java.util.Scanner;

public class Main {
    static int[][] transpoze(int[][] dizi){
        int[][] transpozeArray = new int[dizi[0].length][dizi.length];
        for (int i=0;i<dizi.length;i++){
            for (int j=0;j<dizi[0].length;j++){
                transpozeArray[j][i] = dizi[i][j];
            }
        }
        return transpozeArray;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int satir, sutun,sayac=0,eleman;
        System.out.print("Matrisin satır sayısını giriniz:");
        sutun = scan.nextInt();
        System.out.print("Matrisin sütun sayısını giriniz:");
        satir = scan.nextInt();
        int[][] dizi = new int[satir][sutun];
        int[][]tranpoze = new int[sutun][satir];
        for (int i=0;i<dizi.length;i++){
            sayac=0;
            for (int j=0;j<dizi[i].length;j++){
                System.out.print((i+1)+". satırın "+(sayac+1)+". elemanını giriniz:");
                eleman = scan.nextInt();
                dizi[i][j] = eleman;
                sayac++;
            }
        }

        System.out.println("Matrisin normal hali:");
        for (int[] e:dizi){
            for(int k:e){
                System.out.print(k+"  ");
            }
            System.out.println();
        }
        System.out.println("Matrisin transpozlu hali:");
        for (int[] e:transpoze(dizi)){
            for(int k:e){
                System.out.print(k+"  ");
            }
            System.out.println();
        }

    }
}
