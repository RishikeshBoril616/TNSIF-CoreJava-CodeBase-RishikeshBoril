package com.TNSIF.Day15.jdbcoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class JDBCTable 
{
	public static void main(String[] args) 
	{
		try 
		{
			//Step: Load or register the driver
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded Successfully.");
			
			//Step 2: Create connection 
			
			Connection con = DriverManager.getConnection("jdbc:mysl://localhost:3306/dypatil-tnsif", "root" , "root" );
			System.out.println("Connection created successfully");
			
			//Step 3: create a statement
			
			Statement stmt=con.createStatement();
			System.out.println("Statement created successfully");
			
			//Step 4: Write a Query
			
			String q="create table student(stdid int, name varchar(20), subject varchar(20), duration double)";
			
			
			boolean s=stmt.execute(q);
		}
		
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
}
