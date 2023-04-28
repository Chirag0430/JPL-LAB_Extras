import java.sql.*;

public class sql_EmpDetails {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/employees";

    static final String USER = "root";
    static final String PASS = "1234";

    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            // CREATE
            String sql = "INSERT INTO employees (id, name, age) VALUES (100, 'John Doe', 25)";
            stmt.executeUpdate(sql);
            System.out.println("Record inserted successfully");

            // READ
            sql = "SELECT * FROM employees";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // UPDATE
            sql = "UPDATE employees SET age = 26 WHERE id = 100";
            int rowsUpdated = stmt.executeUpdate(sql);
            if (rowsUpdated > 0) {
                System.out.println("Record updated successfully");
            } else {
                System.out.println("Record not found");
            }

            // DELETE
            sql = "DELETE FROM employees WHERE id = 100";
            int rowsDeleted = stmt.executeUpdate(sql);
            if (rowsDeleted > 0) {
                System.out.println("Record deleted successfully");
            } else {
                System.out.println("Record not found");
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
