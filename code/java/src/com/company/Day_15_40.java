package com.company;

import java.util.Scanner;

public class Day_15_40 {
    private int salary;
    private String name;

    void setSalary(int x) {
        this.salary = x;
    }

    int getSalary() {
        return salary;
    }

    void setName(String n) {
        this.name = n;
    }

    String getName() {
        return name;
    }

    public static void main(String[] args) {
        Day_15_40 first = new Day_15_40();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name :");
        first.setName(s.nextLine());
        System.out.println("Enter your salary :");
        first.setSalary(s.nextInt());

        System.out.println();
        System.out.println("Name :" + first.getName());
        System.out.println("Salary :" + first.getSalary());
    }
}
