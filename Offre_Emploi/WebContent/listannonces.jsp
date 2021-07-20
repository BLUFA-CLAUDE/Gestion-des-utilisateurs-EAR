<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp"></jsp:include>
	<div class="container-fluid"><br>
			<div class="row">
		<div class="col-md-12">
			<div class="card">
				<div class="card-header">
					<h2 style="text-align:center;">LISTE DES ANNONCES</h2>
				</div>
				<div class="card-body">
								
									
					<table class="table table-striped table-bordered">
										<c:forEach items="${list_annonce}" var="a">
											<tr>
												<td style="text-align:left;">
													<p>
														<a href="Liste?page=description">${ a.poste}</a></br>
														Salaire: ${ a.salaire}</br>
														Lieu: ${a.localisation}</br>
														Date d'annonce: ${a.dateAnonce}
														
													</p>
												</td>										
											</tr>
										</c:forEach>									
								</table>
								
							</div>
						<div class="card-footer">	
					</div>	
				</div>	
			</div>
		</div>
	</div>

<jsp:include page="footer.jsp"></jsp:include>