import javax.swing.*;

public class Demp {
    JFrame frm;

    Demp() {
        frm = new JFrame();
        JButton btn = new JButton("click");
        btn.setBounds(150, 100, 100, 40);
        frm.add(btn);
        frm.setSize(500, 500);
        frm.setLayout(null);
        frm.setVisible(true);

//        JButton btn2 = new JButton("click");
//        btn2.setBounds(300, 200, 100, 40);
//        frm.add(btn2);
//
//        JButton btn3 = new JButton("click");
//        btn3.setBounds(300, 300, 100, 40);
//        frm.add(btn3);
    }

    public static void main(String[] args) {
        new Demp();
    }
}
