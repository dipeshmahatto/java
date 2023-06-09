public class ChangeCase {
    public static void main(String[] args) {
        String s = "ABcDeF";
        System.out.println("Original");
        String upper = s.toUpperCase();
        String lower = s.toLowerCase();
        System.out.println("UpperCase: "+upper);
        System.out.println("LowerCase: "+lower);
        System.out.println(s.substring(3));
        System.out.println(s.substring(0,3));
        System.out.println(s);

//        Conversion like AbCde ------> Abcde..
//        String upperr = s.substring(0,1);
//        upperr = upperr.toUpperCase();
//         s = s.substring(1) ;
//         s = s.toLowerCase();
//        System.out.println(upperr+s);


    }
}
