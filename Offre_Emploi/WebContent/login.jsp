<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="bootstrap/bootstrap.min.css"/>
<link rel="stylesheet" href="css/style.css"/>
<jsp:include page="header.jsp"></jsp:include>
	<div class="container-fluid">
	<div id="login">
        <h3 class="text-center text-white pt-5">Login</h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form id="login-form" class="form" action="Login" method="post">
                            <h3 class="text-center text-info">Login</h3>
                            <div class="form-group">
                                <label for="username" class="text-info">Email:</label><br>
                                <input type="text" name="email" id="email" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Password:</label><br>
                                <input type="text" name="password" id="password" class="form-control">
                                                               
                            </div>
                            <div class="form-group">
                                <input type="submit" name="" class="btn btn-info btn-md" value="CONNECTER">
                            </div>
                            <div class="text-right">
                                <a href="Inscrire?action=S'INSCRIRE" class="text-info">Incrivez-vous ici</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
	</div> 
	<br> 
<jsp:include page="footer.jsp"></jsp:include>