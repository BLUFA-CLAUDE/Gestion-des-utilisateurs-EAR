<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
                <h4 class="pb-4">Annoncez une offre d'emploi</h4>
                <form action="Annonce" method="post">
                    <div class="form-row">
                    	<div class="form-group col-md-6">
                          <input id="Full Name" name="poste" placeholder="Le poste du job" class="form-control" type="text">
                        </div>
                        <div class="form-group col-md-6">
                          <input id="Full Name" name="salaire" placeholder="Salaire du job" class="form-control" type="text">
                        </div>
                        <div class="form-group col-md-6">
                                  
                                  <select name="localisation" id="inputState" class="form-control">
                                    <option selected>Localisation ...</option>
                                    <option> Senegal</option>
                                    <option> Guinée</option>
                                    <option> Mauritanie</option>
                                  </select>
                        </div>
                        <div class="form-group col-md-6">
                          <input id="Full Name" name="dateannonce" placeholder="Date annonce" class="form-control" type="date">
                        </div>
                        <div class="form-group col-md-12">
                        	<label class="form-label" for="invalidCheck2">Description du poste</label>
                                  <textarea id="comment" name="description" cols="40" rows="5" class="form-control"></textarea>
                        </div>
                   </div>                    
                    
                    <div class="form-row">
                        <input type="submit" class="btn btn-success" name="action" value="Envoyer">
                    </div>
                </form>
            </div>
        </div>
    </div>
	</section>
</div>

<jsp:include page="footer.jsp"></jsp:include>