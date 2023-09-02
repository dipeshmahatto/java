package lab.Assignment;

import java.util.Vector;

public class VectorAddDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // Adding elements using the add() method
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        System.out.println("Vector after adding elements: " + vector);
    }
}