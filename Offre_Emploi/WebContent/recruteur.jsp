<jsp:include page="header.jsp"></jsp:include>
	<div class="container-fluid"><br>
      
    <section class="testimonial py-5" id="testimonial">
    	<div class="container">
        <div class="row ">
            <div class="col-md-4 py-5 bg-primary text-white text-center ">
                <div class=" ">
                    <div class="card-body">
                        <img src="img/jcc.jpg" style="width:50%">
                        <h2 class="py-3">Registration</h2>
                        <p>Tation argumentum et usu, dicit viderer evertitur te has. Eu dictas concludaturque usu, facete detracto patrioque an per, lucilius pertinacia eu vel.</p>
                    </div>
                </div>
            </div>
            <div class="col-md-8 py-5 border">
                <h4 class="pb-4">Inscrivez vous en tant que RECRUTEUR</h4>
                <form action="Recruteur" method="post" >
                    <div class="form-row">
                        <div class="form-group col-md-6">
                          <input id="Full Name" name="nomchef" placeholder="Nom et Prenom Chef" class="form-control" type="text">
                        </div>
                        <div class="form-group col-md-6">
                          <input id="Full Name" name="password" placeholder="Mot de passe" class="form-control" type="text">
                        </div>
                        <div class="form-group col-md-6">
                          <input id="Full Name" name="passwordconfirme" placeholder="Confirme mot de passe" class="form-control" type="text">
                        </div>
                        <div class="form-group col-md-6">
                                  
                                  <select id="inputState" class="form-control" name="typestructure">
                                    <option selected>Type de structure ...</option>
                                    <option> Cabinet de recrutement</option>
                                    <option> Entreprise</option>
                                    <option> ONG/Association</option>
                                  </select>
                        </div>
                        <div class="form-group col-md-6">
                          <input id="Full Name" name="nomStructure" placeholder="Nom de structure" class="form-control" type="text">
                        </div>
                        <div class="form-group col-md-6">
                                  
                                  <select id="inputState" class="form-control" name="pays">
                                    <option selected>Pays d'etalissement...</option>
                                    <option> Senegal</option>
                                    <option> Guinée</option>
                                    <option> Mauritanie</option>
                                    <option> Gambie</option>
                                  </select>
                        </div>
                        <div class="form-group col-md-6">
                          <input type="text" class="form-control" name="ville" placeholder="Ville">
                        </div>
                        <div class="form-group col-md-6">
                          <input type="text" class="form-control" name="email" placeholder="Votre email">
                        </div>
                        <div class="form-group col-md-12">
                        <label class="form-label" for="invalidCheck2">Adresse exacte</label>
                                  <textarea id="comment" name="adresseexacte" cols="40" rows="5" class="form-control"></textarea>
                        </div>
                        <div class="form-group col-md-12">
                        <label class="form-label" for="invalidCheck2">Description de la structure</label>
                                  <textarea id="comment" name="description" cols="25" rows="5" class="form-control"></textarea>
                        </div>
                        <div class="form-group col-md-6">
                            <input id="Mobile No." name="telephonebureau" placeholder="Telephone de bureau" class="form-control"  type="text">
                        </div>
                        <div class="form-group col-md-6">
                          <input type="text" class="form-control" name="url" placeholder="Url de votre site">
                        </div>
                        <div class="form-group col-md-6">
                          <input type="text" class="form-control" name="prenomrepondant" placeholder="prenom du repondant">
                        </div>
                        <div class="form-group col-md-6">
                          <input type="text" class="form-control" name="nomrepondant" placeholder="Nom du repondant">
                        </div>
                        <div class="form-group col-md-6">
                          <input type="text" class="form-control" name="telephonerepondant" placeholder="Telephone du repondant">
                        </div>
                        <div class="form-group col-md-6">
                          <input type="text" class="form-control" name="fonctionrepondant" placeholder="Fonction du repondant">
                        </div>
                   </div>                    
                    
                    <div class="form-row">
                        <input class="btn btn-success" type="submit" name="action" value="Envoyer" >
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>
    </div>

<jsp:include page="footer.jsp"></jsp:include>