package lab.Assignment;
public class WrapperToPrimitive {
    public static void main(String[] args) {
        // Wrapper objects
        Integer wrappedInt = Integer.valueOf(42);
        Double wrappedDouble = Double.valueOf(3.14);
        Character wrappedChar = Character.valueOf('A');

        // Converting wrapper objects to primitives (unboxing)
        int intValue = wrappedInt.intValue();
        double doubleValue = wrappedDouble.doubleValue();
        char charValue = wrappedChar.charValue();

        // Displaying the primitive values
        System.out.println("Primitive int value: " + intValue);
        System.out.println("Primitive double value: " + doubleValue);
        System.out.println("Primitive char value: " + charValue);
    }
}
