import javax.swing.*;
import java.awt.event.*;

public class Subtractor implements ActionListener {
    JTextField tf1, tf2, tf3;
    JButton b1;

    Subtractor() {
        JFrame f = new JFrame();
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 20);
        tf2 = new JTextField();
        tf2.setBounds(50, 80, 150, 20);
        tf3 = new JTextField();
        tf3.setBounds(50, 110, 150, 20);
        tf3.setEditable(false);
        b1 = new JButton("sub number");
        b1.setBounds(50, 140, 100, 30);
        b1.addActionListener(this);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(tf1.getText());
        int num2 = Integer.parseInt(tf2.getText());
        int sub = num1 - num2;
        tf3.setText(String.valueOf(sub));
    }

    public static void main(String[] args) {
        Subtractor a = new Subtractor();
    }
}