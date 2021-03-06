<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/bootstrap.css">
<title>SGP - App</title>

</head>

<body>

	<h1>Statistiques</h1>

	<!-- Liste des noms -->
	<div class="table-responsive">
		<table class="table">
			<tr>
				<th>Chemin</th>
				<th>Nombre visites</th>
				<th>Min (ms)</th>
				<th>Max (ms)</th>
				<th>Moyenne</th>
			</tr>
			<c:forEach var="visite" items="${VisiteLog}">
				<tr>
					<td>${visite.chemin}</td>
					<td>${visite.nbVisites}</td>
					<td>${visite.min}</td>
					<td>${visite.max}</td>
					<td>${visite.moyenne}</td>
				</tr>
			</c:forEach>
		</table>
		<a href="<c:url value='/collaborateurs/lister'></c:url>"
		class="btn btn-primary">Liste Collaborateurs</a>
	<a href="<c:url value='/collaborateur/nouveau'></c:url>"
		class="btn btn-primary">Nouveau Collaborateur</a>
	<a href="<c:url value='/collaborateur/statistique'></c:url>"
		class="btn btn-primary">Liste Statistiques</a>
	<a href="<c:url value='/collaborateur/activités'></c:url>"
		class="btn btn-primary">Liste Activités</a>
	</div>
	
</body>

</html>