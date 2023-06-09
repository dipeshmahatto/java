import java.util.Scanner;

class MyException extends Exception {
//    @Override
//    public String toString() {
//        return "I am toString() Exception";
//    }

    @Override
    public String getMessage() {
        return "I am getMessage() Exception";
    }
}

public class custom_exception {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 19) {
            try {
                throw new MyException();
//                throw new ArithmeticException("This is an exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
//                System.out.println(e.toString());
// e.printStackTrace();
// System.out.println("Finished");
            }
        }
    }
}
