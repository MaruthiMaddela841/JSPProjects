<h1 style='color:red; text-align:center;'>Setting Values to Student</h1>

<jsp:useBean id="student" class="in.ineuron.bean.Student" scope="session"/>

<b>SID: <jsp:getProperty  name="student"  property="sId"/></b>
<b>SNAME: <jsp:getProperty  name="student"  property="sName"/></b>
<b>SADDR: <jsp:getProperty  name="student"  property="sAddress"/></b>
<b>SAGE: <jsp:getProperty  name="student"  property="sAge"/></b>

<br/><br/>