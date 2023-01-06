package com.cg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Data access Object
public class EmployeeDao 
{
	//making a connection between Java and MySql
	public Connection createConnection()
	{
		String URL="jdbc:mysql://localhost:3306/TNS";
		String user="root";
		String password="Ahmed@123";
		
		//for Different exception we have used 2 try catch block
		//to check whether there is a driver class to check external jar is there or not
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver"); //programming interface that 
			//where data is stored lets java application access relational data base 
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
			//it will show what the error is
		}
		
		//to check the parameters
		Connection c;
		try
		{
			c=DriverManager.getConnection(URL, user, password);
		}
		catch(SQLException e)
		{
			c=null;
		}
		return c;
				
	}

}
