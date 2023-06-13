package com.company;

import java.util.Scanner;

public class Day_21_80{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //    array exception
        int[] a = new int[3];
        a[0]= 4;
        a[1]= 8;
        a[2]= 3;
        System.out.println("Enter array index to print its value ...");
        int n= sc.nextInt();
//        try
//        {
//            System.out.println("Value is "+(a[n]));
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//            System.out.println("Please enter index between 0 to 2 ." );
//        }

        if(a[0]>=a[n]){
            try
            {
                System.out.println("a[0] is greater than your entered index value .");
            }
            catch (ArithmeticException e){
                System.out.println(e);
                System.out.println("Please enter index between 0 to 2 ." );
            }
        }



    }

}

