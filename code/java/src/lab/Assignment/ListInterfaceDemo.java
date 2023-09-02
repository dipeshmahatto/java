package lab.Assignment;
import java.util.ArrayList;
import java.util.List;

public class ListInterfaceDemo {
    public static void main(String[] args) {
        // Creating a List instance (ArrayList in this case)
        List<String> namesList = new ArrayList<>();

        // Adding elements to the list
        namesList.add("Sita");
        namesList.add("Hari");
        namesList.add("Gita");

        System.out.println("List after adding elements: " + namesList);

        // Accessing elements by index
        String secondName = namesList.get(1);
        System.out.println("Element at index 1: " + secondName);

        // Changing an element
        namesList.set(2, "Shyam");
        System.out.println("List after changing element: " + namesList);

        // Removing an element by index
        namesList.remove(0);
        System.out.println("List after removing element at index 0: " + namesList);

        // Finding the index of an element
        int indexOfHari = namesList.indexOf("Hari");
        System.out.println("Index of 'Hari': " + indexOfHari);

        // Checking if the list is empty
        boolean isEmpty = namesList.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        // Getting the size of the list
        int size = namesList.size();
        System.out.println("Size of the list: " + size);
    }
}
