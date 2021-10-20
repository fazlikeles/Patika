package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kg, boy,bmi;
        String bmiTipi;

        System.out.print("Kilonuzu giriniz(kg cinsinden):");
        kg = scan.nextDouble();

        System.out.print("Boyunuzu giriniz(m cinsinden):");
        boy = scan.nextDouble();

        bmi = kg / (boy * boy) ;

        if (bmi<=18.5){
            bmiTipi = "Zayıf";
            System.out.println("Bmi:"+bmi+"   "+bmiTipi);
        }else if (bmi>18.5 && bmi<=24.9){
            bmiTipi = "Normal";
            System.out.println("Bmi:"+bmi+"    "+bmiTipi);
        }else if (bmi>24.9 && bmi<=29.9){
            bmiTipi = "Kilolu";
            System.out.println("Bmi:"+bmi+"    "+bmiTipi);
        }else if (bmi>29.9 && bmi<=34.9){
            bmiTipi = "Obez";
            System.out.println("Bmi:"+bmi+"    "+bmiTipi);
        }else if (bmi>34.9){
            bmiTipi = "Morbid Obez";
            System.out.println("Bmi:"+bmi+"    "+bmiTipi);
        }

    }
}
