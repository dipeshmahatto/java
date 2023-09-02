package lab.Assignment;
//  In Java,you can sort collections using the Collections class (for List implementations)or
//        the Arrays class (for arrays).The sorting is done using either the natural order of
//        the elements(if they implement the Comparable interface)or by providing a custom comparator.

import java.util.*;

public class SortingExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(8);
        numbers.add(3);

        System.out.println("Before sorting: " + numbers);

        // Sort the list using Collections.sort()
        Collections.sort(numbers);

        System.out.println("After natural sorting: " + numbers);
    }
}
