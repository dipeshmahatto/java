import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Square implements ActionListener {
    JFrame jf;
    JButton b;
    JLabel l1,l2;
    JTextField t1,t2;
    Square(){
        jf = new JFrame("Square Calculator");
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setSize(500,250);

        l1 = new JLabel("Enter any number :");
        l1.setBounds(50,50,120,30);
        jf.add(l1);

        t1 = new JTextField();
        t1.setBounds(180,50,150,30);
        jf.add(t1);

        b = new JButton("Calculate Square");
        b.setBounds(100,90,150,30);
        b.addActionListener(this);
        jf.add(b);

        l2 = new JLabel("Square of entered number :");
        l2.setBounds(50,120,180,30);
        jf.add(l2);

        t2 = new JTextField();
        t2.setBounds(220,130,150,30);
        t2.setEditable(false);
        jf.add(t2);

    }
    public void actionPerformed(ActionEvent e){
        if(t1.getText().equals("")){
            t2.setText("Enter the valid number ..");
        } else {
            int a = Integer.parseInt(t1.getText());
            String sq = String.valueOf(a*a);
            t2.setText(sq);
        }
    }
    public static void main(String[] args) {
        new Square();
    }
}
