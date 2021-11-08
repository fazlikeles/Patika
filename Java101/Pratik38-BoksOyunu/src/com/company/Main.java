package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        //Canlar ve güçler random sınıfı yardımı ile oluşturuldu.
        int health = random.nextInt(31)+70;
        int damage = random.nextInt(11);
        int sira = random.nextInt(2);
        String fighterName;
        System.out.print("Birinci dövüşçünün ismini giriniz:");
        fighterName = scan.nextLine();
        Fighter f1 = new Fighter(fighterName,damage,health,85,20);
        // canlar ve güçler tekrar oluşturuldu.
        health = random.nextInt(31)+70;
        damage = random.nextInt(10);
        System.out.print("Birinci dövüşçünün ismini giriniz:");
        fighterName = scan.nextLine();
        Fighter f2 = new Fighter(fighterName,damage,health,90,20);
        Match m1 = new Match(f1,f2,80,100,sira);

        m1.run();
    }
}
