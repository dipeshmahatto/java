package com.company;

public class Day_14_33_6 {
    static float average(int ...arr){
        float sum=0 ;
        for (int i=0;i<arr.length;i++){
            sum = sum +arr[i];
        }
        return sum/ arr.length;
    }

    public static void main(String[] args) {
        int a,b,c,d;
        a= 5;
        b=5;
        c=8;
        d=3;

        float avv=average(a,b,c,d);
        System.out.println(avv);
    }
}
