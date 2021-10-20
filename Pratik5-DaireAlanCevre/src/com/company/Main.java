package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double yaricap, merkezAci;

        System.out.print("Yarıçapı giriniz:");
        yaricap = scan.nextDouble();

        System.out.print("Merkez açı ölçüsünü giriniz:");
        merkezAci = scan.nextDouble();

        System.out.println("Girdiğiniz bilgilere göre Dairenin alan ve Çevre bilgileri aşağıdaki gibidir;");

        System.out.println("Alan="+(3.14 * yaricap * yaricap));
        System.out.println("Çevre="+((3.14*(yaricap*yaricap)*merkezAci)/360));

    }
}
