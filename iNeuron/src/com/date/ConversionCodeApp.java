package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ConversionCodeApp {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date in format MM-yyyy-dd:");
		String str=sc.next();
		
		SimpleDateFormat sdf= new SimpleDateFormat("MM-yyyy-dd");
		java.util.Date uDate=sdf.parse(str);
		
		long value=uDate.getTime();
		java.sql.Date sqlDate= new java.sql.Date(value);
		
		System.out.println("String Format:"+str);
		System.out.println("Util Date:"+uDate);
		System.out.println("SQL Date:"+sqlDate);
		
		System.out.println("Enter date in format:yyyy-MM-dd");
		String str2=sc.next();
		java.sql.Date input=java.sql.Date.valueOf(str2);
		System.out.println("Input value is:"+input);
		sc.close();
	}

}
