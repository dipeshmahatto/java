package com.company;
import java.util.Scanner;

public class Day_6_12 {
    public static void main(String[] args) {
        //        Question-1
        //                float a = 7/4*9/2;
        //                System.out.println(a);

        //        Question-2
//                        char grade = 'A' ;
//                        grade = (char)(grade + 8);
//        System.out.println(grade);
//
//        grade = (char)(grade-8);
//        System.out.println(grade);

//        Question-3
//
        Scanner s = new Scanner(System.in);
//        System.out.println("Enter your first number:");
//        int a = s.nextByte();
//        System.out.println("Enter your second number:");
//        int b = s.nextInt();
//
//        if (a>b){
//            System.out.println(a + " is the greater number than "+ b);
//        } else {
//            System.out.println(b + " is the greater number than " + a);
//
//        Question - 4
//        int a=2,v=5,u=4,s=1;
//        int value = ((v*v) - (u*u))/2*a*s;

//        System.out.println(value);


//        Question- 5
//        int x = 7;
//        int a = 7*79/7+35/7;
//        System.out.println(a);

//        Question- 6 ---> Area
        System.out.println("Enter length in meter:");
        int l = s.nextInt();
        System.out.println("Enter breath in meter:");
        int b = s.nextInt();
        int area = l*b;
        System.out.println(area);

    }
}
