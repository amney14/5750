package fa0412.project2.utils;



import java.sql.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

   
public class MysqlConnection {
   
  public static void main(String[] args) {

    // Load the driver
    try {

      // Load the driver class
      Class.forName("com.mysql.jdbc.Driver");

      // Define the data source for the driver
      String sourceURL = "jdbc:mysql://localhost:3306/csc5750";

      // Create a connection through the DriverManager
      Connection databaseConnection = 
        DriverManager.getConnection(sourceURL,"root","rttcadmin");
        
        // create Statement to query database
        Statement statement = databaseConnection.createStatement();
            
            
            
            ResultSet results = statement.executeQuery( "select * from registration" ); 
              
            System.out.println("Connection established successfully!");
      
               while ( results.next() ) {
           System.out.print( results.getString( 1 ) + " " );
             System.out.print( results.getString( 2 ) + " " );
              System.out.println( results.getString( 3 ) );
            }
      

      // close connection
      databaseConnection.close();
    } 
      catch (ClassNotFoundException cnfe) {
      System.err.println(cnfe);
    } 
      catch (SQLException sqle) {
      System.err.println(sqle);
    } 
  } 
}
