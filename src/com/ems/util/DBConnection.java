package com.ems.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	 public static Connection createConnection()
	   {
		   Connection con=null;
		//   String url="jdbc:mysql://localhost:3306/EMS?useSSL=false";
		//   String username="root";
		//   String passwoord="santhi@123";
	       try
	       { 
	    	   Class.forName("com.mysql.jdbc.Driver");  
	 			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/EMS?useSSL=false","root","santhi@123");    	    	   
	       }
	       catch(Exception e)
	       {
	    	   e.printStackTrace();
	       }
	       return con;
		   
	   }
}
