import java.sql.*;

public class JDatabase {
    static final String DB_URL = "jdbc:mysql://localhost/java";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "SELECT * FROM javaclass";

    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(QUERY)
        ) {
            while (rs.next()) {
                System.out.print("ID : "+rs.getInt("id"));
                System.out.print(", Name: "+rs.getString("firstname"));
                System.out.print(" "+rs.getString("lastname"));
                System.out.print(", Phonenumber: "+rs.getInt("phonenumber"));
                System.out.print(", Address: "+rs.getString("address"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
