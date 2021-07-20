<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <link rel="apple-touch-icon" sizes="76x76" href="./public/template/assets/img/apple-icon.png"/>
    <link rel="icon" type="image/png" href="./public/template/assets/img/favicon.ico"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>Gestion stock</title>
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
    <!--     Fonts and icons     -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" />
    <!-- CSS Files -->
    <link href="./public/template/assets/css/bootstrap.min.css" rel="stylesheet" />
    <link href="./public/template/assets/css/light-bootstrap-dashboard.css?v=2.0.0 " rel="stylesheet" />
    <!-- CSS Just for demo purpose, don't include it in your project -->
    <link href="./public/template/assets/css/demo.css" rel="stylesheet" />
</head>

<body>
    <div class="wrapper">
        <div class="sidebar" data-image="./public/template/assets/img/sidebar-5.jpg">
            <!--
        Tip 1: You can change the color of the sidebar using: data-color="purple | blue | green | orange | red"

        Tip 2: you can also add an image using data-image tag
    -->
            <div class="sidebar-wrapper">
                <div class="logo">
                    <a href="http://localhost:8080/SuiviStock/Acceuil" class="simple-text">
                        Gestion Stock
                    </a>
                </div>
                <ul class="nav">
                    <li class="nav-item active">
                        <a class="nav-link" href="Acceuil">
                            <i class="nc-icon nc-chart-pie-35"></i>
                            <p>Tableau de bord</p>
                        </a>
                    </li>
                    <li>
                        <a class="nav-link" href="User?page=profil">
                            <i class="nc-icon nc-circle-09"></i>
                            <p>User Profile</p>
                        </a>
                    </li>
                    <li>
                        <a class="nav-link" href="User?page=list">
                            <i class="nc-icon nc-notes"></i>
                            <p>Liste Utilisateurs</p>
                        </a>
                    </li>
                    <li>
                        <a class="nav-link" href="Produit?action=list">
                            <i class="nc-icon nc-notes"></i>
                            <p>Gestion des produits</p>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="main-panel">
            <!-- Navbar -->
            <nav class="navbar navbar-expand-lg " color-on-scroll="500">
                <div class="container-fluid">
                    
                    <div class="collapse navbar-collapse justify-content-end" id="navigation">
                        
                        <ul class="navbar-nav ml-auto">
                            <li class="nav-item">
                                <a class="nav-link" href="User?page=profil">
                                    <span class="no-icon">Compte</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="Login?action=logout">
                                    <span class="no-icon">Se connecter</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>