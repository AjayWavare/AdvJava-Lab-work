<%@page import="Quiz.Option"%>
<%@page import="java.util.List"%>
<%@page import="Quiz.Question"%> <!-- directive tag in jsp is used to import the others files in current jsp files -->
<!-- this jsp file will show a question on screen -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% Question question = (Question) session.getAttribute("currentQs");%>
<h3><%= question.getQuestion() %></h3>

</body>
</html>