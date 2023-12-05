package com.jdbc.statement;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsageOfJDBCUtil {

	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		try {
			connection=JDBCUtil.getJDBCConnection();
			if(connection!=null) 
				statement=connection.createStatement();
			if(statement!=null)
				resultSet=statement.executeQuery("select * from students");
			if(resultSet!=null) {
				while(resultSet.next()) {
					System.out.println("ID\tNAME\tAGE\tADDRESS");
					while(resultSet.next()) {
						Integer id=resultSet.getInt(1);
						String name=resultSet.getString(2);
						Integer age=resultSet.getInt(3);
						String address=resultSet.getString(4);
						//System.out.println(id+"\t"+name+"\t"+age+"\t"+address);
						System.out.printf("%d%11s%6d%8s", id,name,age,address);
						System.out.println();
					}
				}
			}
			
		}
		finally {
			try {
			JDBCUtil.cleanUp(connection, statement, resultSet);
			System.out.println("Closing Resources.....");
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		}
		
	}

}
