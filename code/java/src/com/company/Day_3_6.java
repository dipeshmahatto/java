package com.company;
import java.util.Scanner;
public class Day_3_6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your 5 subjects marks to get your percentage:");
        System.out.println("Enter your first subject mark:");
        float first = s.nextFloat() ;

        System.out.println("Enter your second subject mark:");
        float second = s.nextFloat();

        System.out.println("Enter your Third subject mark:");
        float Third = s.nextFloat();

        System.out.println("Enter your fourth subject mark:");
        float fourth = s.nextFloat();

        System.out.println("Enter your fivth subject mark:");
        float fivth = s.nextFloat();

        float percentage = ((first+second+Third+fourth+fivth)/500)*100;

        System.out.print(percentage);
        System.out.println("%");

    }
}