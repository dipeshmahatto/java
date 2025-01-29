
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetMetaData;
import javax.sql.rowset.RowSetEvent;
import javax.sql.rowset.RowSetListener;

public class Q9RowSet {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "";

        try {
            // Step 1: Register JDBC driver and establish a connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Step 2: Create a RowSetFactory and a JdbcRowSet
            RowSetFactory rowSetFactory = RowSetProvider.newFactory();
            JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();

            // Step 3: Configure the RowSet with connection information
            rowSet.setUrl(jdbcUrl);
            rowSet.setUsername(username);
            rowSet.setPassword(password);

            // Step 4: Set up a listener to handle events (optional)
            rowSet.addRowSetListener((javax.sql.RowSetListener) new MyRowSetListener());

            // Step 5: Execute a SQL query to fetch data
            rowSet.setCommand("SELECT * FROM record");
            rowSet.execute();

            // Step 6: Iterate through the RowSet and display the results
            RowSetMetaData metaData = rowSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rowSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(metaData.getColumnName(i) + ": " + rowSet.getObject(i) + "\t");
                }
                System.out.println();
            }

            // Step 7: Close the RowSet and the database connection
            rowSet.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

// Optional listener class to handle RowSet events
class MyRowSetListener implements RowSetListener {
    public void cursorMoved(RowSetEvent event) {
        System.out.println("Cursor moved...");
    }

    public void rowChanged(RowSetEvent event) {
        System.out.println("Row changed...");
    }

    public void rowSetChanged(RowSetEvent event) {
        System.out.println("RowSet changed...");
    }
}
