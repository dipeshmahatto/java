package lab.Assignment;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceDemo {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();

        ageMap.put("Sita", 25);
        ageMap.put("Ram", 30);

        // Accessing values using keys
        int sitaAge = ageMap.get("Sita");
        int ramAge = ageMap.get("Ram");

        System.out.println("Age of Sita: " + sitaAge);
        System.out.println("Age of Ram: " + ramAge);

        // Checking if the map contains a key
        boolean containsKey = ageMap.containsKey("Hari");
        System.out.print("Does the map contain key 'Hari'? " + containsKey);

        // Iterating through the map
        System.out.println("\nNames and Ages:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.print("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        // Removing a key-value pair
        ageMap.remove("Ram");
        System.out.print("\nMap after removing key 'Ram': " + ageMap);
    }
}
