package com.date;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.jdbc.statement.JDBCUtil;

public class DateInsertionApp {

	public static void main(String[] args) throws IOException, SQLException {
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
		try {
			connection=JDBCUtil.getJDBCConnection();
			String query="INSERT INTO users(name, dob,dom) VALUES (?,?,?);";
			if(connection!=null) {
				ps=connection.prepareStatement(query);
			}
			if(ps!=null) {
				 sc=new Scanner(System.in);
				if(sc!=null) {
					System.out.print("Name:");
					name=sc.next();
					System.out.print("dob in format dd-MM-yyyy:");
					dob=sc.next();
					System.out.print("dom in format yyyy-MM-dd:");
					dom=sc.next();
					if(dob!=null) {
					sdf= new SimpleDateFormat("dd-MM-yyyy");
					uDate=sdf.parse(dob);
					long value=uDate.getTime();
					sqlDate= new java.sql.Date(value);
					}
					if(dom!=null)
						sqlDate2= java.sql.Date.valueOf(dom);
					ps.setString(1, name);
					ps.setDate(2, sqlDate);
					ps.setDate(3, sqlDate2);
					int i=ps.executeUpdate();
					System.out.println("Records Updated:"+i);
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
			JDBCUtil.cleanUp(connection, ps, null);
			sc.close();
		}

	}

}
