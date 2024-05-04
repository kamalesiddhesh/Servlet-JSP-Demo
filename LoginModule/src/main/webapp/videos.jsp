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
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
		
		response.setHeader("Pragma", "no-cache"); // HTTP 1.0
		
		response.setHeader("Expires", "0"); // Proxy servers
		
		if(session.getAttribute("username")== null){
			response.sendRedirect("login.jsp");
		}
	%>
	Full Java + MicroService Course: <br>
	<iframe width="400" height="300" src="https://www.youtube.com/embed/4XTsAAHW_Tc?si=EJsKIA8TFaJLO4NG" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe> <br>
	<br>
	Java Swing Course: <br>
	<iframe width="400" height="300" src="https://www.youtube.com/embed/Kmgo00avvEw?si=95ks7Q1U7V9Oew0b" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe> <br>
	<br>

</body>
</html>