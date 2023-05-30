package com.company;

import java.util.Scanner;

public class Square {
    private int length;

    public void setLength(int x) {
        this.length = x;
    }

    public int getLength() {
        return length;
    }

    public static void main(String[] args) {
        Square q = new Square();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of length in cm :");
        q.setLength(s.nextInt());
        System.out.println("Enter 1 for Area \nEnter 2 for Perimeter :");
        int a = s.nextInt();
        if(a==1){
            System.out.println(q.length* q.length+"cm*cm");
        } else {
            System.out.println(4*q.length+"cm");
        }

    }
}
