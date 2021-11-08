package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s1,s2,s3;
        System.out.print("ilk sayınızı giriniz:");
        s1 = scan.nextInt();
        System.out.print("ikinci sayınızı giriniz:");
        s2 = scan.nextInt();
        System.out.print("Ucuncu sayınızı giriniz:");
        s3 = scan.nextInt();
        if (s1<s2 && s1<s3){
            System.out.println("En küçük sayı:"+s1);
        }else if (s2<s1 && s2<s3){
            System.out.println("En küçük sayı"+s2);
        }else if (s3<1 && s3<s2){
            System.out.println("En küçük sayı"+s3);
        }
    }
}
