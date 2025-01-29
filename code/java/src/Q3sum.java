
import javax.swing.JOptionPane;

public class Q3sum {
    public static void main(String[] args) {
        // Prompt the user to enter the first number
        String input1 = JOptionPane.showInputDialog("Enter the first number:");
        
        // Prompt the user to enter the second number
        String input2 = JOptionPane.showInputDialog("Enter the second number:");
        
        try {
            // Convert the input strings to integers
            int number1 = Integer.parseInt(input1);
            int number2 = Integer.parseInt(input2);
            
            // Calculate the sum
            int sum = number1 + number2;
            
            // Display the result in a dialog box
            JOptionPane.showMessageDialog(null, "The sum is: " + sum);
        } catch (NumberFormatException e) {
            // Handle invalid input (non-numeric)
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
        }
    }
}
