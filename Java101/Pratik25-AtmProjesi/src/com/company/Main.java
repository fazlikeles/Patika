package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName, password;
        int select,balance=1500;
        double amount;

        int right = 3;
        while (right > 0) {
            System.out.print("Kullanıcı adınız:");
            userName = scan.next();
            System.out.print("Şifreniz:");
            password = scan.next();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Bilgi bankasına hoşgeldiniz !");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = scan.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktarı giriniz:");
                            amount = scan.nextDouble();
                            if (amount>5){
                                balance+=amount;
                            }else{
                                System.out.println("% ₺ den daha az miktarda para yatıramazsınız.");
                            }
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı giriniz:");
                            amount=scan.nextDouble();
                            if (amount<=balance){
                                balance-=amount;
                            }else{
                                System.out.println("Bakiyeniz yetersiz !");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz:"+balance);
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor ...");
                            break;
                    }
                }while (select!=4);
                break;
            } else {
                right -= 1;
                System.out.println("Hatalı kullanıcı adı veya parola girişi. Tekrar deneyiniz.");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan hakkınız:"+right);
                }

            }
        }
    }
}
