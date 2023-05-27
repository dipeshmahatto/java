package com.company;

import java.util.Scanner;

public class Day_14_33_7 {
    static void pattern(int a) {
        if (a > 0) {
            pattern(a - 1);
           for ( int j = 0;j < a;j++){
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
