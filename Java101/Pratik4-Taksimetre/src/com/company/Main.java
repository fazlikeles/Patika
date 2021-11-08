package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Km:");
        double km = scan.nextDouble();
        System.out.println("Toplam tutar:"+(taksimetre(km)));
    }

    public static double taksimetre(double km){
        double tutar=10;
        tutar += km*2.20;
        if (tutar<20){
            return 20;
        }else{
            return tutar;
        }
    }
}
