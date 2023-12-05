package com.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertIntoUsinfStringFormat {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection=null;
		Statement statement=null;
		Scanner sc=new Scanner(System.in);
		try {
			String url="jdbc:mysql://localhost:3306/jdbcsessions";
			String username="root";
			String password="Maru@841";
			connection=DriverManager.getConnection(url,username,password);
			statement=connection.createStatement();
			System.out.println("Enter name to insert:");
			String name=sc.next();
			System.out.println("Enter age to insert:");
			int age=sc.nextInt();
			System.out.println("Enter address to insert:");
			String address=sc.next();
			String query=String.format("INSERT INTO students(name, age, address) VALUES ('%s',%d,'%s');", name,age,address);
			int i=statement.executeUpdate(query);
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
