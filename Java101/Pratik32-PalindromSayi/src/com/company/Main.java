package com.company;

import java.util.Scanner;

public class Main {


    static boolean isPalindrom(int sayi){
        int temp = sayi,lastNumber,reverseNumber=0;
        while (temp!=0){
            lastNumber = temp%10;
            reverseNumber = (reverseNumber*10)+lastNumber;
            temp/=10;
        }
        if (sayi==reverseNumber){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int sayi;
        Scanner scan =  new Scanner(System.in);
        System.out.print("Sayınızı giriniz:");
        sayi = scan.nextInt();
        if (isPalindrom(sayi)){
            System.out.println(sayi+" Sayısı bir palindrom sayıdır.");
        }else {
            System.out.println(sayi+" Sayısı bir palindrom sayı değildir.");
        }
    }
}
