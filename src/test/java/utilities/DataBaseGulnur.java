//package utilities;
//
//import java.sql.*;
//
//public class DataBaseGulnur {
//    static String url="jdbc:mysql://localhost:3306/bootcamp"; //driver, dtatbase, servername, port number, name of database
//    static String username="root";
//    static String password="GulnurTestSQL1&";
//
//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection con = DriverManager.getConnection(url, username, password);
//
//        Statement statement = con.createStatement();
//        ResultSet rs= statement.executeQuery("SELECT * FROM bootcamp.employees limit 8;"); //ResultSet is an interface
//        //The ResultSet interface provides getter methods (getBoolean, getLong, and so on) for retrieving column values from the current row.
//        // Values can be retrieved using either the index number of the column or the name of the column.
//        // In general, using the column index will be more efficient. Columns are numbered from 1.
//
//        ResultSetMetaData rsm = rs.getMetaData();
//        int columnNumber = rsm.getColumnCount();
//
//        while (rs.next()) {
//            System.out.print(rs.getString("first_name") + " ");
//            System.out.println(rs.getString("last_name"));
//        }
//
////        ResultSetMetaData rsm = rs.getMetaData();
////        int columnNumber = rsm.getColumnCount();
////
////        while (rs.next()) {
////            System.out.println();
////            for (int i = 1; i < columnNumber; i++) {
////                System.out.print
////                        (rs.getString(i) + "|");
////            }
////            System.out.println();
////        }
//
//        //        ResultSetMetaData rsm=rs.getMetaData(); //An object that can be used to get information about the types and properties of the columns in a ResultSet object.
////        int columnNum= rsm.getColumnCount();
////
////
////        rs.next();//Moves the cursor forward one row from its current position. A ResultSet cursor is initially positioned before the first row;
////        // the first call to the method next makes the first row the current row; the second call makes the second row the current row, and so on
////
////        System.out.println(rs.getString("first_name"));
//
////        while(rs.next()){
////            System.out.print(rs.getString("emp_id")+" ");
////            System.out.print(rs.getString("first_name")+" ");//System.out.println(rs.getString(2)); //2 stands for column number for first name
////            System.out.println(rs.getString("last_name")); //System.out.println(rs.getString(3)); //3 stands for column number for last name
////        }
//
////        while(rs.next()){
////            for (int i = 1; i <columnNum ; i++) {
////                System.out.print(rs.getString(i)+"|"); //returns everything as a string
////            }
////            System.out.println();
////        }
//
////        //if we want the result an integer
////        while(rs.next()){
////           System.out.print(rs.getInt("salary")); //returns an integer
////        }
//
////        //Prints the whole table
////        ResultSetMetaData rsmd = rs.getMetaData();
////        int columnsNumber = rsmd.getColumnCount();
////
////        while(rs.next()){
////            for(int i =1 ; i <= columnsNumber;i++){
////                System.out.print(rs.getString(i)+ " ");
////            }
////            System.out.println();
////        }
//
////        Class.forName("com.mysql.cj.jdbc.Driver");
////        Connection con=DriverManager.getConnection(url, username, password);
////        Statement statement= con.createStatement();
////        ResultSet rs=statement.executeQuery("Select * FROM bootcamp.employees WHERE first_name='Ali';");
////
////        while (rs.next()){
////            System.out.print(rs.getString("first_name")+" ");
////            System.out.println(rs.getString("last_name"));
////        }
//
//    }
//}

