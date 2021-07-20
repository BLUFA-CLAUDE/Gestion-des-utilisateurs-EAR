 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <link href="public/bootstrap.min.css" rel="stylesheet" type="text/css" />
<jsp:include page="header.jsp"></jsp:include>
<div class="content">

<div class="container-fluid">
	<div class="row">
		<div class="col-md-4">
			<div class="card">
				<div class="card-header badge-info">
				<h4 class="card-title">Enregistrer le Produit</h4>
				</div>
				<div class="card-body">
					<form action="Produit" method="post">
						<div class="form-group">
							<label class="control-label">Nom Produit :</label>
							<input type="text" name="nom" class="form-control"/>
						</div>
						<div class="form-group">
							<label class="control-label">Quantité produit :</label>
							<input type="text" name="quantite" class="form-control"/>
						</div>
						<div>
							<input type="submit" class="btn btn-primary" value="Enregistrer" name="action" >
						</div>
					</form>
				</div>
		</div>
		</div>
		
		<div class="col-md-8">		
			<div class="card-header badge-info">
			<h4 class="card-title">Liste des Produits</h4> 
			</div>
			<div class="card-body">
				<form action="Produit" method="get">
					<label>Mot Clé</label>
					<input type="text" name="motCle" value="" />
					<input type="submit" class="btn btn btn-primary" value="Rechercher" name="action" >
				</form>
				<table class="table table-bordered">
					<tr>
						<th>Nom Produit</th>
						<th>Quantité</th>
						<th>Action</th>
						<th>Action</th>
						<th>Action</th>
					</tr>
					<c:forEach items="${list_produit}" var="p">
					<tr>
						<td>${p.nom }</td>
						<td>${p.qteStock }</td>
						<td>
							<a href="Produit?action=Update&ref=<c:out value='${p.ref}'/>">Edit</a>
						</td>
						<td>
	                  		<a onclick="return confirm('Etes-vous sûr ?')" href="Produit?action=Supprimer&ref=${p.ref }">Supprimer</a>
						</td>
                  		<td>Visualiser</td>
					</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div> 
 </div>
 </div>
<jsp:include page="footer.jsp"></jsp:include>