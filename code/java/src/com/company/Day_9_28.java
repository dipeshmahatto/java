package com.company;

public class Day_9_28 {
    public static void main(String[] args) {
        int[][] first = new int[2][3];
        first[0][0] = 1;
        first[0][1] = 1;
        first[0][2] = 1;
        first[1][0] = 1;
        first[1][1] = 1;
        first[1][2] = 1;

        int i,j;
        System.out.println("First matrix :");
        for (i=0;i<2;i++){
            for (j=0;j<3;j++){
                System.out.print(first[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }



        int[][] Second = new int[2][3];
        Second[0][0] = 1;
        Second[0][1] = 1;
        Second[0][2] = 1;
        Second[1][0] = 1;
        Second[1][1] = 1;
        Second[1][2] = 1;

        System.out.println("Second matrix :");
        for (i=0;i<2;i++){
            for (j=0;j<3;j++){
                System.out.print(Second[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("Sum of matrix :");
        int [][] third = new int[2][3];
        for (i=0;i<2;i++){
            for (j=0;j<3;j++){
                third[i][j]=first[i][j] + Second[i][j];
                System.out.print(third[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}
