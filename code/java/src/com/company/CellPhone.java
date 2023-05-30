package com.company;
import java.util.Scanner;
public class CellPhone {
    void ringing(){
        System.out.println("Ringing...");
    }
    void Vibrating(){
        System.out.println("Vibrating...");
    }

    public static void main(String[] args) {
        CellPhone c = new CellPhone();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 or 2 :");
        int a = s.nextInt();
        if (a==1){
            c.ringing();
        } else {
            c.Vibrating();
        }

    }
}
