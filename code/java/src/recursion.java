import java.util.Scanner;
public class recursion {
    int fact(int n){
        if(n==0){
            return 1;
        } else {
            return n * fact(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        recursion r = new recursion();

        System.out.println("Enter the number :");
        int n = s.nextInt();
        int factorial = r.fact(n);
        System.out.println("Factorial :"+factorial);
    }
}
