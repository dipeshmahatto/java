import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simple implements ActionListener {
    JFrame jf;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3;
    JButton b;

    Simple() {
        jf = new JFrame();
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setSize(500, 500);

        l1 = new JLabel("No. of Years");
        l1.setBounds(100, 80, 150, 25);
        jf.add(l1);

        l2 = new JLabel("Rate of Interest:");
        l2.setBounds(100, 110, 150, 25);
        jf.add(l2);

        l3 = new JLabel("Principal Amount:");
        l3.setBounds(100, 140, 150, 25);
        jf.add(l3);

        l4 = new JLabel();
        l4.setBounds(120, 170, 250, 25);
        jf.add(l4);

        t1 = new JTextField();
        t1.setBounds(255, 80, 100, 25);
        t1.setVisible(true);
        jf.add(t1);


        t2 = new JTextField();
        t2.setBounds(255, 110, 100, 25);
        t2.setVisible(true);
        jf.add(t2);

        t3 = new JTextField();
        t3.setBounds(255, 140, 100, 25);
        t3.setVisible(true);
        jf.add(t3);

        b = new JButton("Calculate Simple Interest");
        b.setBounds(100,200,250,30);
        b.addActionListener(this);
        jf.add(b);
    }

    public void actionPerformed(ActionEvent e) {
        if(t1.getText().equals("")&& t2.getText().equals("")&& t3.getText().equals("")){
            l4.setText("Please enter all the value first..");
        } else{
                float years = Integer.parseInt(t1.getText());
                float rate = Integer.parseInt(t2.getText());
                float amount = Integer.parseInt(t3.getText());

                float SI = (amount*rate*years)/100;

                l4.setText("Your Payable amount is :"+SI);

        }
    }

    public static void main(String[] args) {
        new Simple();
    }
}
