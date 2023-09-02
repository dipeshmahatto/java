package lab.Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Using Iterator to iterate through the list
        Iterator<String> iterators = fruits.iterator();
        while (iterators.hasNext()) {
            String fruit = iterators.next();
            System.out.print(fruit+" ");
        }

        // Removing an element using Iterator
        iterators = fruits.iterator();
        while (iterators.hasNext()) {
            String fruit = iterators.next();
            if (fruit.equals("Banana")) {
                iterators.remove();
            }
        }

        System.out.println("\nList after removing 'Banana': " + fruits);
    }
}
