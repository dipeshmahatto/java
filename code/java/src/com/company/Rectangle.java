package com.company;

import java.util.Scanner;

public class Rectangle {
    private int length;
    private int Breadth;

    public void setLength(int x) {
        this.length = x;
    }

    public int getLength() {
        return length;
    }
    public  void setBreadth(int y){
        this.Breadth=y;
    }

    public int getBreadth() {
        return Breadth;
    }

    public static void main(String[] args) {
        Rectangle q = new Rectangle();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of length in cm :");
        q.setLength(s.nextInt());
        System.out.println("Enter the value of Breadth in cm :");
        q.setBreadth(s.nextInt());
        System.out.println("Enter 1 for Area \nEnter 2 for Perimeter :");
        int a = s.nextInt();
        if(a==1){
            System.out.println("Length :"+q.getLength());
            System.out.println("Breadth :"+q.getBreadth());
            System.out.println(q.length* q.Breadth+"cm*cm");
        } else {
            System.out.println("Length :"+q.getLength());
            System.out.println("Breadth :"+q.getBreadth());
            System.out.println(2*(q.length+ q.Breadth)+"cm");
        }

    }
}
