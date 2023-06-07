package lab.Assignment;

import java.util.Scanner;

public class lab_8 {
    public lab_8(int a, int b) {
        if (a > b) {
            System.out.println(a + " is the greater than " + b);
        } else {
            System.out.println(b + " is the greater than " + a);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        lab_8 c = new lab_8(4, 7);
    }
}

