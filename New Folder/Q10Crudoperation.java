import java.sql.*;
import java.util.Scanner;

public class Q10Crudoperation {
	static final String DB_URL = "jdbc:mysql://localhost/college_bern";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "select *from detail";
    public static Scanner sc= new Scanner(System.in);
    

    public static void insert(Statement stmt) {
    	
    	System.out.println("Enter your first name");
    	String fname=sc.next();
    	
    	System.out.println("Enter your last name");
    	String lname=sc.next();
 
    
    	String sql = "Insert into detail (first_name,last_name) values ('"+fname+"','"+lname+"')";
    	try {
   	
    		if(stmt.executeUpdate(sql)== 1) {
    			System.out.println("Data inserted successfully");
    		}	
    		
    	}catch(SQLException e) {
    		System.out.println(e);
    	}
    }
  public static void update(Statement stmt) {
	  
	  System.out.println("Enter your id of whose detail you want to update");
  	int  id=sc.nextInt();
    	
    	System.out.println("Enter your first name");
    	String fname=sc.next();
    	
    	System.out.println("Enter your last name");
    	String lname=sc.next();
 
    
    	String sql = "update detail set first_name='"+fname+"',last_name='"+lname+"' where id='"+id+"'";
    	try {
   	
    		if(stmt.executeUpdate(sql)== 1) {
    			System.out.println("Data inserted successfully");
    		}	
    		
    	}catch(SQLException e) {
    		System.out.println(e);
    	}
    }
public static void delete(Statement stmt) {
	  
	  System.out.println("Enter your id of whose detail you want to delete");
  	int  id=sc.nextInt();
    	
    	
 
    
    	String sql = "delete from detail where id='"+id+"'";
    	try {
   	
    		if(stmt.executeUpdate(sql)== 1) {
    			System.out.println("Data inserted successfully");
    		}	
    		
    	}catch(SQLException e) {
    		System.out.println(e);
    	}
    }
   	public static void read(Statement stmt) {
   		try {
   			ResultSet rs= stmt.executeQuery(QUERY);
// 			rs.absolute(2);
 			
   			
   			while(rs.next()){
   				System.out.println("Id :"+rs.getInt("id"));
   				System.out.println("Firstname :"+rs.getString("first_name"));
   				System.out.println("Lastname : "+rs.getString("last_name"));
   			
 
   			}
   			rs.close();
   			
   		}catch(SQLException e) {
   			System.out.println(e);
   		}
   	}
        public static void main(String[] args)throws SQLException {
        	try {
        		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);

        		Statement stmt = conn.createStatement(0,0,0);
        		
        		
        		
        		
        		while(true){
        		
        			System.out.println("CRUD Operations Menu:");
                    System.out.println("1. Create");
                    System.out.println("2. Read");
                    System.out.println("3. Update");
                    System.out.println("4. Delete");
                    System.out.println("5.Exit");
                    
                    System.out.print("Enter your choice: "); 
                    
                    
                    Scanner sc = new Scanner(System.in);
            		int choice=sc.nextInt();
        		switch(choice) {
        		case 1:
        			insert(stmt);
        			break;
        		case 2:
        			read(stmt);
        			break;
        		case 3:
        			update(stmt);
        			break;
        		case 4:
        			delete(stmt);
        			break;
        		case 5:
        			conn.close();
        			sc.close();
        			System.exit(0);
        		default:
        			System.out.println("Wrong Input");
        		
        		}
        		}
        		
        		
        		
        	}catch(SQLException e) {
        		System.out.println(e);
        	}
        }
    
    
	
}

