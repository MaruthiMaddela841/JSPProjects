package com.date;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Date uDate= new java.util.Date();
		System.out.println("uDate is:"+uDate);
		long value=uDate.getTime();
		System.out.println("value is:"+value);
		java.sql.Date sqlDate= new java.sql.Date(value);
		System.out.println("sqlDate is:"+sqlDate);
	}

}
