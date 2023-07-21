import javax.swing.*;
import java.awt.*;

public class FrameBackground {

    FrameBackground() {
        JFrame j = new JFrame();


        j.setSize(400, 400);
        j.setLayout(null);
        j.setVisible(true);
        j.getContentPane().setBackground(new Color(10, 12, 3));
    }

    public static void main(String[] args) {
        new FrameBackground();
    }
}
