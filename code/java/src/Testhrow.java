public class Testhrow {
    static void validate(int age) {
        try {
            if (age < 18) {
                throw new ArithmeticException("not validate");
//                System.out.println("output is coming..");
            }
        } catch (Exception e) {
            System.out.println(e);
        }  finally {
            System.out.println("Always exeuted");
        }
    }

    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
