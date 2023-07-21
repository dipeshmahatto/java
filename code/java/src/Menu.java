import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Menu implements ActionListener {

    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4, i5;
    JFrame f = new JFrame("Menu");

    Menu() {

        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        i1 = new JMenuItem("Add");
        i1.addActionListener(this);

        i2 = new JMenuItem("Subtract");
        i2.addActionListener(this);

        i3 = new JMenuItem("Reverse String");
        i3.addActionListener(this);

        i4 = new JMenuItem("Change background");
        i4.addActionListener(this);

        i5 = new JMenuItem("Count");
        i5.addActionListener(this);

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
        menu.add(i5);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == i1) {
            new Adder();
        } else if (e.getSource() == i2) {
            new Subtractor();
        } else if (e.getSource() == i3) {
            new StringRev();
        } else if (e.getSource() == i4) {
            f.getContentPane().setBackground(new Color(10, 12, 3));
        } else if(e.getSource()==i5){
            new CountChacter();
        }
    }

    public static void main(String[] args) {
        new Menu();
    }
}