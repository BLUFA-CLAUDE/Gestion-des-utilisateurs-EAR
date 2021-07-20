<!DOCTYPE html>
<html lang="en">

<head>
   <title>SESSION</title>
   <!-- HTML5 Shim and Respond.js IE9 support of HTML5 elements and media queries -->
   <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
   <!--[if lt IE 9]>
     <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
     <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
     <![endif]-->

   <meta charset="utf-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no">
   <!-- Favicon icon -->
   <link rel="shortcut icon" href="public/assets/images/favicon.png" type="image/x-icon">
   <link rel="icon" href="public/assets/images/favicon.ico" type="image/x-icon">

   <!-- Google font-->
   <link href="https://fonts.googleapis.com/css?family=Ubuntu:400,500,700" rel="stylesheet">

   <!-- themify -->
   <link rel="stylesheet" type="text/css" href="public/assets/icon/themify-icons/themify-icons.css">

   <!-- iconfont -->
   <link rel="stylesheet" type="text/css" href="public/assets/icon/icofont/css/icofont.css">

   <!-- simple line icon -->
   <link rel="stylesheet" type="text/css" href="public/assets/icon/simple-line-icons/css/simple-line-icons.css">

   <!-- Required Fremwork -->
   <link rel="stylesheet" type="text/css" href="public/assets/plugins/bootstrap/css/bootstrap.min.css">

   <!-- Chartlist chart css -->
   <link rel="stylesheet" href="public/assets/plugins/chartist/dist/chartist.css" type="text/css" media="all">

   <!-- Weather css -->
   <link href="public/assets/css/svg-weather.css" rel="stylesheet">


   <!-- Style.css -->
   <link rel="stylesheet" type="text/css" href="public/assets/css/main.css">

   <!-- Responsive.css-->
   <link rel="stylesheet" type="text/css" href="public/assets/css/responsive.css">

</head>

<body class="sidebar-mini fixed">
   <div class="loader-bg">
      <div class="loader-bar">
      </div>
   </div>
   <div class="wrapper">
      <!-- Navbar-->
      <header class="main-header-top hidden-print">
         <a href="index.html" class="logo"><img class="img-fluid able-logo" src="public/assets/images/logo.png" alt="Theme-logo"></a>
         <nav class="navbar navbar-static-top">
            <!-- Sidebar toggle button-->
            <a href="#!" data-toggle="offcanvas" class="sidebar-toggle"></a>
            
               <ul class="top-nav">
                  <!--Notification Menu-->
                    

                  
                  <!-- User Menu-->
                  <li class="dropdown">
                     <a href="#!" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" class="dropdown-toggle drop icon-circle drop-image">
                        <span><img class="img-circle " src="public/assets/images/widget/jcc.jpg" style="width:40px; height: 40px;" alt="User Image"></span>
                        <span>Jean <b>Claude</b> <i class=" icofont icofont-simple-down"></i></span>

                     </a>
                     <ul class="dropdown-menu settings-menu">
                        <li><a href="#!"><i class="icon-settings"></i> Settings</a></li>
                        <li><a href="#"><i class="icon-user"></i> Profile</a></li>
                        <li><a href="Login?page=login"><i class="icon-logout"></i> Logout</a></li>

                     </ul>
                  </li>
               </ul>

 
               <!-- search end -->
            </div>
         </nav>
      </header>
      <!-- Side-Nav-->
      <aside class="main-sidebar hidden-print ">
         <section class="sidebar" id="sidebar-scroll">
            <!-- Sidebar Menu-->
            <ul class="sidebar-menu">
                <li class="nav-level">--- Navigation</li>
                <li class="active treeview">
                    <a class="waves-effect waves-dark" href="index.html">
                        <i class="icon-speedometer"></i><span> Acceuil</span>
                    </a>                
                </li>
                <li class="nav-level">--- Utilisateurs et Roles</li>
                <li class="treeview"><a class="waves-effect waves-dark" href="#!"><i class="icon-briefcase"></i><span> Utilisateurs</span><i class="icon-arrow-down"></i></a>
                    <ul class="treeview-menu">
                        <li><a class="waves-effect waves-dark" href="User"> Ajouter l'utilisateur</a></li>
                    </ul>
                </li>
                <li class="treeview"><a class="waves-effect waves-dark" href="Role?page=role"><i class="icon-briefcase"></i><span> Roles</span><i class="icon-arrow-down"></i></a>
                    <ul class="treeview-menu">
                        <li><a class="waves-effect waves-dark" href="Role?page=role">Ajouter un role</a></li>
                    </ul>
                </li>
            </ul>
         </section>
      </aside>
      