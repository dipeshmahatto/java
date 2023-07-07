import javax.swing.*;
import java.awt.*;

public class HelicopterApp extends JFrame {
    public HelicopterApp() {
        setTitle("Helicopter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        // Body of the helicopter
        g2d.setColor(Color.BLUE);
        g2d.fillRect(100, 150, 300, 50);

        // Cockpit
        g2d.setColor(Color.WHITE);
        g2d.fillArc(80, 130, 60, 60, 0, 180);

        // Windows
        g2d.setColor(Color.BLACK);
        g2d.fillRect(90, 160, 30, 10);
        g2d.fillRect(130, 160, 30, 10);

        // Rotor blades
        g2d.setColor(Color.GRAY);
        g2d.fillRect(85, 140, 230, 10);
        g2d.fillRect(235, 70, 10, 100);
        g2d.fillRect(85, 140, 10, 110);

        // Tail
        g2d.setColor(Color.RED);
        int[] tailX = {380, 400, 400};
        int[] tailY = {175, 185, 165};
        g2d.fillPolygon(tailX, tailY, 3);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HelicopterApp());
    }
}
