package lab.Assignment;

public class CompareToDemo {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";

        int result1 = str1.compareTo(str2);
        int result2 = str2.compareTo(str1);
        int result3 = str1.compareTo(str3);

        System.out.println("Comparing 'apple' and 'banana': " + result1);
        System.out.println("Comparing 'banana' and 'apple': " + result2);
        System.out.println("Comparing 'apple' and 'apple': " + result3);
    }
}
