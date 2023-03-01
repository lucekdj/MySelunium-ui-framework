package utilities;

import java.sql.*;

public class DataBaseUtils {   //   Shyam he transfers old DataBaseClass into Utils
    // localhost:API address where to go to the server

    static String url = ConfigReader.getConfigProperty("db.url3");
    static String username = ConfigReader.getConfigProperty("db.userName3");
    static String password = ConfigReader.getConfigProperty("db.password3");


    static Connection connection;
    static Statement statement;
    static ResultSet result;


    public static void initializeDBProperties() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // here we will register our driver for mySQL - google it
            // now connect driver              // where to connect (url)
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static ResultSet executeQuery(String query) {
        try {

            result = statement.executeQuery(query);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void closeDatabaseConnection() {
        try {
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }



}

