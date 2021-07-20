<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="../../header/header.jsp"></jsp:include>


<div class="col-md-12">
    <div class="card">
        <div class="card-header">
            <h5>Ajouter un Role</h5>
            <!--<span>Add class of <code>.form-control</code> with <code>&lt;input&gt;</code> tag</span>-->
        </div>
        <div class="card-block">
            <form action="Role" method="POST" class="form-material">
                
                <div class="form-group form-default">
                    <input type="text" name="nom" class="form-control"  required="">
                    <span class="form-bar"></span>
                    <label class="float-label">Entrer le role</label>
                </div>
                <input type="submit" class="btn waves-effect waves-light hor-grd btn-grd-primary" value="Enregister"/>
                <input type="reset" value="Annuler" class="btn waves-effect waves-light hor-grd btn-grd-danger "/>
            </form>
        </div>
    </div>

    <div class="card">
        <div class="card-header">
            <h2>Liste de role</h2>
            <div class="card-header-right">
                <ul class="list-unstyled card-option">
                    <li><i class="fa fa-window-maximize full-card"></i></li>
                    <li><i class="fa fa-minus minimize-card"></i></li>
                </ul>
            </div>
        </div>
        <div class="card-block table-border-style">
            <div class="table-responsive">
                <table class="table">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Role</th>
                            <th>Action</th>
                            <th>Action</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
						<c:forEach items="${liste_roles}" var="r">
							<tr>
								<td>${r.id}</td>
								<td>${r.nom }</td>
								<td>
									<a class="btn btn-warning waves-effect waves-light" href="">Edit</a>
								</td>
								<td>
			                  		<a class="btn btn-danger waves-effect waves-light" href="">Supprimer</a>
								</td>
		                  		<td>
			                  		<a class="btn btn-success waves-effect waves-light" href="">Visualiser</a>
								</td>
							</tr>
						</c:forEach>
							</tbody>
                	</table>
            </div>
        </div>
    </div>
</div>                                         


<jsp:include page="../../footer/footer.jsp"></jsp:include>