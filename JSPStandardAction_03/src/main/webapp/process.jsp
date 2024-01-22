<%@ page %>
<jsp:useBean id="dto" class='in.ineuron.dto.EmployeeDto' scope='request'></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<jsp:useBean id='service' class='in.ineuron.service.SalaryDetailsGeneratorImpl' scope='application'/>
<%
	service.generateSalaryDetails(dto);
%>
<table bgcolor='pink' align='center' border='1'>
			<tr>
				<td>EID</td>
				<td><jsp:getProperty property='eno' name='dto'/></td>
			</tr>
			<tr>
				<td>ENAME</td>
				<td><jsp:getProperty property='ename' name='dto'/></td>
			</tr>	
			<tr>
				<td>BSALARY</td>
				<td><jsp:getProperty property='bsal' name='dto'/></td>
			</tr>
			<tr>
				<td>GSALARY</td>
				<td><jsp:getProperty property='gsal' name='dto'/></td>
			</tr>
			<tr>
				<td>NSALARY</td>
				<td><jsp:getProperty property='nsal' name='dto'/></td>
			</tr>
</table>
<br/><br/>
<a href='./index.html'>HOME PAGE</a>