<jsp:include page="header.jsp"></jsp:include>
	<div class="container-fluid" style="margin-top: 65px;">
      <div class="row">
       <div class="col-md-4">
        <div class="card ">
            <div class="card-header badge-info">
                <h4 class="card-title">Formulaire d'inscription</h4>
                
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
	            		<input class="btn btn-success" type="submit" name="action" value="Enregistrer" >
	            	</div>
	            </form>
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
	            		<input class="btn btn-success" type="submit" name="connectez" value="CONNECTEZ" >
	            		
	            	</div>
	            	</form>
					  </div>
					</div>
        		</div>
      </div>
    </div>
	<br>
<jsp:include page="footer.jsp"></jsp:include>