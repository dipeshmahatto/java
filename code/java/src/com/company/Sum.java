package com.company;


public class Sum {
    public void check() {
        System.out.println("Public");
    }

    protected void check1() {
        System.out.println("protected");
    }

    private void check2() {
        System.out.println("private");
    }

    void check3() {
        System.out.println("Default");
    }
    public void sum(int a, int b) {
        System.out.println("Sum :" + (a + b));
    }

    public void mul(int a, int b) {
        System.out.println("Sum :" + (a * b));
    }

}
