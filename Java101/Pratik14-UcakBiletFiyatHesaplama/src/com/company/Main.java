package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int yas;
        double km,yolculukTipi;

        System.out.print("Yolculuk kaç km:");
        km = scan.nextDouble();

        System.out.print("Yaşınız:");
        yas = scan.nextInt();

        System.out.print("Yolculuk Tipinizi seçiniz\n1-)Gidiş\n2-)Gidiş-Dönüş\nSeçim:");
        yolculukTipi=scan.nextDouble();

        if (km>0 && yas>-1 && (yolculukTipi==1 || yolculukTipi==2)){
            System.out.println("Toplam ücret:"+(int)fiyat(km,yas,yolculukTipi)+" ₺");
        }else{
            System.out.println("Hatalı Veri Girdiniz !");
        }

    }

    public static double fiyat(double km, int yas, double yolculukTipi){
        double normalUcret = km*0.10;
        if (yolculukTipi==1){
            if (yas<12){
                return (normalUcret*0.5);
            }else if (yas>=12 && yas <=24){
                return (normalUcret*0.90);
            }else if (yas>24 && yas<65){
                return (normalUcret);
            }
            else if (yas>=65){
                return (normalUcret*0.70);
            }
        }else if (yolculukTipi==2){
            if (yas<12){
                return ((normalUcret*0.5)*0.8)*2;
            }else if (yas>=12 && yas <=24){
                return ((normalUcret*0.9)*0.8)*2;
            }else if (yas>24 && yas<65){
                return (normalUcret)*2;
            }
            else if (yas>65){
                return ((normalUcret*0.70)*0.80)*2;
            }
        }
        return -1;
    }
}
