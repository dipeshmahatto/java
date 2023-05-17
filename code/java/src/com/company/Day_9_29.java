package com.company;
import java.util.Scanner;
public class Day_9_29 {
    public static void main(String[] args) {
        Scanner D= new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int n= D.nextInt();
        System.out.println("Enter the number of cols :");
        int m = D.nextInt();

        int [][] twoD_arr = new int [n][m];

        int i , j ;
        System.out.println("Enter the array element :");
        for (i=0;i<n;i++){
            for (j=0;j<m;j++) {
                twoD_arr[i][j]=D.nextInt();
            }
        }
        System.out.println("Entered array element are :");
        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                System.out.print(twoD_arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
