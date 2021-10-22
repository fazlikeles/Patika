package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int derece;
        String oneri;

        System.out.print("Hava sıcaklığını giriniz:");
        derece = scan.nextInt();
        oneri = derece<5?"Kayak":(derece>=5 && derece<=15 ? "Sinema":(derece>15 && derece<=25 ? "Piknik":(derece>25 ? "Yüzme":"")));
        System.out.println("Dereceye göre öneri:"+oneri);
    }
}
