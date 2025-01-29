

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class LoginValidation implements ActionListener{
	static final String DB_URL="jdbc:mysql://localhost/employee";
	static final String USER="root";
	static final String PASS="";
	static final String QUERY="select*from record";
	
	JFrame jf;
	JButton submit;
	JTextField user;
	JTextField pass;
	JLabel ul,up,info,res;
	
	LoginValidation(){
		jf= new JFrame("User Login");
		
		ul = new JLabel("Enter Username");
		ul.setBounds(100,50,200,50);
		jf.add(ul);
					
		user= new JTextField();
		user.setBounds(100,90,200,30);
		jf.add(user);
		
		

		up = new JLabel("Enter Password");
		up.setBounds(100,110,200,50);
		jf.add(up);
		
		pass = new JTextField();
		pass.setBounds(100,160,200,30);
		jf.add(pass);
		
		
		
		
		submit= new JButton("Login");
		submit.setBounds(100,210,200,40);
		submit.addActionListener(this);
		jf.add(submit);
		
		
		res = new JLabel();
		res.setBounds(100,250,200,50);
		jf.add(res);
		
	
		
		
		
		jf.setSize(400,400);
		
	
		jf.setLayout(null);
		jf.setVisible(true);
		jf.getDefaultCloseOperation();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource()==submit) {
		try {
		Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
		Statement stmt = conn.createStatement();
		Read(stmt);
		
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
		}
	
		
	}
	
	public void Read(Statement stmt) {
		
		String sql="select *from record";
		
		try {
			ResultSet rs=stmt.executeQuery(QUERY);
			while(rs.next()) {
				
		
				String username=rs.getString("username");
				String password = rs.getString("password");
				
			
			if((username.equals(user.getText()))&&(password.equals(pass.getText()))){
				
				
				submit.setVisible(false);
				user.setVisible(false);
				pass.setVisible(false);
				ul.setVisible(false);
				up.setVisible(false);
				info.setVisible(false);
				
				res.setText("Hello "+user.getText());
				res.setBounds(100,100,100,100);
				
				
				
			}else{
				res.setText("Incorrect Username or Password");
			}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		new LoginValidation();
		
	}
}