package lab.Assignment;

import java.util.Scanner;

public class lab_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i;
        int n;
        System.out.println("Enter the size of array :");
        n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array element : ");
        for (i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for ( i = 0; i < n; i++) {
            if (arr[0] < arr[i]) {
                arr[0] = arr[i];
            }
        }
        System.out.print("The largest element in array is : ");
        System.out.println(arr[0]);
    }
}
