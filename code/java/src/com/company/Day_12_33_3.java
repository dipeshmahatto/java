package com.company;

import java.util.Scanner;

public class Day_12_33_3 {
    static void sum(int n) {
        int sum = 0;
        for (int i = n; i > 0; i--) {
            sum = sum + i;
        }
        System.out.println("SUM of the first " + n + " number is : " + sum);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to be sum :");
        int input= s.nextInt();
        sum(input);
    }
}
