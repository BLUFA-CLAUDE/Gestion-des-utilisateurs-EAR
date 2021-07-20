<jsp:include page="../header/header.jsp"></jsp:include>

<div class="content-wrapper">
	<div class="content">
	<div class="row">
       <div class="col-lg-4">
           <div class="card">
               <div class="card-header">
                    <h5 class="card-header-text">Enregistrer un role</h5>
                </div>
                 <div class="card-block">
                     <form>
                         <div class="form-group">
                             <label for="role" class="form-control-label">Role</label>
                             <input type="text" class="form-control" id="nom" placeholder="Enter Role">
                          </div>
                          <button type="submit" class="btn btn-primary waves-effect waves-light m-r-30">Enregistrer</button>
                          <button type="submit" class="btn btn-danger waves-effect waves-light m-r-30">Annuler</button>
                     </form>
                  </div>
               </div>
          </div>
          
          <div class="col-lg-8">
          		<div class="card">
                     <div class="card-header">
                        <h5 class="card-header-text">Liste Roles</h5>
                     </div>
                     <div class="card-block">
                        <div class="row">
                           <div class="col-sm-12 table-responsive">
                              <table class="table">
                                 <thead>
                                    <tr>
                                       <th>ID</th>
                                       <th>Role</th>
                                       <th>Action</th>
                                       <th>Action</th>
                                    </tr>
                                 </thead>
                                 <tbody>
                                    <tr>
                                       <td>1</td>
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