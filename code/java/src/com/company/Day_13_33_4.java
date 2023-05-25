package com.company;

import java.util.Scanner;

public class Day_13_33_4 {
    static void pattern(int a) {
        for (int i = a; i > 0; i--) {
            for (int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int n = s.nextInt();
        System.out.println("PATTERN :");
        pattern(n);
    }
}
