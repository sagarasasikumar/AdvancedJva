package com.ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import java.sql.*;
import com.ems.util.DBConnection;

public class EmsDao {
	Connection con=DBConnection.createConnection();
	
		public String adminLoginCheck(String name,String paswd) 
		{    //   Connection con=DBConnection.createConnection();
 		  if(name.equals("admin") && paswd.equalsIgnoreCase("admin123"))
		 {
			 return "admin";
		 }
 		  else
 		  {
 			  try
 			  {
 				  PreparedStatement ps=null;
			ps=con.prepareStatement("select * from employee where uid=? and paswd=?"); 
	         ps.setString(1,name);
	         ps.setString(2,paswd);
			 ResultSet i =ps.executeQuery();
	  			if(i.next())
	  			{  
	  				System.out.println("success");
	  				return "user";
	  			}
		 }
		 catch(Exception e)
		 {

			 e.printStackTrace();
			 }
		return "invalid";
  			 
 		  }
 		
 			
}

	public boolean addEmployee(String uid, String fname, String lname, String mail, String paswd, String dept, String dob) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
			PreparedStatement ps=null;
		try
		{
			ps=con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)"); 
	         ps.setString(1,uid);
		     ps.setString(2,fname);
	         ps.setString(3,lname);
             ps.setString(4,mail);
             ps.setString(5,paswd);
             ps.setString(6, dept);
             ps.setString(7,dob);
             int i=ps.executeUpdate();
            if(i!=0)
            {
            	return true;
            }
            con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	public boolean editEmployee(String uid, String fname, String lname, String mail, String dept, String dob) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	//	Class.forName("com.mysql.jdbc.Driver");  
  		PreparedStatement ps=null;
		try
		{   
			ps=con.prepareStatement("update employee set fname=?,lname=?,mail=?,dept=?,dob=? where uid=?"); 
			ps.setString(6,uid);
		    ps.setString(1,fname);
	        ps.setString(2,lname);
            ps.setString(3,mail);
            ps.setString(4, dept);
            ps.setString(5,dob);
            int i=ps.executeUpdate();
            if(i!=0)
            {
            	return true;
            }
           			
           con.close(); 
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		return false;
}

	public boolean deleteEmployee(String uid) {
		// TODO Auto-generated method stub
		PreparedStatement ps=null;
		try
		{   
			ps=con.prepareStatement("delete from employee where uid=?"); 
			ps.setString(1,uid);
			 int i=ps.executeUpdate();
	            if(i!=0)
	            {
	            	return true;
	            }
	           			
	           con.close(); 
		}catch(Exception e)
			{
			e.printStackTrace();
			}
			return false;
			}

	public boolean addDepartment(String deptid, String dname) {
		
		PreparedStatement ps=null;
		try
		{   
			ps=con.prepareStatement("insert into department values(?,?)"); 
			ps.setString(1,deptid);
			ps.setString(2,dname);
			 int i=ps.executeUpdate();
	            if(i!=0)
	            {
	            	return true;
	            }
	           			
	           con.close(); 
		}catch(Exception e)
			{
			e.printStackTrace();
			}
			return false;
	}

	public boolean addRegulations(String rtype, String rdetails, String cdate, String dname) {
		// TODO Auto-generated method stub
		PreparedStatement ps=null;
		try
		{   
			ps=con.prepareStatement("insert into regulation values(?,?,?,?)"); 
			ps.setString(1,rtype);
			ps.setString(2,rdetails);
			ps.setString(3,cdate);
			ps.setString(4,dname);
			 int i=ps.executeUpdate();
	            if(i!=0)
	            {
	            	return true;
	            }
	           				
	           con.close(); 
		}catch(Exception e)
			{
			e.printStackTrace();
			}
		
		return false;
	}
	
	
}