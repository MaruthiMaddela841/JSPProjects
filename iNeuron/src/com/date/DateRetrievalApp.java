package com.date;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.jdbc.statement.JDBCUtil;

public class DateRetrievalApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection connection=null;
		PreparedStatement ps=null;
		Scanner sc=null;
		String name=null;
		String dob=null;
		String dom=null;
		java.util.Date uDate=null;
		java.sql.Date sqlDate=null;
		java.sql.Date sqlDate2=null;
		SimpleDateFormat sdf=null;
		ResultSet resultSet=null;
		try {
			connection=JDBCUtil.getJDBCConnection();
			String query="select * from users where id=?;";
			if(connection!=null)
				ps=connection.prepareStatement(query);
			if(ps!=null) {
				System.out.println("Enter Id:");
				sc=new Scanner(System.in);
				int id=sc.nextInt();
				ps.setInt(1, id);
				resultSet=ps.executeQuery();
			}
			if(resultSet!=null) {
				System.out.println("ID\tNAME\tDOB\tDOM");
				if(resultSet.next()) {
				while(resultSet.next()) {
					Integer id=resultSet.getInt(1);
					String name2=resultSet.getString(2);
					sdf= new SimpleDateFormat("dd-MM-yyyy");
					String input1=sdf.format(resultSet.getDate(3));
					String input2=sdf.format(resultSet.getDate(4));
					System.out.println(id+"\t"+name2+"\t"+input1+"\t"+input2);
				}
				}
				else {
					System.out.println("Records not available");
				}
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			JDBCUtil.cleanUp(connection, ps, resultSet);
			sc.close();
		}

	}

}
