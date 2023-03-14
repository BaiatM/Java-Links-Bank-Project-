package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseUtils {
    static String url = ConfigReader.getProperty("db.url") ;
    //static String url="jdbc:mysql://localhost:3306/bootcamp"; //driver, dtatbase, servername, port number, name of database
    static String username=ConfigReader.getProperty("db.username");
    //static String username="root";
    static String password=ConfigReader.getProperty("db.password");
    //  static String password="GulnurTestSQL1&";

    static Connection con;
    static Statement statement;
    static ResultSet resultSet;

    public static void initializeDBProperties() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //system.setProperty same as that --registering driver
            con = DriverManager.getConnection(url, username, password); //establishes connection to the database --getting the connection
            //A connection (session) with a specific database. SQL statements are executed and results are returned within the context of a connection
            statement = con.createStatement(); //create a statement reference variable from statement interface
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet executeQuery(String query) {
        try {
            resultSet = statement.executeQuery(query);
            //  ResultSet rs= statement.executeQuery("SELECT * FROM bootcamp.employees limit 8;"); //ResultSet is an interface
            //The ResultSet interface provides getter methods (getBoolean, getLong, and so on) for retrieving column values from the current row.
            // Values can be retrieved using either the index number of the column or the name of the column.
            // In general, using the column index will be more efficient. Columns are numbered from 1.
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public static void deleteQuery(String query){
        try {
            statement.execute(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void closeDataBaseConnection(){
        try{
            statement.close();
            con.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
