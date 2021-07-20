<!DOCTYPE html>
<html>
<head>
    <title>acceuil</title>
	<link rel="stylesheet" href="css/style.css"/>
	<link rel="stylesheet" href="bootstrap/bootstrap.min.css"/>
    <!-- meta tags -->
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">    
</head>
<nav id="mainNavbar" class="navbar navbar-dark navbar-expand-md py-0 fixed-top"> 
    <div class="collapse navbar-collapse" id="navLinks">
        <ul class="navbar-nav">
            <li class="nav-item"> <a href="Accueil?page=acceuil" class="nav-link">HOME</a> </li>
            <li class="nav-item"> <a href="Liste?page=liste" class="nav-link">LES OFFRES</a> </li>
            <li class="nav-item"> <a href="Recruteur?page=recruteur" class="nav-link">JE VEUX RECRUTER</a> </li>
            <li class="nav-item"> <a href="Accueil?page=candidat" class="nav-link">JE CHERCHE UN JOB</a> </li>
            <li class="nav-item"> <a href="Administrateur?page=administrateur" class="nav-link">PARMETRES</a> </li>
        </ul><hr>
         <form action="Inscrire" method="get" style="padding-top: 20px;" class=" my-lg-0">
         	<input class="btn btn-primary my-sm-0" type="submit" name="action" value="Passez une annonce">
         	<input class="btn btn-secondary my-sm-0" type="submit" name="action" value="Se CONNECTER">
      		<input class="btn btn-dark my-sm-0" type="submit" name="action" value="S'INSCRIRE">
    	</form>
    </div>
</nav>

<header>
    <div id="indicators" class="carousel slide" data-ride="carousel">
       
        <div class="carousel-inner" role="listbox">
            <!-- Slide One - Set the background image for this slide in the line below -->
            <div class="carousel-item active" style="background-image: url('https://images.unsplash.com/32/Mc8kW4x9Q3aRR3RkP5Im_IMG_4417.jpg?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80')">
                <div class="carousel-caption d-none d-md-block">
                    <h2 class="display-4">Votre Job partenaire au quotidien.</h2>
                    <p class="para">COYAHjob simplifie vos actions de recrutement et votre recherche d'emploi.</p>
                </div>
            </div> <!-- Slide Two - Set the background image for this slide in the line below -->
            <div class="carousel-item" >
                <div class="carousel-caption d-none d-md-block">
                    <h2 class="display-4">Image two</h2>
                    <p class="lead">Some description about the second slide</p>
                </div>
            </div> <!-- Slide Three - Set the background image for this slide in the line below -->
            <div class="carousel-item" style="background-image: url('https://images.unsplash.com/photo-1453799527828-cf1bd7b2f682?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1349&q=80')">
                <div class="carousel-caption d-none d-md-block">
                    <h2 class="display-4">Image three</h2>
                    <p class="lead">Some description about the third slide</p>
                </div>
            </div>
        </div> <a class="carousel-control-prev" href="#indicators" role="button" data-slide="prev"> <span class="carousel-control-prev-icon" aria-hidden="true"></span> <span class="sr-only">Previous</span> </a> <a class="carousel-control-next" href="#indicators" role="button" data-slide="next"> <span class="carousel-control-next-icon" aria-hidden="true"></span> <span class="sr-only">Next</span> </a>
    </div>
</header>
<body>
   