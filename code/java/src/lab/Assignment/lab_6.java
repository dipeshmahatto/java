package lab.Assignment;

import java.util.Scanner;

public class lab_6 {
    public static void main(String[] args) {
//        addition.sum(4, 5);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1 for sum , 2 for sub , 3 for mul and 4 for division");
        int n;
        n = s.nextInt();
        System.out.println("Enter the value of  x:");
        int x = s.nextInt();
        System.out.println("Enter the value of  y");
        int y = s.nextInt();
        switch (n) {
            case 1:
//                Add
                System.out.println("Sum : " +(x + y));
                break;

            case 2:
//                Subtract
                System.out.println("Subtract : " +(x - y));
                break;

            case 3:
//                Multiply
                System.out.println("Multiply : " +(x * y));
                break;

            case 4:
//                Division
                System.out.println("Division : " +(x / y));
                break;

            default:
                System.out.println("Enter the valid number 1 to 4 only !!!");

        }


    }
}
