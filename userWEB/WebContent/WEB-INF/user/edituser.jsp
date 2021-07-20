<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="../../header/header.jsp"></jsp:include>


<div class="col-md-12">
    <div class="card">
        <div class="card-header">
            <h5>Ajouter un utilisateur</h5>
            <!--<span>Add class of <code>.form-control</code> with <code>&lt;input&gt;</code> tag</span>-->
        </div>
        <div class="card-block">
            <form action="User" method="POST" class="form-material">
                
                <div class="form-group form-default">
                    <input type="text" name="nom" class="form-control"  required="">
                    <span class="form-bar"></span>
                    <label class="float-label">Entrer le nom</label>
                </div>
                <div class="form-group form-default">
                    <input type="text" name="prenom" class="form-control" required="">
                    <span class="form-bar"></span>
                    <label class="float-label">Entrer le prenom</label>
                </div>
                <div class="form-group form-default">
                    <input type="email" name="email" class="form-control" required="">
                    <span class="form-bar"></span>
                    <label class="float-label">Email</label>
                </div>
                <div class="form-group form-default">
                    <input type="password" name="password" class="form-control" required="" >
                    <span class="form-bar"></span>
                    <label class="float-label">Password</label>
                </div>
                
                 <div class="form-group ">
                        <select name="Idfonction" id="inputState" class="select2-single-placeholder form-control">
                         <option  selected>Choisir une fonction ...</option>
                            <c:forEach items="${liste_fonctions}" var="f">
                               <option value="${f.id }">${f.nom }</option>
                            </c:forEach>
                         </select>
                </div>
                 <div class="form-group ">   
                      <select name="Idrole" id="inputState" class="select2-single-placeholder form-control">
                             <option  selected>Quel role avez vous ...</option>
                                <c:forEach items="${liste_roles}" var="r">
                                    <option value="${r.id }">${r.nom }</option>
								</c:forEach>
                      </select>
                </div>
                <input type="submit" class="btn waves-effect waves-light hor-grd btn-grd-primary" value="Enregister"/>
                <input type="reset" value="Annuler" class="btn waves-effect waves-light hor-grd btn-grd-danger "/>
            </form>
        </div>
    </div>
</div>                                         


<jsp:include page="../../footer/footer.jsp"></jsp:include>