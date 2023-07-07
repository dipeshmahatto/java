import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter the 10 array element !!!");
        for (int i = 0; i < 10; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Entered Array Elements are :- ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Reverse Array is : ");
        int[] b = new int[10];
        int j = 9;
        for (int i = 0; i < 10; i++) {
            b[j] = a[i];
            j--;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(b[i] + " ");
        }


    }
}
