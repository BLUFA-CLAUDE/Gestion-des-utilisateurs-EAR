<jsp:include page="../header/header.jsp"></jsp:include>
<div class="container-fluid">

	<div class="row">
       	<div class="col-lg-4">
       		<div class="card shadow mb-4">
               	<div class="card-header py-3">
                      <h6 class="m-0 font-weight-bold text-primary">Enregistrer un produit</h6>
                 </div>
                 <div class="card-body">
	                  	<form method="POST">
		                    <div class="form-group">
		                      <label for="libelle">Libelle</label>
		                      <input type="text" name="libelle" class="form-control" 
		                        placeholder="Entrer le libelle du produit">
		                    </div>
		                    <div class="form-group">
		                      <label for="quantite">Quantité</label>
		                      <input type="number" name="quantite" class="form-control" 
		                        placeholder="Entrer la quantité du produit">
		                    </div>
		                    <div class="form-group">
		                      <label for="prix">Prix</label>
		                      <input type="number" name="prix" class="form-control" 
		                        placeholder="Entrer le prix du produit">
		                    </div>
		                    <div class="form-group">
		                    	<label for="classe">Choisir la Categorie</label>
		                    	<select class="select2-single-placeholder form-control"  name="categorie">
		                    		<option value="">Choisir une categorie...</option>
		                    	</select>
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
                        <h5 class="card-header-text">Liste Produits</h5>
                     </div>
                     <div class="card-block">
                        <div class="row">
                           <div class="col-sm-12 table-responsive">
                              <table class="table">
                                 <thead>
                                    <tr>
                                       <th>ID</th>
                                       <th>Libelle</th>
                                       <th>Quantité</th>
                                       <th>Prix</th>
                                       <th>Action</th>
                                       <th>Action</th>
                                    </tr>
                                 </thead>
                                 <tbody>
                                    <tr>
                                       <td>1</td>
                                       <td>Chemise</td>
                                       <td>56</td>
                                       <td>3500</td>
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