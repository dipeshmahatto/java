package lab.Assignment;
import java.util.ArrayList;

public class ArrList{

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

//        To add element into arraylist
        arr.add("Dipesh");
        arr.add("Surya");
        arr.add("Aaryan");
        System.out.println(arr);

//        To remove element from arraylist
        arr.remove(2);
        System.out.println(arr);

    }
}
