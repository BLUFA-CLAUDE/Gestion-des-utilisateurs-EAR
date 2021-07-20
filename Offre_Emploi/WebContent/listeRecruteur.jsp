<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp"></jsp:include>
<div class="container-fluid" style="margin-top: 65px;">
      <div class="row">
            <div class="col-md-4">
                <h4 class="pb-4">Inscrire un RECRUTEUR</h4>
                <form action="Recruteur" method="post">
                    <div class="form-row">
                        <div class="form-group col-md-6">
                          <input id="Full Name" name="Full Name" placeholder="Usarname" class="form-control" type="text">
                        </div>
                        <div class="form-group col-md-6">
                          <input id="Full Name" name="Full Name" placeholder="Mot de passe" class="form-control" type="text">
                        </div>
                        <div class="form-group col-md-6">
                          <input id="Full Name" name="Full Name" placeholder="Confirme mot de passe" class="form-control" type="text">
                        </div>
                        <div class="form-group col-md-6">
                                  
                                  <select id="inputState" class="form-control">
                                    <option selected>Type de structure ...</option>
                                    <option> Cabinet de recrutement</option>
                                    <option> Entreprise</option>
                                    <option> ONG/Association</option>
                                  </select>
                        </div>
                        <div class="form-group col-md-6">
                          <input id="Full Name" name="Full Name" placeholder="Nom de structure" class="form-control" type="text">
                        </div>
                        <div class="form-group col-md-6">
                                  
                                  <select id="inputState" class="form-control">
                                    <option selected>Pays d'etalissement...</option>
                                    <option> Senegal</option>
                                    <option> Guinée</option>
                                    <option> Mauritanie</option>
                                    <option> Gambie</option>
                                  </select>
                        </div>
                        <div class="form-group col-md-6">
                          <input type="text" class="form-control" id="inputEmail4" placeholder="Ville">
                        </div>
                        <div class="form-group col-md-12">
                        <label class="form-label" for="invalidCheck2">Adresse exacte</label>
                                  <textarea id="comment" name="comment" cols="40" rows="5" class="form-control"></textarea>
                        </div>
                        <div class="form-group col-md-12">
                        <label class="form-label" for="invalidCheck2">Description de la structure</label>
                                  <textarea id="comment" name="comment" cols="25" rows="5" class="form-control"></textarea>
                        </div>
                        <div class="form-group col-md-6">
                            <input id="Mobile No." name="Mobile No." placeholder="Telephone de bureau" class="form-control" required="required" type="text">
                        </div>
                        <div class="form-group col-md-6">
                          <input type="text" class="form-control" id="inputEmail4" placeholder="Url de votre site">
                        </div>
                        <div class="form-group col-md-6">
                          <input type="text" class="form-control" id="inputEmail4" placeholder="Secteur d'activite">
                        </div>
                        <div class="form-group col-md-6">
                          <input type="text" class="form-control" id="inputEmail4" placeholder="prenom du repondant">
                        </div>
                        <div class="form-group col-md-6">
                          <input type="text" class="form-control" id="inputEmail4" placeholder="Nom du repondant">
                        </div>
                        <div class="form-group col-md-6">
                          <input type="text" class="form-control" id="inputEmail4" placeholder="Telephone du repondant">
                        </div>
                        <div class="form-group col-md-6">
                          <input type="text" class="form-control" id="inputEmail4" placeholder="Fonction du repondant">
                        </div>
                   </div>                    
                    
                    <div class="form-row">
                        <button type="button" class="btn btn-success">Enregister</button>
                    </div>
                </form>
            </div>
		  
	        <div class="col-md-8">		
			<div class="card-header badge-info">
			<h4 class="card-title">Liste des recruteurs</h4> 
			</div>
			<div class="card-body">
				<form action="Produit" method="get">
					<label>Mot Clé</label>
					<input type="text" name="motCle" value="" />
					<input type="submit" class="btn btn btn-primary" value="Rechercher" name="action" >
				</form>
				<table class="table table-bordered">
					<tr>
						<th>Chef d'entreprise</th>
						<th>Type Structure</th>
						<th>Nom Structure</th>
						<th>Telephone Bureau</th>
						<th>Email</th>
						<th>Nom du repondant</th>
						<th>Prenom du repondant</th>
						<th>Fonction</th>
						<th>Action</th>
						
					</tr>
					<c:forEach items="${list_recruteurs}" var="r">
					<tr>
						<td>${r.recruteur_nom}</td>
						<td>${r.type_structure}</td>
						<td>${r.nom_structure}</td>
						<td>${r.phone_bureau}</td>
						<td>${r.email}</td>
						<td>${r.nom}</td>
						<td>${r.prenom}</td>
						<td>${r.fonction}</td>
						<td>
	                  		<a onclick="return confirm('Etes-vous sûr ?')" href="Recruteur?page=Supprimer&recruteur_id=${r.recruteur_id }">Supprimer</a>
						</td>
                  		
					</tr>
					</c:forEach>
				</table>
			</div>
		</div>	  
      </div>
</div>
 
	<br>
<jsp:include page="footer.jsp"></jsp:include>