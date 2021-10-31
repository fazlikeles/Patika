package com.company;

public class ArrayHelper {
    static int findsSmallest(int [] dizi, int n){
        int x = Integer.MIN_VALUE;
        for (int eleman:dizi){
            if (eleman<n){
                if (eleman>x){
                    x=eleman;
                }
            }
        }
        return x;
    }
    static int findBiggiest(int[] dizi, int n){
        int x = Integer.MAX_VALUE;
        for (int eleman:dizi){
            if (eleman>n){
                if (eleman<x){
                    x=eleman;
                }
            }
        }
        return x;
    }

}
