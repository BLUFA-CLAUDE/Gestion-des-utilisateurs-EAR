<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <link href="public/bootstrap.min.css" rel="stylesheet" type="text/css" />
<jsp:include page="header.jsp"></jsp:include>
<div class="content">
<div class="row">
		<div class="col-md-4">
			<div class="card">
				<div class="card-header badge-info">
				<h4 class="card-title">Modification de Produit</h4>
				</div>
				<div class="card-body">
					<form action="Produit" method="post">
						<div class="form-group">
							<input type="hidden" name="ref" class="form-control" value="${ref}" />
							<label class="control-label">Nom Produit :</label>
							<input type="text" name="nom" class="form-control" value="${nom}" />
						</div>
						<div class="form-group">
							<label class="control-label">Quantité produit :</label>
							<input type="text" name="quantite" class="form-control" value="${qteStock}" />
						</div>
						<div>
							<input type="submit" class="btn btn-primary" value="Modifier" name="action" >
						</div>
					</form>
				</div>
		</div>
	</div>
 </div>
</div>
<jsp:include page="footer.jsp"></jsp:include>