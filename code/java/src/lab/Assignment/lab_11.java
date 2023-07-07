package lab.Assignment;

import java.util.Scanner;

class Car {
    void carColor(String a) {
        System.out.println("Color of Car is " + a);
    }

    void priceOfCar(int p) {
        System.out.println("Price of Car is : " + p);
    }
}

class Vechile extends Car {
    void setColor(String a) {
        carColor(a);
    }

    void setPrice(int p) {
        priceOfCar(p);
    }
}

public class lab_11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Vechile v = new Vechile();
        System.out.println("Enter the color of car : ");
        v.setColor(s.next());
        System.out.println("Enter the price of car : ");
        v.setPrice(s.nextInt());
    }
}
