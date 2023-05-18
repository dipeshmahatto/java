package lab.Assignment;
import java.util.Scanner;
public class lab_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your full name :");
        String name = s.nextLine();
        System.out.println("Enter your roll no :");
        int roll_no = s.nextInt();
        System.out.println("Enter your Result in percentage :");
        float percentage = s.nextFloat();

        System.out.println("Name : " + name);
        System.out.println("Roll no : " + roll_no);
        System.out.println("Result : " + percentage +"%");

    }

}
