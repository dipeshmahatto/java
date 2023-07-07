import java.util.*;

public class ListDemo{
    public static void main(String[] args) {
        List<String>list = new ArrayList<String>();

        list.add("Samsung");
        list.add("Apple");
        list.add("Nothing");
        list.add("LG");

        for(String brand : list)
            System.out.println(brand);

        boolean st = list.contains("LG");
        System.out.println(st);
    }
}