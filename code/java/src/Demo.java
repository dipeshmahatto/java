import javax.swing.*;

public class Demo {
    JFrame frm;

    Demo() {
        frm = new JFrame();
        JButton btn = new JButton("Click");
        btn.setBounds(50, 200, 100, 20);
        frm.add(btn);
        JButton openBtn = new JButton("Open New Window");
        openBtn.setBounds(160, 200, 150, 20);
        frm.add(openBtn);
        frm.setSize(400, 400);
        frm.setLayout(null);
        frm.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("TextField");
        JTextField t1, t2;
        t1 = new JTextField("Username");
        t1.setBounds(50, 100, 200, 30);
        t2 = new JTextField("Password");
        t2.setBounds(50, 150, 200, 30);
        f.add(t1);
        f.add(t2);

        JButton btn = new JButton("Login");
        btn.setBounds(50, 200, 70, 20);
        f.add(btn);

        JButton openBtn = new JButton("Open New Window");
        openBtn.setBounds(120, 200, 150, 20);
        f.add(openBtn);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
