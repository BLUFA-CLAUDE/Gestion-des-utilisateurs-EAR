<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp"></jsp:include>
	<div class="container-fluid"><br>
		<div class="col-md-12">
		<c:forEach items="${list_annonce}" var="a">
						<p>
							${ a.description}<br>
							<a href="">Postuler</a>
						</p>
		</c:forEach>
	</div>
	</div>

<jsp:include page="footer.jsp"></jsp:include>