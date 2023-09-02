package lab.Assignment;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> ageMap = new TreeMap<>();

        ageMap.put("Sita", 25);
        ageMap.put("Hari", 30);
        ageMap.put("Gita", 22);

        System.out.println("TreeMap: " + ageMap);

        ageMap.remove("Sita");
        ageMap.put("Nabin", 28);

        System.out.println("Modified TreeMap: " + ageMap);
        System.out.println("Size: " + ageMap.size());

        System.out.println("Iterating through TreeMap:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
    }
}
