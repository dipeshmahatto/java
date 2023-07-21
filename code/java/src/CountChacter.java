import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountChacter implements ActionListener {
    JTextField t1,t3;
    JButton b1;
    CountChacter(){
        JFrame f= new JFrame();
        t1 = new JTextField();
        t1.setBounds(100,80,150,30);


        t3 = new JTextField();
        t3.setBounds(100,160,150,30);
        t3.setEditable(false);

        b1 = new JButton("Count");
        b1.setBounds(130,210,80,30);
        b1.addActionListener(this);
        f.add(t1);
        f.add(t3);
        f.add(b1);
        f.setSize(450,450);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String s = t1.getText();
        int occurrences = countCharacter(s);
        t3.setText(String.valueOf(occurrences));
    }

    public int countCharacter(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        new CountChacter();
    }
}
