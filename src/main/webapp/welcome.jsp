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
//Scriplet tag,we can only declare varibles
String name=request.getParameter("uname");
out.print("welcome to jsp"+" "+ name);
%>
<br>

<%= //expression tag,The code placed within JSP expression tag is written to the output stream of the response.
"welcome"+" "+  request.getParameter("uname") 
%>


<%! //declaration tag, The JSP declaration tag is used to declare fields and methods.
// we can declare methods and varibles both
int cube(int n){
	return n*n*n;
}
%>

<%="Cube of n is"+" "+cube(3) %>
</body>
</html>