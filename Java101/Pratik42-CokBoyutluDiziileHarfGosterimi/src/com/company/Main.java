package com.company;

public class Main {

    public static void main(String[] args) {
        String[][] dizi = new String[7][4];
        int rowCount = dizi.length;
        int columnCount = dizi[0].length;
        for (int i=0;i<dizi.length;i++){
            for (int j=0;j<dizi[i].length;j++){
                if (i==0 || i==rowCount/2 || i==rowCount-1){
                    dizi[i][j]=" * ";
                }else if (j==0 || j==columnCount-1){
                    dizi[i][j]=" * ";
                }else{
                    dizi[i][j]="   ";
                }
            }
        }

        for (String[] row:dizi){
            for (String column:row){
                System.out.print(column);
            }
            System.out.println("   ");
        }
    }
}
