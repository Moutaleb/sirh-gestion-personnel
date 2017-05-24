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

	<h1>Les collaborateurs</h1>

	<!-- Liste des noms -->
	<div class="table-responsive">
		<table class="table">
			<tr>
				<th>Nom</th>
				<th>Prénom</th>
				<th>Date de naissance</th>
				<th>Adresse</th>
				<th>Numéro de sécurité</th>
			</tr>
			<c:forEach var="collab" items="${listecollaborateurs}">
				<tr>
					<td>${collab.nom}</td>
					<td>${collab.prenom}</td>
					<td>${collab.dateDeNaissance}</td>
					<td>${collab.adresse}</td>
					<td>${collab.numéroDeSecuSociale}</td>
				</tr>
			</c:forEach>
			</ul>
			<a href="<c:url value='/collaborateurs/lister'></c:url>"
				class="btn btn-primary">Liste Collaborateurs</a>
			<a href="<c:url value='/collaborateur/nouveau'></c:url>"
				class="btn btn-primary">Nouveau Collaborateur</a>
			<a href="<c:url value='/collaborateur/statistique'></c:url>"
				class="btn btn-primary">Liste Statistiques</a>
			<a href="<c:url value='/collaborateur/activités'></c:url>"
				class="btn btn-primary">Liste Activités</a>
</body>

</html>