import java.util.Dictionary;
import java.util.Hashtable;

public class Collection {
    public static void main(String[] args) {

        Dictionary<String,Integer> dc = new Hashtable<>();
//        dc.put(100,"ABC");
//        dc.put(101,"XYZ");

//        ADD
        dc.put("ABC",100);
        System.out.println(dc);

//        Remove
        dc.remove("ABC");
        System.out.println(dc);
    }
}
