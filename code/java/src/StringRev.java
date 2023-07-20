import javax.swing.*;
import java.awt.event.*;

public class StringRev implements ActionListener {
    JTextField tf1, tf3;
    JButton b1;

    StringRev() {
        JFrame f = new JFrame();
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 20);

        tf3 = new JTextField();
        tf3.setBounds(50, 110, 150, 20);
        tf3.setEditable(false);
        b1 = new JButton("Reverse");
        b1.setBounds(50, 140, 100, 30);
        b1.addActionListener(this);
        f.add(tf1);
        f.add(tf3);
        f.add(b1);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String inputText = tf1.getText();
        StringBuilder rev = new StringBuilder(inputText);
        rev.reverse();
        tf3.setText(rev.toString());
    }

    public static void main(String[] args) {
        StringRev a = new StringRev();
    }
}