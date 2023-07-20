import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Menu implements ActionListener {

    JMenu menu,submenu;
    JMenuItem i1, i2,i3,i4,i5;
    Menu() {
        JFrame f = new JFrame("Menu");
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        submenu = new JMenu("Submenu");
        i1=new JMenuItem("Add");
        i1.addActionListener(this);

        i2=new JMenuItem("Subtract");
        i2.addActionListener(this);

        i3=new JMenuItem("Reverse String");
        i3.addActionListener(this);
        i4=new JMenuItem("Item 4");
        i5=new JMenuItem("Item 5");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==i1){
            Adder a= new Adder();
        } else if (e.getSource()==i2){
            Subtractor s= new Subtractor();
        } else if (e.getSource()==i3){
            StringRev rev= new StringRev();
        }
    }

    public static void main(String[] args) {
        new Menu();
    }
}