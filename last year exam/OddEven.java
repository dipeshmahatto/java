import javax.swing.*;
import java.awt.event.*;

public class OddEven implements ActionListener {
    JFrame jf;
    JLabel jl,jl1;
    JButton jb;
    JTextField jT;
    OddEven(){
        jf = new JFrame("Checking For Voting");
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setSize(500,500);

         jl = new JLabel("Enter your Age :");
        jl.setBounds(150,100,150,30);
        jl.setVisible(true);
        jf.add(jl);

        jT = new JTextField();
        jT.setBounds(300,100,150,30);
        jf.add(jT);

        jb = new JButton("Check");
        jb.setBounds(225,150,100,30);
        jb.addActionListener(this);
        jf.add(jb);

        jl1 = new JLabel();
         jl1.setBounds(200,180,200,30);
        jf.add(jl1);


    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== jb){
            if(jT.getText().isEmpty()){
                jl1.setText("Enter valid number !!! ");
            } else if(Integer.parseInt(jT.getText())>=18){
                jl1.setText("You are eligible to vote !!!");
            } else if(Integer.parseInt(jT.getText())<=0){
                jl1.setText("Enter valid number !!! ");
            }else{
                jl1.setText("You are not eligible to vote.");
            }
        }
    }

    public static void main(String[] args) {
       new OddEven();
    }
}
