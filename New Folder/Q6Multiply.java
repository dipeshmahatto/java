



import javax.swing.*;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Q6Multiply implements ActionListener{

    JFrame f;
    JTextField t1, t2,t3;
    JLabel l1, l2,l3;
    JButton b;

    Q6Multiply() {
        f = new JFrame("Multiply", null);
     

        l1 = new JLabel("Enter your first number");
        l1.setBounds(50,5,300,40);
        f.add(l1);

        t1 = new JTextField();
        t1.setBounds(50, 40,200,30);
        f.add(t1);
        
        
        
        
        
        l2 = new JLabel("Enter your Second number");
        l2.setBounds(50,70,300,40);
        f.add(l2);

        t2= new JTextField();
        t2.setBounds(50, 100,200,30);
        f.add(t2);
        
        
        
        
  
        b= new JButton("Multiply");
        b.setBounds(50,140,200,30);
        b.addActionListener(this);
        f.add(b);
        



        l2 = new JLabel("Result");
        l2.setBounds(50,180,200,30);
        f.add(l2);

        t3 = new JTextField();
        t3.setBounds(50, 220,200,30);
        f.add(t3);




        f.setSize(400, 400);
        
  
        f.setLayout(null);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
    	
    	if(e.getSource()== b) {
        String s1=t1.getText();
        int n=Integer.parseInt(s1);
        
        
        String s2=t2.getText();
        int n2=Integer.parseInt(s2);

        int square = n*n2;
        String s3=String.valueOf(square);
        t3.setText(s3);
    	}
    }

    public static void main(String[] args) {
        new Q6Multiply();

    }
	
}



