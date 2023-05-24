package com.company;
import java.util.Scanner;
public class Day_12_33 {

    static void multiplication(int a){
        for(int i = 1;i<=10;i++){
            System.out.println(a + "*" +i + "= "+a*i);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number you want multiplication table :");
        int n = s.nextInt();
        System.out.println("Multiplication table of "+n +".");
        multiplication(n);
    }
}
