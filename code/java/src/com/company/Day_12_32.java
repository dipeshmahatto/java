package com.company;

public class Day_12_32 {
    static int fact(int n) {
        int factorial;
        if (n == 1)
            return 1;
        else {
            factorial = n * fact(n - 1);
        }
        return factorial;
    }

    public static void main(String[] args) {
        int result = fact(3);
        System.out.println(result);

    }
}
