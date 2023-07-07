import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 1;
        array[3] = 9;
        array[4] = 5;


//        System.out.println("Enter the number to be checked : ");
//        int n = s.nextInt();

        int count = 0;

        for (int i = 0; i < 5; i++) {
            for(int j = i+1;j<5;j++){
                if (array[i] == array[j]) {
                    count++;
                    break;
                }
            }
        }
        if(count>0){
            System.out.println("It has duplicate.");
        } else{
            System.out.println("It doesn`t have duplicate .");
        }

        System.out.println("Given array is:");
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
