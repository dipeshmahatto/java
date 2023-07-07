public class swap {
    public static void main(String[] arg) {
        int a = 41;
        int b = -45;

//        a = a ^ b;
//        b = b ^ a;
//        a = b^a;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("A :" +a);
        System.out.println("B :" +b);
    }
}
