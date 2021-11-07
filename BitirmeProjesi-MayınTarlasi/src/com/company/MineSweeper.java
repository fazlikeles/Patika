package com.company;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int columnNumber;
    int board[][];
    int map[][];
    int size;
    boolean game = true;
    Random rnd = new Random();
    Scanner scan = new Scanner(System.in);
    public MineSweeper(int rowNumber, int columnNumber) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.map = new int[rowNumber][columnNumber];
        this.board = new int[rowNumber][columnNumber];
        this.size = rowNumber*columnNumber;
    }

    public void run(){
        int row, col, success=0;
        prepareGame();
        print(map);
        System.out.println("Oyun Başladı");
        while (game){
            print(board);
            System.out.print("Satır:");
            row = scan.nextInt();
            System.out.print("Sütun:");
            col = scan.nextInt();
            if (row<=0 || row >= rowNumber){
                System.out.println("Geçersiz koordinat girişi !");
                continue;
            }
            if (col<=0 || col >= columnNumber){
                System.out.println("Geçersiz koordinat girişi !");
                continue;
            }

            if (map[row][col]!=-1){
                chechkMine(row,col);
                success++;
                if (success==(size-(size/4))){
                    System.out.println("Tebrikler kazandınız !!");
                    break;
                }
            }else {
                game = false;
                System.out.println("Game Over");
            }
        }
    }
    public void chechkMine(int row, int col){
        if (map[row][col]==0){
            if ((col < columnNumber-1) &&(map[row][col]==-1)){
                board[row][col]++;
            }
            if ((row < rowNumber-1) &&(map[row+1][col]==-1)){
                board[row][col]++;
            }
            if ((row>0)&&(map[row-1][col]==-1)){
                board[row][col]++;
            }
            if ((col>0)&&(map[row][col-1]==-1)){
                board[row][col]++;
            }
            if (board[row][col]==0){
                board[row][col] = -2;
            }
        }

    }

    public void prepareGame(){
        int randRow, randCol,count=0;
        while(count!=(size/4)){
            randRow = rnd.nextInt(rowNumber);
            randCol = rnd.nextInt(columnNumber);
            if (map[randRow][randCol]!=-1){
                map[randRow][randCol]=-1;
                count++;
            }
        }
    }

    public void print(int[][] array){
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                if (array[i][j]>=0){
                    System.out.print(" ");
                }
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
