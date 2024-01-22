<%@ page language="java" import="java.sql.*"%>


<%!

	Connection connection=null;
	PreparedStatement ps1=null;
	PreparedStatement ps2=null;
	public void jspInit(){
	System.out.println("Boostrapping the environment...");
	ServletConfig config=getServletConfig();
	String url= config.getInitParameter("url");
	String user=config.getInitParameter("user");
	String password=config.getInitParameter("password");
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection(url,user,password);
		ps1=connection.prepareStatement("INSERT INTO EMPLOYEES(NAME, AGE, ADDRESS,SALARY) VALUES (?,?,?,?);");
		ps2=connection.prepareStatement("SELECT ID,NAME,AGE,ADDRESS,SALARY FROM EMPLOYEES;");
	}
	catch(ClassNotFoundException ce){
		ce.printStackTrace();
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
%>

<%
	String action=request.getParameter("s1");
	System.out.println(action);
	if(action.equalsIgnoreCase("register")){
		String name=request.getParameter("ename");
		Integer age=Integer.parseInt(request.getParameter("eage"));
		String address=request.getParameter("eaddress");
		String salary=request.getParameter("esalary");
		
		ps1.setString(1,name);
		ps1.setInt(2, age);
		ps1.setString(3,address);
		ps1.setString(4,salary);
		
		int effectedRowsCount=ps1.executeUpdate();
		if(effectedRowsCount==1)
			out.println("<h1 style='color:green;text-align:center;'>Employee Registration Successfull</h1>");
		else
			out.println("<h1 style='color:red;text-align:center;'>Employee Registration Unsuccessfull</h1>");
	}
	else{
		ResultSet rs=ps2.executeQuery();
		out.println("<table border='1' bgcolor='pink' align='center'>");
		out.println("<tr><th>ID</th><th>NAME</th><th>AGE</th><th>ADDRESS</th><th>SALARY</th></tr>");
		while(rs.next()){
			out.println("<tr>");
			out.println("<td>");
			out.println(rs.getInt(1));
			out.println("</td>");
			out.println("<td>");
			out.println(rs.getString(2));
			out.println("</td>");
			out.println("<td>");
			out.println(rs.getInt(3));
			out.println("</td>");
			out.println("<td>");
			out.println(rs.getString(4));
			out.println("</td>");
			out.println("<td>");
			out.println(rs.getString(5));
			out.println("</td>");
			out.println("</tr>");
			
		}
		out.println("</table>");
	}
%>
<br/><br/>
<a href='./index.html'>HOME</a>
<%!
	public void jspDestroy(){
	System.out.println("Cleaning the environment...");
	try{
		if(ps1!=null){
			ps1.close();
		}
	}
	catch(SQLException se){
		se.printStackTrace();
	}
	try{
		if(ps2!=null){
			ps2.close();
		}
	}
	catch(SQLException se){
		se.printStackTrace();
	}
	try{
		if(connection!=null){
			connection.close();
		}
	}
	catch(SQLException se){
		se.printStackTrace();
	}
	
}
%>