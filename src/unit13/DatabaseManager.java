package unit13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Class for establishing a database connection to either, MySQL or PostgreSQL.
 *
 * @author Andreas Schneider
 */
public class DatabaseManager
{

    // MySQL connection parameters
    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String MYSQL_USER = "your_mysql_username";
    private static final String MYSQL_PASSWORD = "your_mysql_password";

    // PostgreSQL connection parameters
    private static final String POSTGRESQL_URL = "jdbc:postgresql://localhost:5432/your_database";
    private static final String POSTGRESQL_USER = "your_postgresql_username";
    private static final String POSTGRESQL_PASSWORD = "your_postgresql_password";

    // Method to establish a MySQL database connection
    public static Connection getMySQLConnection() throws SQLException
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(MYSQL_URL, MYSQL_USER, MYSQL_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new SQLException("Error establishing MySQL connection: " + e.getMessage());
        }
    }

    // Method to establish a PostgreSQL database connection
    public static Connection getPostgreSQLConnection() throws SQLException
    {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(POSTGRESQL_URL, POSTGRESQL_USER, POSTGRESQL_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new SQLException("Error establishing PostgreSQL connection: " + e.getMessage());
        }
    }

    /**
     * Establishes a connection either a MySQL instance or a PostgreSQL
     * instance.
     *
     * @param selection Choose either "MySQL" or "PostgreSQL"
     */
    public static void connect(String selection)
    {
        try 
        {
            if (selection.equals("MySQL")) 
            {
                // Establish MySQL connection
                Connection mysqlConnection = getMySQLConnection();
                System.out.println("MySQL Connection established successfully");
                // Close connection when done
                mysqlConnection.close();
            } 
            else if (selection.equals("PostgreSQL")) 
            {
                // Establish PostgreSQL connection
                Connection postgresqlConnection = getPostgreSQLConnection();
                System.out.println("PostgreSQL Connection established successfully");
                // Close connection when done
                postgresqlConnection.close();
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}
