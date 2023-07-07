// package Collection;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "Apple");
        map.put(4, "samsung");
        map.put(2, "LG");
        map.put(7, "Nokia");

        Set set = map.entrySet();
        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}