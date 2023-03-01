//package utilities;
//import java.sql.*;
//
//public class DatabaseClassShyam {
//    static String url = "jdbc:mysql://localhost:3306/bootcamp";
//    static String url = ConfigReader.getConfigProperty();
//    static String userName = "root";
//    static String userName = "root";
//    static String password = "Special@0";
//    static String password = "Special@0";
//
////
//
//    public static void executeQuery(String[] query) throws Exception {
//
//        //1. Get the connection -One time setup activity
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection con = DriverManager.getConnection(url, userName, password);
//        Statement stmt = con.createStatement();
//
//
//        //2. We are going to use whenever we want to execute the query
//
//        ResultSet rs = stmt.executeQuery("Select * from employees");
//
//
//        //4. Close the statement -One time closing activity
//        stmt.close();
//        con.close();
//    }
//
//
////    public static void main(String[] args) throws Exception {
////        //1. Get the connection -One time closing activity
////        Class.forName("com.mysql.cj.jdbc.Driver");
////        Connection con = DriverManager.getConnection(url, userName, password);
////
////        //2. Execute the query
////        //We are going to use whenever we want to execute the query
////        Statement stmt = con.createStatement();
////        ResultSet rs = stmt.executeQuery("Select * from employees");
////
////        //3. Process the result
////        while (rs.next()) {
////            System.out.println(rs.getString("first_name"));
////        }
////        //4. Close the statement -One time closing activity
////        stmt.close();
////        con.close();
////    }
//}
