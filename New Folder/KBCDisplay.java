
import javax.swing.*;

public class KBCDisplay {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("KBC Display");

        // Create a JPanel
        JPanel panel = new JPanel();

        // Create a JLabel to display the "KBC" string
        JLabel label = new JLabel("KBC");

        // Set the font and size for the label (optional)
        label.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 36));

        // Add the label to the panel
        panel.add(label);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(300, 150); // Set the size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        frame.setLocationRelativeTo(null); // Center the frame on the screen

        // Make the frame visible
        frame.setVisible(true);
    }
}
