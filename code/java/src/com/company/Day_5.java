package com.company;
import java.util.Scanner;

public class Day_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter integer number you want to check odd or even:");
        int check = s.nextInt();

        if (check%2==0){
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }
}
