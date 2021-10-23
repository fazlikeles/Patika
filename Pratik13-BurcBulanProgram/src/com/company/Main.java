package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ay, gun;

        System.out.print("Kaçıncı ayda doğdunuz:");
        ay = scan.nextInt();
        System.out.print("Ayın kaçıncı gününde doğdunuz:");
        gun = scan.nextInt();

        if (ay<=12 && ay>=1){
            if (ay==1 && gun>=22){
                System.out.println("Kova burcusunuz.");
            }else if (ay==1){
                System.out.println("Oğlak burcusunuz.");
            }
            if (ay==2 && gun>=20){
                System.out.println("Balık burcusunuz.");
            }else if (ay==2){
                System.out.println("Kova burcusunuz.");
            }
            if (ay==3 && gun>=21){
                System.out.println("Koç burcusunuz.");
            }else if (ay==3){
                System.out.println("Balık burcusunuz.");
            }
            if (ay==4 && gun>=21){
                System.out.println("Boğa burcusunuz.");
            }else if (ay==4){
                System.out.println("Koç burcusunuz.");
            }

            if (ay==5 && gun>=22){
                System.out.println("İkizler burcusunuz");
            }else if (ay==5){
                System.out.println("Boğa burcusunuz.");
            }

            if (ay==6 && gun>=23){
                System.out.println("Yengeç burcusunuz");
            }else if (ay==6){
                System.out.println("İkizler burcusunuz.");
            }

            if (ay==7 && gun>=23){
                System.out.println("Aslan burcusunuz.");
            }else if (ay==7){
                System.out.println("Yengeç burcusunuz.");
            }

            if(ay==8 && gun >=23){
                System.out.println("Başak burcusunuz.");
            }else if(ay==8){
                System.out.println("Aslan burcusunuz.");
            }

            if(ay==9 && gun>=23){
                System.out.println("Terazi burcusunuz.");
            }else if(ay==9){
                System.out.println("Başak burcusunuz");
            }

            if (ay==10 && gun >=23){
                System.out.println("Akrep burcusunuz.");
            }else if(ay==10){
                System.out.println("Terazi burcusunuz.");
            }

            if (ay==11 && gun>=22){
                System.out.println("Yay burcusunuz");
            }else if(ay==11){
                System.out.println("Akrep burcusunuz.");
            }

            if (ay==12 && gun>=22){
                System.out.println("Oğlak burcusunuz");
            }else if (ay==22){
                System.out.println("Yay burcusunuz.");
            }

        }else{
            System.out.println("Hatalı bir ay girişi yaptınız");
        }
    }
}
