<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
	public int yourMethodGoesHere() {
		return 0; 
	}
%>

<%
	String userName = request.getParameter("uname"); 
	String password = request.getParameter("pass"); 
	
	if(userName.equals("sapient") && password.equals("india")) {

%>
		<jsp:forward page="./success.jsp"/>
<%
	}else {
%>
		<h2 style="color:red" >Failed to login  <%= userName %>
		 </h2>
		<jsp:include page="login-page2.html"/>
<%
	}
%>
</body>
</html>