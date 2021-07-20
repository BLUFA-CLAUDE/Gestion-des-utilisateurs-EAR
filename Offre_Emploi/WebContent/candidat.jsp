<jsp:include page="header.jsp"></jsp:include>
	<div class="container-fluid" style="margin-top: 65px;">
        	<div class="row">
        		<div class="col-md-4">
        			<div class="card" >
					  <img src="img/jcc.jpg" class="card-img-top" alt="...">
					  <div class="card-body">
					    <h5 class="card-title">DEVENEZ MEMBRE !</h5>
					    <p class="card-text">
							Vous souhaitez changer de job? 
							Ou juste rester informé des opportunités?
							 Devenez membre de Senjob et:
							Consultez au quotidien les opportunités 
							d'emploi du marché.
							Publiez votre CV et votre Profil.
							Créez vos job alertes emails.
							Activez vos candidatures spontannées.
							Créez votre CV publique.
							Et plus encore...
					    </p>
					    <a href="Candidat?page=login" class="btn btn-primary">INCRIVEZ-VOUS ICI</a>
					  </div>
					</div>
        		</div>
        		
        		<div class="col-md-4">
        			<div class="card" >
					  <div class="card-body">
					    <h5 class="card-title"> DÉJA MEMBRE ?</h5>
					    <p>CONNECTEZ-VOUS ICI</p>
					    <form action="User" method="post">
	            	<div class="form-group">
	            		<label class="control-label">Username</label>
	            		<input class="form-control" type="text" name="nom" required="required">
	            	</div>
	            	<div class="form-group">
	            		<label class="control-label">password</label>
	            		<input class="form-control" type="password" name="password" required="required">
	            	</div>
	            	<div class="form-group">
	            		<input class="btn btn-success" type="submit" name="envoyer" value="Envoyer" >
	            		<input class="btn btn-danger" type="reset" name="annuler" value="Annuler" >
	            	</div>
	            	</form>
					  </div>
					</div>
        		</div>
        	</div>
      </div>
      <br>
<jsp:include page="footer.jsp"></jsp:include>