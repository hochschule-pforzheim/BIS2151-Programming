package unit13;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for running SQL queries and saving the output as a file.
 *
 * @author Andreas Schneider
 */
public class QueryRunner
{

    public static void runQuery()
    {
        try {
            // Establish MySQL connection
            Connection connection = DatabaseManager.getMySQLConnection();
            System.out.println("MySQL Connection established successfully");

            // Run a simple SQL query
            String sqlQuery = "SELECT * FROM your_table";
            List<String> queryResult = executeQuery(connection, sqlQuery);

            // Persist the query result as a serialized file
            serializeQueryResult(queryResult, "output.ser");

            // Close the connection when done
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static List<String> executeQuery(Connection connection, String sqlQuery) throws SQLException
    {
        List<String> result = new ArrayList<>();

        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery); 
                ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                // Assuming a simple string column in the result set, modify accordingly
                String columnValue = resultSet.getString("column_name");
                result.add(columnValue);
            }
        }

        return result;
    }

    private static void serializeQueryResult(List<String> queryResult, String outputFile)
    {
        try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile); 
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(queryResult);
            System.out.println("Query result serialized to " + outputFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
