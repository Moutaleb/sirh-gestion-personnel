<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>

<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>SGP - App</title>

</head>

<body>

	<h1>Les collaborateurs</h1>

	<!-- Liste des noms -->

	<ul>

		<%
			List<Collaborateur> collaborateurs = (List<Collaborateur>) request.getAttribute("listecollaborateurs");

			for (Collaborateur collaborateur : collaborateurs) {
		%>

	<li><%=collaborateur.getNom()%></li>

		<%
			}
		%>

	</ul>

</body>

</html>