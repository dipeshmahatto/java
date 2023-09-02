package lab.Assignment;
public class PrimitiveToWrapper {
    public static void main(String[] args) {
        // Primitive data types
        int intValue = 42;
        double doubleValue = 3.14;
        char charValue = 'A';

        // Converting primitives to wrapper objects (autoboxing)
        Integer wrappedInt = Integer.valueOf(intValue);
        Double wrappedDouble = Double.valueOf(doubleValue);
        Character wrappedChar = Character.valueOf(charValue);

        // Displaying the wrapper objects
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Wrapped Character: " + wrappedChar);
    }
}