package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateSquare implements ActionListener {
    JFrame jf = new JFrame("CalculateSquare");
    JButton b1;
    JTextField jTextField, jTextField1;

    CalculateSquare() {
        jf.setBounds(0, 0, 250, 350);
        jf.setLayout(null);
        jf.setVisible(true);

        jTextField = new JTextField();
        jTextField.setBounds(35, 15, 100, 50);
        jTextField.setBorder(null);

        jTextField1 = new JTextField();
        jTextField1.setBounds(200, 60, 100, 25);
        jTextField1.setEditable(false);
        jTextField1.setBorder(null);


        b1 = new JButton("Square");
        b1.setBounds(80, 0, 20, 20);
        b1.addActionListener(this);

        jf.add(jTextField);
        jf.add(jTextField1);
        jf.add(b1);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {

        }
    }

    public static void main(String[] args) {
        new CalculateSquare();
    }
}
