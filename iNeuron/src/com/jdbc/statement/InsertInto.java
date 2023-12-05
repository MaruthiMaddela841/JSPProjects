package com.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertInto {

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
				int i=statement.executeUpdate("INSERT INTO students(name, age, address) VALUES ('mj',26, 'london');");
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
