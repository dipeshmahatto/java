import javax.swing.*;
import java.awt.*;

public class CatApp extends JFrame {
    public CatApp() {
        setTitle("Cat");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        // Body of the cat
        g2d.setColor(Color.GRAY);
        g2d.fillOval(150, 200, 200, 150);

        // Head of the cat
        g2d.setColor(Color.GRAY);
        g2d.fillOval(100, 150, 100, 100);

        // Ears
        g2d.setColor(Color.GRAY);
        g2d.fillPolygon(new int[]{100, 120, 130}, new int[]{150, 130, 170}, 3);
        g2d.fillPolygon(new int[]{200, 220, 230}, new int[]{150, 130, 170}, 3);

        // Eyes
        g2d.setColor(Color.WHITE);
        g2d.fillOval(120, 180, 30, 30);
        g2d.fillOval(190, 180, 30, 30);

        // Pupils
        g2d.setColor(Color.BLACK);
        g2d.fillOval(130, 190, 10, 10);
        g2d.fillOval(200, 190, 10, 10);

        // Nose
        g2d.setColor(Color.PINK);
        g2d.fillOval(155, 210, 20, 15);

        // Whiskers
        g2d.setColor(Color.BLACK);
        g2d.drawLine(145, 215, 120, 215);
        g2d.drawLine(145, 220, 120, 225);
        g2d.drawLine(145, 225, 120, 235);
        g2d.drawLine(205, 215, 230, 215);
        g2d.drawLine(205, 220, 230, 225);
        g2d.drawLine(205, 225, 230, 235);

        // Mouth
        g2d.setColor(Color.BLACK);
        g2d.drawLine(160, 225, 190, 225);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CatApp());
    }
}
