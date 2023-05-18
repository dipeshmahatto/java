import java.util.Scanner;

public class math {
    public void sum(int a, int b) {
        System.out.println("sum" + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("sub" + (a - b));
    }

    public void mul(int a, int b) {
        System.out.println(a * b);
    }

    public void div(int a, int b) {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        math addition = new math();
        math subtraction = new math();
        math muliplication = new math();
        math division = new math();
//        addition.sum(4, 5);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1 for sum , 2 for sub , 3 for mul and 4 for division");
        int n;
        n = s.nextInt();
        int x, y;
        switch (n) {
            case 1:
//                Add
                System.out.println("Enter the value of  x:");
                x = s.nextInt();
                System.out.println("Enter the value of  y");
                y = s.nextInt();
                addition.sum(x, y);
                break;

            case 2:

//                Subtract
                System.out.println("Enter the value of  x:");
                x = s.nextInt();
                System.out.println("Enter the value of  y");
                y = s.nextInt();
                subtraction.sub(x, y);
                break;

            case 3:

//                Multiply
                System.out.println("Enter the value of  x:");
                x = s.nextInt();
                System.out.println("Enter the value of  y");
                y = s.nextInt();
                muliplication.mul(x, y);
                break;

            case 4:

//                Division
                System.out.println("Enter the value of  x:");
                x = s.nextInt();
                System.out.println("Enter the value of  y");
                y = s.nextInt();
                division.div(x, y);
                break;

            default:
                System.out.println("Enter the valid number 1 to 4 only !!!");

        }

    }

}
