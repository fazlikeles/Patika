package com.company;

public class Main {

    public static void main(String[] args) {
        int sayac=0;
        for (int i=100;i>=2;i--){
            for (int j=2;j<=i;j++){
                if (i%j==0){
                    sayac+=1;
                }
            }
            if (sayac<=1){
                System.out.print(i+"  ");
            }
            sayac=0;
        }
    }
}
