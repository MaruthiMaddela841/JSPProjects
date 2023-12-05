package com.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.statement.JDBCUtil;

public class DeleteUsingPreparedStatement {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement ps=null;
		ResultSet resultSet=null;
		Scanner sc=new Scanner(System.in);
		try {
			connection=JDBCUtil.getJDBCConnection();
			String query="delete from students where id=?;";
			if(connection!=null)
				ps=connection.prepareStatement(query);
			if(ps!=null) {
				System.out.println("Enter Id:");
				int id=sc.nextInt();
				ps.setInt(1, id);
				int rowsEffected=ps.executeUpdate();
				System.out.println("Rows Effected:"+rowsEffected);
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
