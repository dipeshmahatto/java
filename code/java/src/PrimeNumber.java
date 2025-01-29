import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        sc.close();
        int i,j,count,m=0;
        for(i=2;i<(n*5);i++) {
            count=0;
            for(j=1;j<=i;j++) {
                if(i%j==0) {
                    count++;
                }
            }
            if(count==2) {
                System.out.println("Prime Number is "+i+".");
                m++;
            }
            if(n==m) {
                break;
            }
        }
    }
}
