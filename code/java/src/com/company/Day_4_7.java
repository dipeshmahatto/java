package com.company;
import java.util.Scanner;
public class Day_4_7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

//        System.out.println("Enter your name:");
//
//        String name = s.next();
//
//        System.out.print("Hello ");
//        System.out.print(name);
//        System.out.print(", have a good day.");

        System.out.println("Enter the number in kilometer");
        double kilo = s.nextDouble();

        double mile = kilo * 0.62137119;

        System.out.print("Given value is converted into miles :");
        System.out.println(mile);

    }
}
