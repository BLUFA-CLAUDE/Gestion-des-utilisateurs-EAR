<jsp:include page="../header/header.jsp"></jsp:include>
<div class="container-fluid">

	
	<div class="row">
       	<div class="col-lg-4">
       		<div class="card shadow mb-4">
               	<div class="card-header py-3">
                      <h6 class="m-0 font-weight-bold text-primary">Enregistrer une categorie</h6>
                 </div>
                 <div class="card-body">
	                  	<form method="POST">
		                    <div class="form-group">
		                      <label for="libelle">Libelle</label>
		                      <input type="text" name="libelle" class="form-control" 
		                        placeholder="Entrer le libelle de la categorie">
		                    </div>
		                  <input type="submit" class="btn btn-primary" name="" id="enregistrer" value="Enregistrer" />
		                  <input type="submit" class="btn btn-danger" name="" id="enregistrer" value="Annuler" />
	                  </form>               
                 </div>
             </div>
         </div>
          
          <div class="col-lg-8">
          		<div class="card">
                     <div class="card-header">
                        <h5 class="card-header-text">Liste Categories</h5>
                     </div>
                     <div class="card-block">
                        <div class="row">
                           <div class="col-sm-12 table-responsive">
                              <table class="table">
                                 <thead>
                                    <tr>
                                       <th>ID</th>
                                       <th>Libelle</th>
                                       <th>Action</th>
                                       <th>Action</th>
                                    </tr>
                                 </thead>
                                 <tbody>
                                    <tr>
                                       <td>1</td>
                                       <td>Vetement</td>
                                       <td><a href="" class="btn btn-sm btn-warning">Editer</a></td>
                        				<td><a class="btn btn-sm btn-danger" href="">Supprimer</a></td>               
                                    </tr>
                                 </tbody>
                              </table>
                           </div>
                        </div>
                     </div>
                  </div>
          </div>
     </div>
</div>
</div>
<jsp:include page="../footer/footer.jsp"></jsp:include>