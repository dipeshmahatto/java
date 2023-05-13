package com.company;
import java.util.Scanner;
public class Day_8_26 {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);


        int []marks = new int[10];
        int i;

        System.out.println("Enter you array :");
        for(i=0;i<10;i++){
            marks[i]= m.nextInt();
        }
        for(i=0;i<10;i++){
            System.out.println(marks[i]);
        }


//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);
//        System.out.println(marks[5]);
//        System.out.println(marks[6]);
//        System.out.println(marks[7]);
//        System.out.println(marks[8]);
//        System.out.println(marks[9]);


    }
}
