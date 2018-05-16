package com.bitm.action;

import java.sql.*;


public class DBConnectivity 
{
	
    
	public static Connection getCon() 
	{

			Connection con=null;
			try
			{
				 Class.forName("com.mysql.jdbc.Driver");  
		          con = DriverManager.getConnection(  
		                    "jdbc:mysql://localhost:3306/movie_ticket", "root", "root"); 
			  
			}
			catch(Exception ex)
			{
			  ex.printStackTrace();
			}
			return con;

	}  
	
}
