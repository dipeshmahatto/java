import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factt(n));
    }
    public static int factt(int n){
        int fact= 1;
        if(n == 0){
            return 0;
        }else if(n==1){
            return 1;
        } else {
            return n*factt(n-1);
        }
    }
}

