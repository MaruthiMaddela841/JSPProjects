package com.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStatement {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		try {
			//step1: Load and register the driver
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("Driver loaded successfully");
			//JDBC4.X Autoloading is enabled so above step became optional
			
			//2. Establish the connection with database
			String url="jdbc:mysql://localhost:3306/jdbcsessions";
			//This will work when JVM and DB are in one system
			//String url="jdbc:mysql:///jdbcsessions";
			String username="root";
			String password="Maru@841";
			connection=DriverManager.getConnection(url,username,password);
			System.out.println("Connection Established.....");
			System.out.println("Implemented Class name is:"+connection.getClass().getName());
			
			//3. Create statement object and execute the query
			statement=connection.createStatement();
			System.out.println("Statement class object:"+statement.getClass().getName());
			String sqlQuery="select * from students";
			resultSet=statement.executeQuery(sqlQuery);
			System.out.println("Result Set class object:"+resultSet.getClass().getName());
			
			//4. Process the resultset
			System.out.println("ID\tNAME\tAGE\tADDRESS");
			while(resultSet.next()) {
				Integer id=resultSet.getInt(1);
				String name=resultSet.getString(2);
				Integer age=resultSet.getInt(3);
				String address=resultSet.getString(4);
				//THis will also work
//				Integer id=resultSet.getInt("id");
//				String name=resultSet.getString("name");
//				Integer age=resultSet.getInt("age");
//				String address=resultSet.getString("address");
				System.out.println(id+"\t"+name+"\t"+age+"\t"+address);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(connection!=null) {
				try {
					resultSet.close();
					statement.close();
					connection.close();
				}
				catch(SQLException se) {
					se.printStackTrace();
				}
			}
			
		}
	}

}
