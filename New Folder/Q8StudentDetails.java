import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Q8StudentDetails{
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "";

        // Swing components
        JFrame frame = new JFrame("Student Details");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        model.addColumn("Student ID");
        model.addColumn("Name");
        model.addColumn("Course");
        model.addColumn("Grade");

        try {
            // Connect to the database
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            // Query to fetch student details
            String query = "SELECT * FROM record";
            ResultSet resultSet = statement.executeQuery(query);

            // Populate the JTable with data from the database
            while (resultSet.next()) {
                int studentId = resultSet.getInt("student_id");
                String name = resultSet.getString("name");
                String course = resultSet.getString("course");
                String grade = resultSet.getString("grade");

                model.addRow(new Object[]{studentId, name, course, grade});
            }

            // Close the database connection
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: Unable to connect to the database.");
        }

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
