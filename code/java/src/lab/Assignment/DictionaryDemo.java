package lab.Assignment;

import java.util.Dictionary;
import java.util.Hashtable;

public class DictionaryDemo {
    public static void main(String[] args) {
        // Creating a Dictionary instance using Hashtable
        Dictionary<Integer, String> dictionary = new Hashtable<>();

        // Adding key-value pairs to the dictionary
        dictionary.put(1, "One");
        dictionary.put(2, "Two");
        dictionary.put(3, "Three");

        // Getting values using keys
        String value1 = dictionary.get(1);
        String value2 = dictionary.get(2);
        String value3 = dictionary.get(3);

        System.out.println("Value corresponding to key 1: " + value1);
        System.out.println("Value corresponding to key 2: " + value2);
        System.out.println("Value corresponding to key 3: " + value3);

        // Checking if the dictionary contains a key
        boolean containsKey = dictionary.get(2) != null;
        System.out.println("Dictionary contains key 2: " + containsKey);

        // Checking if the dictionary contains a value
        boolean containsValue = false;
        for (int i = 0; i < dictionary.size(); i++) {
            if ("Four".equals(dictionary.get(i))) {
                containsValue = true;
                break;
            }
        }
        System.out.println("Dictionary contains value 'Four': " + containsValue);
        // Removing a key-value pair
        dictionary.remove(1);
        System.out.println("Dictionary after removing key 1: " + dictionary);
    }
}
