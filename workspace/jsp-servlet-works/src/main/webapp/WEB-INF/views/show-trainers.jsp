<%@page import="com.naveen.beans.Trainer1"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="2">
			<tr>
			<td>Name</td>
			<td>Email</td>
			<td>Income</td>
			</tr>
	
	<%
		List<Trainer1> list = (List<Trainer1>)request.getAttribute("TRAINERS");
	for(Trainer1 temp : list) {
		%>
				<tr>
					<td><%= temp.getTrainerName() %></td>
					<td><%= temp.getTrainerEmail() %></td>
					<td><%= temp.getTrainerIncome() %></td>
				</tr>			
		<%
	}
	%>
	
	</table>
</body>
</html>