package lab.Assignment;

import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<String, Integer> ageTable = new Hashtable<>();

        ageTable.put("Sita", 25);
        ageTable.put("Hari", 30);
        ageTable.put("Gita", 22);

        int sitaAge = ageTable.get("Sita");
        int hariAge = ageTable.get("Hari");

        System.out.println("Age of Sita: " + sitaAge);
        System.out.println("Age of Hari: " + hariAge);

        boolean containsGita = ageTable.containsKey("Gita");
        System.out.println("Does the hashtable contain 'Gita'? " + containsGita);

        boolean containsAge30 = ageTable.containsValue(30);
        System.out.println("Does the hashtable contain age 30? " + containsAge30);

        ageTable.remove("Sita");
        System.out.println("Hashtable after removing key 'Sita': " + ageTable);

        ageTable.clear();
        System.out.println("Hashtable after clearing: " + ageTable);
    }
}
