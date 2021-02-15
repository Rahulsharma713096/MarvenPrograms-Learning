package com.simpleSqlApp.sqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome" );
        try {
        	System.out.println("Try to connect db");
      /*  	Driver d=new com.mysql.jdbc.Driver();
       * DriverManager.registerDriver(d);
       * Loading class `com.mysql.jdbc.Driver'. 
       * This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. 
       * The driver is automatically registered via the SPI and manual loading of the driver class 
       * is generally unnecessary.
       */
        	
        	Connection con=DriverManager.getConnection(  
        	"jdbc:mysql://localhost:3306/zucol","root","12345678");  
        	System.out.println("DB connected");   
        	System.err.println("Connect");
        	
        	con.close();
        } catch (SQLException e) {
        	System.err.println(" Not Connect");
        	e.printStackTrace();
        } catch (Exception e) {
        	System.err.println(" unable to Connect");
        	e.printStackTrace();
        }
    }
    
}
