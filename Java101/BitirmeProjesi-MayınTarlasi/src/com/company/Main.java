package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int satir,sutun,eleman;
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        System.out.print("Mayın tarlasının satır adedini giriniz:");
        satir = scan.nextInt();
        System.out.print("Mayın tarlasının sütun adedini giriniz:");
        sutun = scan.nextInt();

        MineSweeper mineSweeper = new MineSweeper(satir,sutun);
        mineSweeper.run();

    }
}
