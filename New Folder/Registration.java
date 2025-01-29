 

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class Registration implements ActionListener{
	static final String DB_URL="jdbc:mysql://localhost/Employee";
	static final String USER="root";
	static final String PASS="";
	
	JFrame jf;
	JButton submit;
	JTextField user;
	JTextField pass;
	JLabel ul,up,info,res;
	
	Registration(){
		jf= new JFrame("User Registration");
		
		
		info= new JLabel("User Registration");
		info.setBounds(100,5,200,50);
		jf.add(info);
		
		ul = new JLabel("Enter Username");
		ul.setBounds(100,55,200,50);
		jf.add(ul);
					
		user= new JTextField();
		user.setBounds(100,95,200,30);
		jf.add(user);
		
		

		up = new JLabel("Enter Password");
		up.setBounds(100,125,200,50);
		jf.add(up);
		
		pass = new JTextField();
		pass.setBounds(100,175,200,30);
		jf.add(pass);
		
		
		
		
		submit= new JButton("Submit");
		submit.setBounds(100,210,200,40);
		submit.addActionListener(this);
		jf.add(submit);
		
		
		res = new JLabel();
		res.setBounds(100,250,200,50);
		jf.add(res);
		
	
		
		
		
		jf.setSize(500,500);
		jf.getDefaultCloseOperation();
	
		jf.setLayout(null);
		jf.setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource()==submit) {
		try {
		Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
		Statement stmt = conn.createStatement();
		insert(stmt);
		
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
		}
	
		
	}
	
	public void insert(Statement stmt) {
		
		String sql="insert into record (username,password)"
				+ "values('"+user.getText()+"','"+pass.getText()+"')";
		
		try {
			
			if(stmt.executeUpdate(sql)==1) {
				res.setText("User Registered");
				
			}else {
				res.setText("Registration Failed");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		new Registration();
		
	}
}