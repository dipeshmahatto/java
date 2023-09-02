package lab.Assignment;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        System.out.println("LinkedList: " + linkedList);

        linkedList.removeFirst();
        linkedList.addLast("Grapes");

        System.out.println("Modified LinkedList: " + linkedList);
        System.out.println("Size: " + linkedList.size());
    }
}
