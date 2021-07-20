<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp"></jsp:include>
	<div class="container-fluid" style="margin-top: 65px;">
      <div class="row">
       <div class="col-md-4">
        <div class="card ">
            <div class="card-header badge-info">
                <h4 class="card-title">Inscrire un utilisateur</h4>
                
            </div>
            <div class="card-body ">
	            <form action="Administrateur" method="post">
	            	<div class="form-group">
	            		<label class="control-label">Nom</label>
	            		<input class="form-control" type="text" name="nom" required="required">
	            	</div>
	            	<div class="form-group">
	            		<label class="control-label">Prenom</label>
	            		<input class="form-control" type="text" name="prenom" required="required">
	            	</div>
	            	<div class="form-group">
	            		<label class="control-label">Email</label>
	            		<input class="form-control" type="email" name="email" required="required">
	            	</div>
	            	<div class="form-group">
	            		<label class="control-label">Mot de pass</label>
	            		<input class="form-control" type="password" name="password" required="required">
	            	</div>
	            	<div class="form-group">
	            		<input class="btn btn-success" type="submit" name="action" value="Envoyer" >
	            		<input class="btn btn-danger" type="reset" name="annuler" value="Annuler" >
	            	</div>
	            </form>
           </div>
       </div>
   </div>
        <div class="col-md-8">	
        	<div>
        		<a href="ListRecruteur?page=recruteur" class="btn btn-primary">LISTE RECRUTEURS</a>
        		<a href="Administrateur?page=candidat" class="btn btn-success">ACCES CANDIDATS</a>
        	</div><br>
			<div class="card-header badge-info">
			<h4 class="card-title">Liste des Utilisateurs</h4> 
			</div>
			<div class="card-body">
				<form action="Administrateur" method="get">
					<label>Mot Clé</label>
					<input type="text" name="motCle" value="" />
					<input type="submit" class="btn btn btn-primary" value="Rechercher" name="page" >
				</form>
				<table class="table table-bordered">
					<tr>
						<th>Nom</th>
						<th>Prenom</th>
						<th>Email</th>
						<th>Action</th>
						
					</tr>
					<c:forEach items="${list_users}" var="u">
					<tr>
						<td>${u.user_nom}</td>
						<td>${u.user_prenom}</td>
						<td>${u.user_email}</td>
						<td>
	                  		<a onclick="return confirm('Etes-vous sûr ?')" href="Administrateur?page=Supprimer&user_id=${u.user_id}">Supprimer</a>
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