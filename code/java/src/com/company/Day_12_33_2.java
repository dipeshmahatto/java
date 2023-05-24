package com.company;
import java.util.Scanner;
public class Day_12_33_2 {
    static void pattern(int n){
        for (int i = 1 ; i <= n ; i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int r = s.nextInt();
        System.out.println("PATTERN  :");
        pattern(r);
    }
}
