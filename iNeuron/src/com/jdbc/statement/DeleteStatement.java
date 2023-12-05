package com.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStatement {
	


	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		
		try {
			String url="jdbc:mysql://localhost:3306/jdbcsessions";
			String username="root";
			String password="Maru@841";
			connection=DriverManager.getConnection(url,username,password);
			statement=connection.createStatement();
			int i=statement.executeUpdate("delete from students where id=2");
			System.out.println("Rows effected:"+i);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			connection.close();
			statement.close();
			System.out.println("Closing the resources....");
		}
	}

}
