
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="utf-8"/>
	<link rel="stylesheet" href="./css/bootstrap.min.css" />
	<title>Ajout de Serveurs</title>
	</head>
	<body>
		<div class="container" style="margin-top: 75px;">
			<div class="card">
				<div class="card-header badge-info">Liste des serveurs</div>
				<div class="card-body">
					<table class="table table-bordered">
						<tr>
							<th>ID</th>
							<th>Nom du serveur</th>
							<th>Adresse ip du serveur</th>
							<th>Action</th>
							<th>Action</th>
						</tr>
						<c:forEach items="${list_serveurs}" var="v">
							<tr>
								<td>${v.idServ}</td>
								<td>${v.nomServ}</td>
								<td>${v.adripServ}</td>
								<td>Editer</td>
								<td>Supprimer</td>
							</tr>
						</c:forEach>
					</table>
				
				</div>
			</div>
		</div>
	</body>
</html>