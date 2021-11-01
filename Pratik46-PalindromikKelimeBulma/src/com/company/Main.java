package com.company;

import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String kelime){
        String reversedWord = "";
        for (int i=kelime.length()-1;i>=0;i--){
            reversedWord+=kelime.charAt(i);
        }
        return kelime.equals(reversedWord);
    }

    static boolean isPalindromeNewPerspective(String kelime){
        int i = kelime.length()-1;
        int j = 0;
        while (i>j){
            if (kelime.charAt(i) != kelime.charAt(j)){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Palindrom kontrolü yapmak istediğiniz kelimeyi giriniz:");
        String kelime = scan.next();
        if (isPalindromeNewPerspective(kelime)){
            System.out.println("Girdiğiniz kelime bir palindrom kelimedir.");
        }else{
            System.out.println("Girdiğiniz kelime palindrom bir kelime değildir.");
        }
    }
}
