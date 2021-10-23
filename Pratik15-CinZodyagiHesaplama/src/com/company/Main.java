package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz:");
        int dogumYili = scan.nextInt();

        if (dogumYili%12==0){
            System.out.println("Çin zodyağına göre sembolünüz: Maymun");
        }else if (dogumYili%12==1){
            System.out.println("Çin zodyağına göre sembolünüz:Horoz");
        }else if (dogumYili%12==2){
            System.out.println("Çin zodyağına göre sembolünüz:Köpek");
        }else if (dogumYili%12==3){
            System.out.println("Çin zodyağına göre sembolünüz:Domuz");
        }else if (dogumYili%12==4){
            System.out.println("Çin zodyağına göre sembolünüz:Fare");
        }else if (dogumYili%12==5){
            System.out.println("Çin zodyağına göre sembolünüz:Öküz");
        }else if (dogumYili%12==6){
            System.out.println("Çin zodyağına göre sembolünüz:Kaplan");
        }else if (dogumYili%12==7){
            System.out.println("Çin zodyağına göre sembolünüz:Tavşan");
        }else if (dogumYili%12==8){
            System.out.println("Çin zodyağına göre sembolünüz:Ejderha");
        }else if (dogumYili%12==9){
            System.out.println("Çin zodyağına göre sembolünüz:Yılan");
        }else if (dogumYili%12==10){
            System.out.println("Çin zodyağına göre sembolünüz:At");
        }else if (dogumYili%12==11){
            System.out.println("Çin zodyağına göre sembolünüz:Koyun");
        }

    }
}
