<jsp:include page="../header/header.jsp"></jsp:include>

<div class="content-wrapper">
<div></div>
<div class="content">
	<div class="row">
       <div class="col-lg-8">
           <div class="card">
               <div class="card-header">
                    <h5 class="card-header-text">Enregistrer un utilisateur</h5>
                </div>
                 <div class="card-block">
                     <form>
                         <div class="form-group">
                             <label for="nom" class="form-control-label">Nom</label>
                             <input type="text" class="form-control" id="nom" placeholder="Enter nom">
                          </div>
                          <div class="form-group">
                             <label for="prenom" class="form-control-label">Prenom</label>
                             <input type="text" class="form-control" id="prenom" placeholder="Enter prenom">
                          </div>
                          <div class="form-group">
                             <label for="exampleInputEmail" class="form-control-label">Email address</label>
                             <input type="email" class="form-control" id="exampleInputEmail" placeholder="Enter email">
                          </div>
                          <div class="form-group">
                              <label for="exampleInputPassword" class="form-control-label">Password</label>
                              <input type="password" class="form-control" id="exampleInputPassword" placeholder="Password">
                          </div> 
                          <div class="form-group">
                          	<label class="form-control-label" for="role">Choisir le role</label>
                    		<select class="select2-single-placeholder form-control" name="role" id="role">
                    			<option value="">Choisir un role...</option>
                    		</select>
                  		</div>
                          <button type="submit" class="btn btn-primary waves-effect waves-light m-r-30">Enregistrer</button>
                          <button type="submit" class="btn btn-danger waves-effect waves-light m-r-30">Annuler</button>
                     </form>
                  </div>
               </div>
          </div>
          
                         <div class="col-lg-4">
                  <div class="card">
                     <div class="user-block-2">
                        <img class="img-circle" src="public/assets/images/widget/jcc.jpg" style="width:150px; height: 150px;" alt="User Image">
                        <h5>Jean Claude Camara</h5>
                        <h6>Developpeur Web</h6>
                     </div>
                     <div class="card-block">
                        <div class="user-block-2-activities">
                           <div class="user-block-2-active">
                              <i class="icofont icofont-clock-time"></i> Recent Activities
                              <label class="label label-primary">480</label>
                           </div>
                        </div>
                        <div class="user-block-2-activities">
                           <div class="user-block-2-active">
                              <i class="icofont icofont-users"></i> Current Employees
                              <label class="label label-primary">390</label>
                           </div>
                        </div>

                        <div class="user-block-2-activities">
                           <div class="user-block-2-active">
                              <i class="icofont icofont-ui-user"></i> Following
                              <label class="label label-primary">485</label>
                           </div>

                        </div>
                        <div class="user-block-2-activities">
                           <div class="user-block-2-active">
                              <i class="icofont icofont-picture"></i> Pictures
                              <label class="label label-primary">506</label>
                           </div>
                        </div>
                        <div class="text-center">
                           <button type="button" class="btn btn-warning waves-effect waves-light text-uppercase m-r-30">
                                    Follows
                                </button>
                           <button type="button" class="btn btn-primary waves-effect waves-light text-uppercase">
                                    Message
                                </button>
                        </div>
                     </div>
                  </div>
               </div>
          
          <div class="col-lg-12">
          		<div class="card">
                     <div class="card-header">
                        <h5 class="card-header-text">Liste Utilisateurs</h5>
                     </div>
                     <div class="card-block">
                        <div class="row">
                           <div class="col-sm-12 table-responsive">
                              <table class="table">
                                 <thead>
                                    <tr>
                                       <th>ID</th>
                                       <th>Nom</th>
                                       <th>Prenom</th>
                                       <th>Email</th>
                                       <th>Role</th>
                                       <th>Action</th>
                                       <th>Action</th>
                                    </tr>
                                 </thead>
                                 <tbody>
                                    <tr>
                                       <td>1</td>
                                       <td>CAMARA</td>
                                       <td>Jean Claude</td>
                                       <td>jeccam38@gmail.com</td>
                                       <td>Admin</td>
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