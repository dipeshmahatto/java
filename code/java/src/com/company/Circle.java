package com.company;

import java.util.Scanner;

public class Circle {
    private int radius;

    public  void setRadius(int y){
        this.radius=y;
    }

    public int getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        Circle q = new Circle();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of Radius in cm :");
        q.setRadius(s.nextInt());
        System.out.println("Enter 1 for Area \nEnter 2 for Perimeter :");
        int a = s.nextInt();
        if(a==1){
            System.out.println("Radius :"+q.getRadius());
            System.out.println("Area"+(3.14* q.radius*q.radius)+"cm*cm");
        } else {
            System.out.println("Radius :"+q.getRadius());
            System.out.println("Perimeter :"+2*(3.14*q.radius)+"cm");
        }

    }
}
