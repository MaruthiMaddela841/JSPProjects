<h1 style='color:red; text-align:center;'>Setting Values to Student</h1>

<jsp:useBean id="student" class="in.ineuron.bean.Student" scope="session"/>

<jsp:setProperty  name="student"  property="sId" value="10"/>
<jsp:setProperty  name="student"  property="sName" value="maruthimaddela"/>
<jsp:setProperty  name="student"  property="sAddress" value="ssp"/>
<jsp:setProperty  name="student"  property="sAge" value="26"/>

<%=student %><br/><br/>

<%--Setting the request param values to student bean --%>
<jsp:setProperty  name="student"  property="sId" param="sId"/>
<jsp:setProperty  name="student"  property="sId" param="sName"/>
<jsp:setProperty  name="student"  property="sId" param="sAddress"/>
<jsp:setProperty  name="student"  property="sId" param="sAge"/>

<%=student %><br/><br/>

<jsp:setProperty  name="student"  property="*"/>
<%=student %><br/><br/>