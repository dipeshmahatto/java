package lab.Assignment;
class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " onto the stack.");
        } else {
            System.out.println("Stack is full. Cannot push " + value + ".");
        }
    }
    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println("Popped " + poppedValue + " from the stack.");
            return poppedValue;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == maxSize - 1;
    }
}
public class StackImplementation {
    public static void main(String[] args) {
        Stack stack = new Stack(2);
        stack.push(10);
        stack.push(20);
        System.out.println("Is the stack empty: " + stack.isEmpty());
        System.out.println("Is the stack full: " + stack.isFull());
        stack.pop();
        stack.pop();
        System.out.println("Is the stack empty: " + stack.isEmpty());
        System.out.println("Is the stack full: " + stack.isFull());
    }
}