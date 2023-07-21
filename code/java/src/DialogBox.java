import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogBox {
    private static JDialog dg;
    DialogBox(){
        JFrame frm = new JFrame();
        dg = new JDialog(frm, "Alert",true);
        dg.setLayout(new FlowLayout());
        JButton b = new JButton("OK");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DialogBox.dg.setVisible(false);
            }
        });
        dg.add(new JLabel("Click Here"));
        dg.add(b);
        dg.setSize(300,300);
        dg.setVisible(true);

    }

    public static void main(String[] args) {
        new DialogBox();
    }
}
