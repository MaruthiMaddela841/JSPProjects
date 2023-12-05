package com.jdbc.preparedstatement;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.statement.JDBCUtil;

public class InserIntoPreparedStatement {

	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement ps=null;
		ResultSet resultSet=null;
		Scanner sc=new Scanner(System.in);
		try {
			connection=JDBCUtil.getJDBCConnection();
			String query="INSERT INTO students(name, age, address) VALUES (?,?,?);";
			if(connection!=null)
				ps=connection.prepareStatement(query);
			if(ps!=null) {
				System.out.println("Enter Name:");
				String name=sc.next();
				System.out.println("Enter Age:");
				int age=sc.nextInt();
				System.out.println("Enter Address:");
				String address=sc.next();
				ps.setString(1, name);
				ps.setInt(2, age);
				ps.setString(3, address);
				int rowsEffected=ps.executeUpdate();
			}
				
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			}
		
	finally {
		JDBCUtil.cleanUp(connection, ps, null);
		sc.close();
		System.out.println("Closing the resources...");
		}
	}
}
