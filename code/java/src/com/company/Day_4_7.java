package com.company;
import java.io.StringReader;
import java.util.Scanner;
public class Day_4_7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your name:");

        String name = s.next();

        System.out.print("Hello ");
        System.out.print(name);
        System.out.print(", have a good day.");

    }
}
