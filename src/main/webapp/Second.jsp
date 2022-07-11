<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String name=(String)session.getAttribute("user");//session attribute
out.print("hello"+" "+name);


pageContext.setAttribute("user",name,PageContext.SESSION_SCOPE); //pageContext
out.print("namaste"+" "+name);
%>
</body>
</html>