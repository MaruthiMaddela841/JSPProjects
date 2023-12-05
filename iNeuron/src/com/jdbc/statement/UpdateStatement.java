package com.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStatement {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection=null;
		Statement statement=null;
		try {
			String url="jdbc:mysql://localhost:3306/jdbcsessions";
			String username="root";
			String password="Maru@841";
			connection=DriverManager.getConnection(url,username,password);
			statement=connection.createStatement();
			int i=statement.executeUpdate("Update students set address='canada' where name='mj';");
			System.out.println("Rows effected:"+i);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			connection.close();
			statement.close();
		}
	}

}
