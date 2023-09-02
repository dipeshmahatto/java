package lab.Assignment;
import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        for (String s : colors) {
            System.out.print(s+" ");
        }

        System.out.println();

        ListIterator<String> bwdIter = colors.listIterator(colors.size());
        while (bwdIter.hasPrevious()) System.out.print(bwdIter.previous()+" ");

        ListIterator<String> modifyIter = colors.listIterator();
        while (modifyIter.hasNext()) {
            String color = modifyIter.next();
            if (color.equals("Green")) modifyIter.set("Purple");
        }
        System.out.println("\nModified List: " + colors);
    }
}
