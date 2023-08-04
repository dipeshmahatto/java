import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JFrame jf = new JFrame("Calculator");
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;
    JTextField jTextField0, jTextField, jTextField1, jTextField3, jTextField4, jTextField5;
    boolean isOn = false;
    int result;
    int position = 0, firstnumber = 0, secondnumber = 0;

    Calculator() {
//         jf.setSize(350,550);
        jf.setBounds(900, 150, 350, 550);
        jf.setLayout(null);
        jf.setVisible(true);

        jTextField = new JTextField();
        jTextField.setText("CASIO");
        jTextField.setFont(new Font("Dialog", Font.BOLD, 30));
        jTextField.setBounds(35, 15, 100, 50);
        jTextField.setEditable(false);
        jTextField.setBorder(null);

        jTextField0 = new JTextField();
        jTextField0.setBounds(170, 10, 150, 50);
        jTextField0.setBackground(Color.black);

        jTextField1 = new JTextField();
        jTextField1.setText("TWO WAY POWER");
        jTextField1.setFont(new Font("Dialog", Font.BOLD, 10));
        jTextField1.setBounds(200, 60, 100, 25);
        jTextField1.setEditable(false);
        jTextField1.setBorder(null);

        jTextField3 = new JTextField();
        jTextField3.setBounds(5, 90, 150, 50);
        jTextField3.setBackground(Color.GRAY);
//         jTextField3.setFont(new Font("Dialog",Font.BOLD,50));
        jTextField3.setEditable(false);

        jTextField4 = new JTextField();
        jTextField4.setBounds(5, 145, 150, 50);
        jTextField4.setBackground(Color.GRAY);
//         jTextField4.setFont(new Font("Dialog",Font.BOLD,50));
        jTextField4.setEditable(false);

        jTextField5 = new JTextField();
        jTextField5.setBounds(160, 110, 150, 50);
        jTextField5.setBackground(Color.GRAY);
//         jTextField5.setFont(new Font("Dialog",Font.BOLD,50));
        jTextField5.setEditable(false);


        b1 = new JButton("Close");
        b1.setBounds(220, 200, 70, 70);
        b1.setFont(new Font("Dialog", Font.PLAIN, 10));
        b1.addActionListener(this);

        b3 = new JButton("0");
        b3.setBounds(10, 280, 70, 50);
        b3.setFont(new Font("Dialog", Font.PLAIN, 30));
        b3.addActionListener(this);

        b4 = new JButton("+");
        b4.setBounds(90, 280, 70, 50);
        b4.setFont(new Font("Dialog", Font.PLAIN, 30));
        b4.addActionListener(this);

        b5 = new JButton("-");
        b5.setBounds(170, 280, 70, 50);
        b5.setFont(new Font("Dialog", Font.PLAIN, 30));
        b5.addActionListener(this);

        b6 = new JButton("*");
        b6.setBounds(250, 280, 70, 50);
        b6.setFont(new Font("Dialog", Font.PLAIN, 30));
        b6.addActionListener(this);

        b7 = new JButton("1");
        b7.setBounds(10, 340, 70, 50);
        b7.setFont(new Font("Dialog", Font.PLAIN, 30));
        b7.addActionListener(this);

        b8 = new JButton("2");
        b8.setBounds(90, 340, 70, 50);
        b8.setFont(new Font("Dialog", Font.PLAIN, 30));
        b8.addActionListener(this);

        b9 = new JButton("3");
        b9.setBounds(170, 340, 70, 50);
        b9.setFont(new Font("Dialog", Font.PLAIN, 30));
        b9.addActionListener(this);

        b10 = new JButton("/");
        b10.setBounds(250, 340, 70, 50);
        b10.setFont(new Font("Dialog", Font.PLAIN, 30));
        b10.addActionListener(this);

        b11 = new JButton("4");
        b11.setBounds(10, 400, 70, 50);
        b11.setFont(new Font("Dialog", Font.PLAIN, 30));
        b11.addActionListener(this);

        b12 = new JButton("5");
        b12.setBounds(90, 400, 70, 50);
        b12.setFont(new Font("Dialog", Font.PLAIN, 30));
        b12.addActionListener(this);

        b13 = new JButton("6");
        b13.setBounds(170, 400, 70, 50);
        b13.setFont(new Font("Dialog", Font.PLAIN, 30));
        b13.addActionListener(this);

        b14 = new JButton("AC");
        b14.setBounds(250, 400, 70, 50);
        b14.setFont(new Font("Dialog", Font.PLAIN, 25));
        b14.addActionListener(this);

        b15 = new JButton("7");
        b15.setBounds(10, 460, 70, 50);
        b15.setFont(new Font("Dialog", Font.PLAIN, 30));
        b15.addActionListener(this);

        b16 = new JButton("8");
        b16.setBounds(90, 460, 70, 50);
        b16.setFont(new Font("Dialog", Font.PLAIN, 30));
        b16.addActionListener(this);

        b17 = new JButton("9");
        b17.setBounds(170, 460, 70, 50);
        b17.setFont(new Font("Dialog", Font.PLAIN, 30));
        b17.addActionListener(this);

        b18 = new JButton("=");
        b18.setBounds(250, 460, 70, 50);
        b18.setFont(new Font("Dialog", Font.PLAIN, 30));
        b18.addActionListener(this);

        jf.add(jTextField);
        jf.add(jTextField1);
        jf.add(jTextField3);
        jf.add(jTextField0);
        jf.add(jTextField4);
        jf.add(jTextField5);
        jf.add(b1);
//        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        jf.add(b5);
        jf.add(b6);
        jf.add(b7);
        jf.add(b8);
        jf.add(b9);
        jf.add(b10);
        jf.add(b11);
        jf.add(b12);
        jf.add(b13);
        jf.add(b14);
        jf.add(b15);
        jf.add(b16);
        jf.add(b17);
        jf.add(b18);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            close();
        } else if (e.getSource() == b3) {
            if (position == 0) {
                String s = b3.getText();
                jTextField3.setText(s);
                firstnumber = Integer.parseInt(b3.getText());
                position++;
            } else if (position == 1) {
                String s = b3.getText();
                jTextField4.setText(s);
                secondnumber = Integer.parseInt(b3.getText());
                position++;
            }
        } else if (e.getSource() == b4) {
            if (position == 2) {
                result = firstnumber + secondnumber;
                jTextField5.setText(String.valueOf(result));
            } else {
                jTextField5.setText("Enter the both number first");
            }
        } else if (e.getSource() == b5) {
            if (position == 2) {
                result = firstnumber - secondnumber;
                jTextField5.setText(String.valueOf(result));
            } else {
                jTextField5.setText("Enter the both number first");
            }
        } else if (e.getSource() == b6) {
            if (position == 2) {
                result = firstnumber * secondnumber;
                jTextField5.setText(String.valueOf(result));
            } else {
                jTextField5.setText("Enter the both number first");
            }
        } else if (e.getSource() == b7) {
            if (position == 0) {
                String s = b7.getText();
                jTextField3.setText(s);
                firstnumber = Integer.parseInt(b7.getText());
                position++;
            } else if (position == 1) {
                String s = b7.getText();
                jTextField4.setText(s);
                secondnumber = Integer.parseInt(b7.getText());
                position++;
            }
        } else if (e.getSource() == b8) {
            if (position == 0) {
                String s = b8.getText();
                jTextField3.setText(s);
                firstnumber = Integer.parseInt(b8.getText());
                position++;
            } else if (position == 1) {
                String s = b8.getText();
                jTextField4.setText(s);
                secondnumber = Integer.parseInt(b8.getText());
                position++;
            }
        } else if (e.getSource() == b9) {
            if (position == 0) {
                String s = b9.getText();
                jTextField3.setText(s);
                firstnumber = Integer.parseInt(b9.getText());
                position++;
            } else if (position == 1) {
                String s = b9.getText();
                jTextField4.setText(s);
                secondnumber = Integer.parseInt(b9.getText());
                position++;
            }
        } else if (e.getSource() == b10) {
            if (position == 2) {
                result = firstnumber / secondnumber;
                jTextField5.setText(String.valueOf(result));
            } else {
                jTextField5.setText("Enter the both number first");
            }
        } else if (e.getSource() == b11) {
            if (position == 0) {
                String s = b11.getText();
                jTextField3.setText(s);
                firstnumber = Integer.parseInt(b11.getText());
                position++;
            } else if (position == 1) {
                String s = b11.getText();
                jTextField4.setText(s);
                secondnumber = Integer.parseInt(b11.getText());
                position++;
            }
        } else if (e.getSource() == b12) {
            if (position == 0) {
                String s = b12.getText();
                jTextField3.setText(s);
                firstnumber = Integer.parseInt(b12.getText());
                position++;
            } else if (position == 1) {
                String s = b12.getText();
                jTextField4.setText(s);
                secondnumber = Integer.parseInt(b12.getText());
                position++;
            }
        } else if (e.getSource() == b13) {
            if (position == 0) {
                String s = b13.getText();
                jTextField3.setText(s);
                firstnumber = Integer.parseInt(b13.getText());
                position++;
            } else if (position == 1) {
                String s = b13.getText();
                jTextField4.setText(s);
                secondnumber = Integer.parseInt(b13.getText());
                position++;
            }
        } else if (e.getSource() == b14) {
            firstnumber = 0;
            secondnumber = 0;
            position = 0;
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
        } else if (e.getSource() == b15) {
            if (position == 0) {
                String s = b15.getText();
                jTextField3.setText(s);
                firstnumber = Integer.parseInt(b15.getText());
                position++;
            } else if (position == 1) {
                String s = b15.getText();
                jTextField4.setText(s);
                secondnumber = Integer.parseInt(b15.getText());
                position++;
            }
        } else if (e.getSource() == b16) {
            if (position == 0) {
                String s = b16.getText();
                jTextField3.setText(s);
                firstnumber = Integer.parseInt(b16.getText());
                position++;
            } else if (position == 1) {
                String s = b16.getText();
                jTextField4.setText(s);
                secondnumber = Integer.parseInt(b16.getText());
                position++;
            }
        } else if (e.getSource() == b17) {
            if (position == 0) {
                String s = b17.getText();
                jTextField3.setText(s);
                firstnumber = Integer.parseInt(b17.getText());
                position++;
            } else if (position == 1) {
                String s = b17.getText();
                jTextField4.setText(s);
                secondnumber = Integer.parseInt(b17.getText());
                position++;
            }
        } else if (e.getSource() == b18) {
            jTextField5.setText("Working on it");
        }
    }

    void close() {
        jf.dispose();
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
