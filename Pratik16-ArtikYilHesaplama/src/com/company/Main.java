package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yil;
        System.out.print("Yılı giriniz:");
        yil = scan.nextInt();

        if (yil%4==0){
            if (yil%100==0 && yil%400==0){
                System.out.println(yil+" Yılı bir artık yıldır.");
            }else {
                System.out.println(yil+" Yılı artık bir yıl değildir.");
            }
        }else{
            System.out.println(yil+" Yılı artık bir yıl değildir.");
        }
    }
}
