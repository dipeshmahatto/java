


import java.sql.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Employee implements ActionListener {
    JTextField F_name,L_name,address,id;
    JFrame jf,jfadd,jfupdate;
    JButton add, update,delete,submitadd,submitupd,submitdel;
    JLabel labelf,labell,ladd,lid,result;    
    
    
    
	int x=10;
    
    
    
    JLabel r;
    Employee(){
        jf = new JFrame("Database Form");
        jf.setLayout(null);
        jf.setSize(300,300);
        
        
        add = new JButton("Add");
        add.setBounds(70, 80, 80, 30);
        add.addActionListener(this);
        
        update = new JButton("Update");
        update.setBounds(70, 150, 80, 30);
        update.addActionListener(this);
        
        
        
        delete = new JButton("Delete");
        delete.setBounds(70, 190, 80, 30);
        delete.addActionListener(this);
        
        
        
        jf.add(delete);
        jf.add(add);
        jf.add(update);
        
        jf.setVisible(true);
        
        
        
        
      

        
    }
    public void actionPerformed(ActionEvent e){
    	
    

        if(e.getSource()== add){
            jfadd = new JFrame("Add Employee");
            jfadd.setSize(500,500);
            jfadd.setVisible(true);
            jfadd.setLayout(null);
            
            labelf= new JLabel("First name");
            labelf.setBounds(150, 50, 150, 20);
            jfadd.add(labelf);
            F_name = new JTextField();
            F_name.setBounds(150, 70, 150, 30);
            jfadd.add(F_name);
            
            labell= new JLabel("Last name");
            labell.setBounds(150, 100, 150, 20);
            jfadd.add(labell);
            L_name = new JTextField();
            L_name.setBounds(150, 120, 150, 30);
            jfadd.add(L_name);
            
            ladd= new JLabel("Address");
            ladd.setBounds(150, 150, 150, 20);
            jfadd.add(ladd);
            address = new JTextField();
            address.setBounds(150, 170, 150, 30);
            jfadd.add(address);
            
            
            submitadd = new JButton("Submit");
            submitadd.setBounds(170,210,100,30);
            submitadd.addActionListener(this);
            jfadd.add(submitadd);
            
            
            result= new JLabel();
            result.setBounds(150, 250, 200, 30);
            jfadd.add(result);
        }
        
        
        
        if(e.getSource()== update){
        	x=0;
            jfadd = new JFrame("Update Employee");
            jfadd.setSize(500,1000);
            jfadd.setVisible(true);
            jfadd.setLayout(null);
            
            
            
            
            
            
            
            try {
        		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
        		Statement stmt= conn.createStatement();
        		
        		
        		Read(stmt);

        		
        		stmt.close();
        		
        	}catch(SQLException a) {
        		System.out.println(a);
        	}
            
            
          
            lid= new JLabel("Id");
            lid.setBounds(150, x+50, 150, 20);
            jfadd.add(lid);
            id = new JTextField();
            id.setBounds(150, x+70, 150, 30);
            jfadd.add(id);
            
            labelf= new JLabel("First name");
            labelf.setBounds(150, x+100, 150, 20);
            jfadd.add(labelf);
            F_name = new JTextField();
            F_name.setBounds(150, x+120, 150, 30);
            jfadd.add(F_name);
            
            labell= new JLabel("Last name");
            labell.setBounds(150, x+150, 150, 20);
            jfadd.add(labell);
            L_name = new JTextField();
            L_name.setBounds(150, x+170, 150, 30);
            jfadd.add(L_name);
            
            ladd= new JLabel("Address");
            ladd.setBounds(150, x+200, 150, 20);
            jfadd.add(ladd);
            address = new JTextField();
            address.setBounds(150, x+220, 150, 30);
            jfadd.add(address);
            
            
            submitupd = new JButton("Update");
            submitupd.setBounds(170,x+260,100,30);
            submitupd.addActionListener(this);
            jfadd.add(submitupd);
            
            
            result= new JLabel();
            result.setBounds(150, x+300, 200, 30);
            jfadd.add(result);
            
            
            
            
            
            
          
            
        }
        
        if(e.getSource()== delete){
        	x=0;
            jfadd = new JFrame("Delete Employee");
            jfadd.setSize(500,1000);
            jfadd.setVisible(true);
            jfadd.setLayout(null);
            
            
            
            
            
            
            
            try {
        		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
        		Statement stmt= conn.createStatement();
        		
        		
        		Read(stmt);

        		
        		stmt.close();
        		
        	}catch(SQLException a) {
        		System.out.println(a);
        	}
            
            
          
            lid= new JLabel("Id");
            lid.setBounds(150, x+50, 150, 20);
            jfadd.add(lid);
            id = new JTextField();
            id.setBounds(150, x+70, 150, 30);
            jfadd.add(id);
            
           
            
            
            submitdel = new JButton("Delete");
            submitdel.setBounds(170,x+260,100,30);
            submitdel.addActionListener(this);
            jfadd.add(submitdel);
            
            
            result= new JLabel();
            result.setBounds(150, x+300, 200, 30);
            jfadd.add(result);
            
            
            
            
            
            
          
            
        }
        if(e.getSource()== submitadd) {

        	try {
        		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
        		Statement stmt= conn.createStatement();
        		
        		
        		Insert(stmt);
        		
        		stmt.close();
        		
        	}catch(SQLException a) {
        		System.out.println(a);
        	}
        }
        if(e.getSource()== submitupd) {
        

        	try {
        		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
        		Statement stmt= conn.createStatement();
        		
        		
        		Update(stmt);
        	
        		
        		stmt.close();
        		
        	}catch(SQLException a) {
        		System.out.println(a);
        	}
       
        }
        if(e.getSource()== submitdel) {
            

        	try {
        		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
        		Statement stmt= conn.createStatement();
        		
        		
        		Delete(stmt);
        	
        		
        		stmt.close();
        		
        	}catch(SQLException a) {
        		System.out.println(a);
        	}
       
        }
        
      }
    
    
    static final String DB_URL = "jdbc:mysql://localhost/java";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "select *from employee";
    
    
	public  void Read(Statement stmt) {
		try {
			ResultSet rs= stmt.executeQuery(QUERY);
			
			
		
			while(rs.next()){
				
			    r= new JLabel();
				r.setBounds(30,x,500,20);
				r.setText("Id : "+rs.getString("id")+",  First_Name : "+rs.getString("first_name")+",  Last_name : "+rs.getString("last_name")+
						" ,  Address : "+rs.getString("address"));
				jfadd.add(r);
				
				x=x+25;				;
				
				
//				

			}
			rs.close();
			
			
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
    

    public void Insert(Statement stmt) {
    	
    
    	String sql = "Insert into employee (first_name,last_name,address) values ('"+F_name.getText()+"','"+L_name.getText()+"','"+address.getText()+"')";
    	try {
//    		stmt.executeUpdate(sql);
    		
    
    		if (stmt.executeUpdate(sql) == 1) {
    			F_name.setText("");
    			L_name.setText("");
    			address.setText("");
    			result.setText("Employee Added  successfully");
    			
//    			
    			
    			
    		}
    	
    		
    		
    	}catch(SQLException e) {
    		System.out.println(e);
    	}
    }
    public void Update(Statement stmt) {
    	
        
    
    	String sql = "update employee set id='"+id.getText()+"',first_name='"+F_name.getText()+"',last_name='"+L_name.getText()+"',address='"+address.getText()+"' WHERE id='"+id.getText()+"'";
    	try {
//    		stmt.executeUpdate(sql);
    		
    
    		if (stmt.executeUpdate(sql) == 1) {
    			F_name.setText("");
    			L_name.setText("");
    			address.setText("");
    			result.setText("Employee updated successfully");
//    		
    			
    			
    		}
    	
    		
    		
    	}catch(SQLException e) {
    		System.out.println(e);
    	}
    }
    
    public void Delete(Statement stmt) {
    	
        
        
    	String sql = "delete from employee WHERE id='"+id.getText()+"'";
    	try {
//    		stmt.executeUpdate(sql);
    		
    
    		if (stmt.executeUpdate(sql) == 1) {
    			
    			result.setText("Employee Deleted successfully");
//    		
    			
    			
    		}
    	
    		
    		
    	}catch(SQLException e) {
    		System.out.println(e);
    	}
    }
    public static void main(String[] args) {
        new Employee();
        
    }
}


