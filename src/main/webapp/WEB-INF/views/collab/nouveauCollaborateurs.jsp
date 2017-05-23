<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/bootstrap.css">
</head>
<body>
	<form class="form-horizontal" method="post">
		<fieldset>

			<!-- Form Name -->
			<legend>Nouveau collaborateur</legend>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">Nom</label>
				<div class="col-md-4">
					<input id="textinput" name="nom" type="text" placeholder=""
						class="form-control input-md" required="">

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">Prenom</label>
				<div class="col-md-4">
					<input id="textinput" name="prenom" type="text" placeholder=""
						class="form-control input-md" required="">

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">Date
					de naissance</label>
				<div class="col-md-4">
					<input id="textinput" name="dateDeNaissance" type="text"
						placeholder="" class="form-control input-md" required="">

				</div>
			</div>

			<!-- Textarea -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textarea">Adresse</label>
				<div class="col-md-4">
					<textarea class="form-control" id="textarea" name="adresse"></textarea>
				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">Numéro
					de sécurité sociale </label>
				<div class="col-md-4">
					<input id="textinput" name="numsecu" type="text" placeholder=""
						class="form-control input-md" required title="15">

				</div>
			</div>

			<!-- Button -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="singlebutton"></label>
				<div class="col-md-4">
					<button id="singlebutton" name="name"
						class="btn btn-primary">Créer</button>
				</div>
			</div>

		</fieldset>
	</form>


</body>
</html>