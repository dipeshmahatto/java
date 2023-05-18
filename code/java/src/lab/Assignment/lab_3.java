package lab.Assignment;

import java.util.Scanner;

public class lab_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to be factorial :");
        int n;
        n = s.nextInt();
        int fact = 1 ;
        for (;n>0;n--){
            fact = n * fact ;
        }

        System.out.println(fact);
    }
}
