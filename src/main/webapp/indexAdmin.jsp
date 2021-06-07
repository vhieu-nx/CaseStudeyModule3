
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html class="no-js" lang="en">

<meta http-equiv="content-type" content="text/html;charset=utf-8" />
<head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title> ModularAdmin - Free Dashboard Theme | HTML Version </title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="AdminTeamplate/apple-touch-icon.jsp">
        <!-- Place favicon.ico in the root directory -->
        <link rel="stylesheet" href="css/vendor.css">
        <!-- Theme initialization -->
    <script>
        var themeSettings = (localStorage.getItem('themeSettings')) ? JSON.parse(localStorage.getItem('themeSettings')) :
            {};
        var themeName = themeSettings.themeName || '';
        if (themeName)
        {
            document.write('<link rel="stylesheet" id="theme-style" href="css/app-' + themeName + '.css">');
        }
        else
        {
            document.write('<link rel="stylesheet" id="theme-style" href="css/app.css">');
        }
    </script>
    </head>
    <body>
        <div class="main-wrapper">
            <div class="app" id="app">
                <header class="header">
                    <div class="header-block header-block-collapse d-lg-none d-xl-none">
                        <button class="collapse-btn" id="sidebar-collapse-btn">
                            <i class="fa fa-bars"></i>
                        </button>
                    </div>

                    <div class="header-block header-block-nav">
                        <ul class="nav-profile">
                            <li class="profile dropdown">
                                <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
                                    <div class="img" style="background-image: url('https://avatars3.githubusercontent.com/u/3959008?v=3&amp;s=40')"> </div>
                                    <span class="name"> wellcome ${sessionScope.userModel} </span>
                                </a>
                                <div class="dropdown-menu profile-dropdown-menu" aria-labelledby="dropdownMenu1">
                                    <a class="dropdown-item" href="#">
                                        <i class="fa fa-user icon"></i> Profile </a>
                                    <a class="dropdown-item" href="#">
                                        <i class="fa fa-bell icon"></i> Notifications </a>
                                    <a class="dropdown-item" href="#">
                                        <i class="fa fa-gear icon"></i> Settings </a>
                                    <div class="dropdown-divider"></div>
                                    <a class="dropdown-item" href="/index.jsp">
                                        <i class="fa fa-power-off icon"></i> Logout </a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </header>
                <aside class="sidebar">
                    <div class="sidebar-container">
                        <div class="sidebar-header">
                            <div class="brand">
                                <div class="logo">
                                    <span class="l l1"></span>
                                    <span class="l l2"></span>
                                    <span class="l l3"></span>
                                    <span class="l l4"></span>
                                    <span class="l l5"></span>
                                </div> Modular Admin </div>
                        </div>
                        <nav class="menu">
                            <ul class="sidebar-menu metismenu" id="sidebar-menu">
                                <li class="active">
                                    <a href="/admin-home">
                                        <i class="fa fa-home"></i> Dashboard </a>
                                </li>
                                <li>
                                    <a href="/admin-categories">
                                        <i class="fa fa-th-large"></i> Category List
                                    </a>
                                </li>

                                <li>
                                    <a href="/MovieServlet">
                                        <i class="fa fa-th-large"></i> Movie List
                                    </a>
                                </li>
                                <li>
                                    <a href="/ReviewServlet">
                                        <i class="fa fa-th-large"></i> Review List
                                    </a>
                                </li>
                                <li>
                                    <a href="/Login?action=showclientuser">
                                        <i class="fa fa-th-large"></i> User List
                                    </a>
                                </li>
                            </ul>
                        </nav>
                    </div>
                    <footer class="sidebar-footer">
                        <ul class="sidebar-menu metismenu" id="customize-menu">
                            <li>
                                <ul>
                                    <li class="customize">
                                        <div class="customize-item">
                                            <div class="row customize-header">
                                                <div class="col-4"> </div>
                                                <div class="col-4">
                                                    <label class="title">fixed</label>
                                                </div>
                                                <div class="col-4">
                                                    <label class="title">static</label>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-4">
                                                    <label class="title">Sidebar:</label>
                                                </div>
                                                <div class="col-4">
                                                    <label>
                                                        <input class="radio" type="radio" name="sidebarPosition" value="sidebar-fixed">
                                                        <span></span>
                                                    </label>
                                                </div>
                                                <div class="col-4">
                                                    <label>
                                                        <input class="radio" type="radio" name="sidebarPosition" value="">
                                                        <span></span>
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-4">
                                                    <label class="title">Header:</label>
                                                </div>
                                                <div class="col-4">
                                                    <label>
                                                        <input class="radio" type="radio" name="headerPosition" value="header-fixed">
                                                        <span></span>
                                                    </label>
                                                </div>
                                                <div class="col-4">
                                                    <label>
                                                        <input class="radio" type="radio" name="headerPosition" value="">
                                                        <span></span>
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-4">
                                                    <label class="title">Footer:</label>
                                                </div>
                                                <div class="col-4">
                                                    <label>
                                                        <input class="radio" type="radio" name="footerPosition" value="footer-fixed">
                                                        <span></span>
                                                    </label>
                                                </div>
                                                <div class="col-4">
                                                    <label>
                                                        <input class="radio" type="radio" name="footerPosition" value="">
                                                        <span></span>
                                                    </label>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="customize-item">
                                            <ul class="customize-colors">
                                                <li>
                                                    <span class="color-item color-red" data-theme="red"></span>
                                                </li>
                                                <li>
                                                    <span class="color-item color-orange" data-theme="orange"></span>
                                                </li>
                                                <li>
                                                    <span class="color-item color-green active" data-theme=""></span>
                                                </li>
                                                <li>
                                                    <span class="color-item color-seagreen" data-theme="seagreen"></span>
                                                </li>
                                                <li>
                                                    <span class="color-item color-blue" data-theme="blue"></span>
                                                </li>
                                                <li>
                                                    <span class="color-item color-purple" data-theme="purple"></span>
                                                </li>
                                            </ul>
                                        </div>
                                    </li>
                                </ul>
                                <a href="#">
                                    <i class="fa fa-cog"></i> Customize </a>
                            </li>
                        </ul>
                    </footer>
                </aside>
                <div class="sidebar-overlay" id="sidebar-overlay"></div>
                <div class="sidebar-mobile-menu-handle" id="sidebar-mobile-menu-handle"></div>
                <div class="mobile-menu-handle"></div>
                <article class="content dashboard-page">    
                    <section class="section map-tasks">
                        <div class="row sameheight-container">
                            <div class="col-md-8">
                                <div class="card sameheight-item" data-exclude="xs,sm">
                                    <div class="card-header">
                                        <div class="header-block">
                                            <h3 class="title"> Sales by countries </h3>
                                        </div>
                                    </div>
                                    <div class="card-block">
                                        <div id="dashboard-sales-map" style="width: 100%; height: 400px;"></div>
                                    </div>
                                </div>
                            </div>
                            <!-- <div class="col-md-4">
                                <div class="card tasks sameheight-item" data-exclude="xs,sm">
                                    <div class="card-header bordered">
                                        <div class="header-block">
                                            <h3 class="title"> Tasks </h3>
                                        </div>
                                        <div class="header-block pull-right">
                                            <a href="#" class="btn btn-primary btn-sm rounded pull-right"> Add new </a>
                                        </div>
                                    </div>
                                    <div class="card-block">
                                        <div class="tasks-block">
                                            <ul class="item-list">
                                                <li class="item">
                                                    <div class="item-row">
                                                        <div class="item-col item-col-title">
                                                            <label>
                                                                <input class="checkbox" type="checkbox" checked="checked">
                                                                <span>Meeting with embassador</span>
                                                            </label>
                                                        </div>
                                                        <div class="item-col fixed item-col-actions-dropdown">
                                                            <div class="item-actions-dropdown">
                                                                <a class="item-actions-toggle-btn">
                                                                    <span class="inactive">
                                                                        <i class="fa fa-cog"></i>
                                                                    </span>
                                                                    <span class="active">
                                                                        <i class="fa fa-chevron-circle-right"></i>
                                                                    </span>
                                                                </a>
                                                                <div class="item-actions-block">
                                                                    <ul class="item-actions-list">
                                                                        <li>
                                                                            <a class="remove" href="#" data-toggle="modal" data-target="#confirm-modal">
                                                                                <i class="fa fa-trash-o "></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="check" href="#">
                                                                                <i class="fa fa-check"></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="edit" href="item-editor.html">
                                                                                <i class="fa fa-pencil"></i>
                                                                            </a>
                                                                        </li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li class="item">
                                                    <div class="item-row">
                                                        <div class="item-col item-col-title">
                                                            <label>
                                                                <input class="checkbox" type="checkbox" checked="checked">
                                                                <span>Confession</span>
                                                            </label>
                                                        </div>
                                                        <div class="item-col fixed item-col-actions-dropdown">
                                                            <div class="item-actions-dropdown">
                                                                <a class="item-actions-toggle-btn">
                                                                    <span class="inactive">
                                                                        <i class="fa fa-cog"></i>
                                                                    </span>
                                                                    <span class="active">
                                                                        <i class="fa fa-chevron-circle-right"></i>
                                                                    </span>
                                                                </a>
                                                                <div class="item-actions-block">
                                                                    <ul class="item-actions-list">
                                                                        <li>
                                                                            <a class="remove" href="#" data-toggle="modal" data-target="#confirm-modal">
                                                                                <i class="fa fa-trash-o "></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="check" href="#">
                                                                                <i class="fa fa-check"></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="edit" href="item-editor.html">
                                                                                <i class="fa fa-pencil"></i>
                                                                            </a>
                                                                        </li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li class="item">
                                                    <div class="item-row">
                                                        <div class="item-col item-col-title">
                                                            <label>
                                                                <input class="checkbox" type="checkbox">
                                                                <span>Time to start building an ark</span>
                                                            </label>
                                                        </div>
                                                        <div class="item-col fixed item-col-actions-dropdown">
                                                            <div class="item-actions-dropdown">
                                                                <a class="item-actions-toggle-btn">
                                                                    <span class="inactive">
                                                                        <i class="fa fa-cog"></i>
                                                                    </span>
                                                                    <span class="active">
                                                                        <i class="fa fa-chevron-circle-right"></i>
                                                                    </span>
                                                                </a>
                                                                <div class="item-actions-block">
                                                                    <ul class="item-actions-list">
                                                                        <li>
                                                                            <a class="remove" href="#" data-toggle="modal" data-target="#confirm-modal">
                                                                                <i class="fa fa-trash-o "></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="check" href="#">
                                                                                <i class="fa fa-check"></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="edit" href="item-editor.html">
                                                                                <i class="fa fa-pencil"></i>
                                                                            </a>
                                                                        </li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li class="item">
                                                    <div class="item-row">
                                                        <div class="item-col item-col-title">
                                                            <label>
                                                                <input class="checkbox" type="checkbox">
                                                                <span>Beer time with dudes</span>
                                                            </label>
                                                        </div>
                                                        <div class="item-col fixed item-col-actions-dropdown">
                                                            <div class="item-actions-dropdown">
                                                                <a class="item-actions-toggle-btn">
                                                                    <span class="inactive">
                                                                        <i class="fa fa-cog"></i>
                                                                    </span>
                                                                    <span class="active">
                                                                        <i class="fa fa-chevron-circle-right"></i>
                                                                    </span>
                                                                </a>
                                                                <div class="item-actions-block">
                                                                    <ul class="item-actions-list">
                                                                        <li>
                                                                            <a class="remove" href="#" data-toggle="modal" data-target="#confirm-modal">
                                                                                <i class="fa fa-trash-o "></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="check" href="#">
                                                                                <i class="fa fa-check"></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="edit" href="item-editor.html">
                                                                                <i class="fa fa-pencil"></i>
                                                                            </a>
                                                                        </li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li class="item">
                                                    <div class="item-row">
                                                        <div class="item-col item-col-title">
                                                            <label>
                                                                <input class="checkbox" type="checkbox" checked="checked">
                                                                <span>Meeting new girls</span>
                                                            </label>
                                                        </div>
                                                        <div class="item-col fixed item-col-actions-dropdown">
                                                            <div class="item-actions-dropdown">
                                                                <a class="item-actions-toggle-btn">
                                                                    <span class="inactive">
                                                                        <i class="fa fa-cog"></i>
                                                                    </span>
                                                                    <span class="active">
                                                                        <i class="fa fa-chevron-circle-right"></i>
                                                                    </span>
                                                                </a>
                                                                <div class="item-actions-block">
                                                                    <ul class="item-actions-list">
                                                                        <li>
                                                                            <a class="remove" href="#" data-toggle="modal" data-target="#confirm-modal">
                                                                                <i class="fa fa-trash-o "></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="check" href="#">
                                                                                <i class="fa fa-check"></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="edit" href="item-editor.html">
                                                                                <i class="fa fa-pencil"></i>
                                                                            </a>
                                                                        </li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li class="item">
                                                    <div class="item-row">
                                                        <div class="item-col item-col-title">
                                                            <label>
                                                                <input class="checkbox" type="checkbox">
                                                                <span>Remember damned home address</span>
                                                            </label>
                                                        </div>
                                                        <div class="item-col fixed item-col-actions-dropdown">
                                                            <div class="item-actions-dropdown">
                                                                <a class="item-actions-toggle-btn">
                                                                    <span class="inactive">
                                                                        <i class="fa fa-cog"></i>
                                                                    </span>
                                                                    <span class="active">
                                                                        <i class="fa fa-chevron-circle-right"></i>
                                                                    </span>
                                                                </a>
                                                                <div class="item-actions-block">
                                                                    <ul class="item-actions-list">
                                                                        <li>
                                                                            <a class="remove" href="#" data-toggle="modal" data-target="#confirm-modal">
                                                                                <i class="fa fa-trash-o "></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="check" href="#">
                                                                                <i class="fa fa-check"></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="edit" href="item-editor.html">
                                                                                <i class="fa fa-pencil"></i>
                                                                            </a>
                                                                        </li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li class="item">
                                                    <div class="item-row">
                                                        <div class="item-col item-col-title">
                                                            <label>
                                                                <input class="checkbox" type="checkbox">
                                                                <span>Get home before you got sleep</span>
                                                            </label>
                                                        </div>
                                                        <div class="item-col fixed item-col-actions-dropdown">
                                                            <div class="item-actions-dropdown">
                                                                <a class="item-actions-toggle-btn">
                                                                    <span class="inactive">
                                                                        <i class="fa fa-cog"></i>
                                                                    </span>
                                                                    <span class="active">
                                                                        <i class="fa fa-chevron-circle-right"></i>
                                                                    </span>
                                                                </a>
                                                                <div class="item-actions-block">
                                                                    <ul class="item-actions-list">
                                                                        <li>
                                                                            <a class="remove" href="#" data-toggle="modal" data-target="#confirm-modal">
                                                                                <i class="fa fa-trash-o "></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="check" href="#">
                                                                                <i class="fa fa-check"></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="edit" href="item-editor.html">
                                                                                <i class="fa fa-pencil"></i>
                                                                            </a>
                                                                        </li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li class="item">
                                                    <div class="item-row">
                                                        <div class="item-col item-col-title">
                                                            <label>
                                                                <input class="checkbox" type="checkbox" checked="checked">
                                                                <span>Meeting with embassador</span>
                                                            </label>
                                                        </div>
                                                        <div class="item-col fixed item-col-actions-dropdown">
                                                            <div class="item-actions-dropdown">
                                                                <a class="item-actions-toggle-btn">
                                                                    <span class="inactive">
                                                                        <i class="fa fa-cog"></i>
                                                                    </span>
                                                                    <span class="active">
                                                                        <i class="fa fa-chevron-circle-right"></i>
                                                                    </span>
                                                                </a>
                                                                <div class="item-actions-block">
                                                                    <ul class="item-actions-list">
                                                                        <li>
                                                                            <a class="remove" href="#" data-toggle="modal" data-target="#confirm-modal">
                                                                                <i class="fa fa-trash-o "></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="check" href="#">
                                                                                <i class="fa fa-check"></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="edit" href="item-editor.html">
                                                                                <i class="fa fa-pencil"></i>
                                                                            </a>
                                                                        </li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li class="item">
                                                    <div class="item-row">
                                                        <div class="item-col item-col-title">
                                                            <label>
                                                                <input class="checkbox" type="checkbox" checked="checked">
                                                                <span>Confession</span>
                                                            </label>
                                                        </div>
                                                        <div class="item-col fixed item-col-actions-dropdown">
                                                            <div class="item-actions-dropdown">
                                                                <a class="item-actions-toggle-btn">
                                                                    <span class="inactive">
                                                                        <i class="fa fa-cog"></i>
                                                                    </span>
                                                                    <span class="active">
                                                                        <i class="fa fa-chevron-circle-right"></i>
                                                                    </span>
                                                                </a>
                                                                <div class="item-actions-block">
                                                                    <ul class="item-actions-list">
                                                                        <li>
                                                                            <a class="remove" href="#" data-toggle="modal" data-target="#confirm-modal">
                                                                                <i class="fa fa-trash-o "></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="check" href="#">
                                                                                <i class="fa fa-check"></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="edit" href="item-editor.html">
                                                                                <i class="fa fa-pencil"></i>
                                                                            </a>
                                                                        </li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li class="item">
                                                    <div class="item-row">
                                                        <div class="item-col item-col-title">
                                                            <label>
                                                                <input class="checkbox" type="checkbox">
                                                                <span>Time to start building an ark</span>
                                                            </label>
                                                        </div>
                                                        <div class="item-col fixed item-col-actions-dropdown">
                                                            <div class="item-actions-dropdown">
                                                                <a class="item-actions-toggle-btn">
                                                                    <span class="inactive">
                                                                        <i class="fa fa-cog"></i>
                                                                    </span>
                                                                    <span class="active">
                                                                        <i class="fa fa-chevron-circle-right"></i>
                                                                    </span>
                                                                </a>
                                                                <div class="item-actions-block">
                                                                    <ul class="item-actions-list">
                                                                        <li>
                                                                            <a class="remove" href="#" data-toggle="modal" data-target="#confirm-modal">
                                                                                <i class="fa fa-trash-o "></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="check" href="#">
                                                                                <i class="fa fa-check"></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="edit" href="item-editor.html">
                                                                                <i class="fa fa-pencil"></i>
                                                                            </a>
                                                                        </li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li class="item">
                                                    <div class="item-row">
                                                        <div class="item-col item-col-title">
                                                            <label>
                                                                <input class="checkbox" type="checkbox">
                                                                <span>Beer time with dudes</span>
                                                            </label>
                                                        </div>
                                                        <div class="item-col fixed item-col-actions-dropdown">
                                                            <div class="item-actions-dropdown">
                                                                <a class="item-actions-toggle-btn">
                                                                    <span class="inactive">
                                                                        <i class="fa fa-cog"></i>
                                                                    </span>
                                                                    <span class="active">
                                                                        <i class="fa fa-chevron-circle-right"></i>
                                                                    </span>
                                                                </a>
                                                                <div class="item-actions-block">
                                                                    <ul class="item-actions-list">
                                                                        <li>
                                                                            <a class="remove" href="#" data-toggle="modal" data-target="#confirm-modal">
                                                                                <i class="fa fa-trash-o "></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="check" href="#">
                                                                                <i class="fa fa-check"></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="edit" href="item-editor.html">
                                                                                <i class="fa fa-pencil"></i>
                                                                            </a>
                                                                        </li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li class="item">
                                                    <div class="item-row">
                                                        <div class="item-col item-col-title">
                                                            <label>
                                                                <input class="checkbox" type="checkbox" checked="checked">
                                                                <span>Meeting new girls</span>
                                                            </label>
                                                        </div>
                                                        <div class="item-col fixed item-col-actions-dropdown">
                                                            <div class="item-actions-dropdown">
                                                                <a class="item-actions-toggle-btn">
                                                                    <span class="inactive">
                                                                        <i class="fa fa-cog"></i>
                                                                    </span>
                                                                    <span class="active">
                                                                        <i class="fa fa-chevron-circle-right"></i>
                                                                    </span>
                                                                </a>
                                                                <div class="item-actions-block">
                                                                    <ul class="item-actions-list">
                                                                        <li>
                                                                            <a class="remove" href="#" data-toggle="modal" data-target="#confirm-modal">
                                                                                <i class="fa fa-trash-o "></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="check" href="#">
                                                                                <i class="fa fa-check"></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="edit" href="item-editor.html">
                                                                                <i class="fa fa-pencil"></i>
                                                                            </a>
                                                                        </li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li class="item">
                                                    <div class="item-row">
                                                        <div class="item-col item-col-title">
                                                            <label>
                                                                <input class="checkbox" type="checkbox">
                                                                <span>Remember damned home address</span>
                                                            </label>
                                                        </div>
                                                        <div class="item-col fixed item-col-actions-dropdown">
                                                            <div class="item-actions-dropdown">
                                                                <a class="item-actions-toggle-btn">
                                                                    <span class="inactive">
                                                                        <i class="fa fa-cog"></i>
                                                                    </span>
                                                                    <span class="active">
                                                                        <i class="fa fa-chevron-circle-right"></i>
                                                                    </span>
                                                                </a>
                                                                <div class="item-actions-block">
                                                                    <ul class="item-actions-list">
                                                                        <li>
                                                                            <a class="remove" href="#" data-toggle="modal" data-target="#confirm-modal">
                                                                                <i class="fa fa-trash-o "></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="check" href="#">
                                                                                <i class="fa fa-check"></i>
                                                                            </a>
                                                                        </li>
                                                                        <li>
                                                                            <a class="edit" href="item-editor.html">
                                                                                <i class="fa fa-pencil"></i>
                                                                            </a>
                                                                        </li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div> -->
                        </div>
                    </section>
                </article>
                <footer class="footer">
                    <div class="footer-block buttons">
                        <iframe class="footer-github-btn" src="https://ghbtns.com/github-btn.html?user=modularcode&amp;repo=modular-admin-html&amp;type=star&amp;count=true" frameborder="0" scrolling="0" width="140px" height="20px"></iframe>
                    </div>
                    <div class="footer-block author">
                        <ul>
                            <li> created by
                                <a href="https://github.com/modularcode">ModularCode</a>
                            </li>
                            <li>
                                <a href="https://github.com/modularcode/modular-admin-html#get-in-touch">get in touch</a>
                            </li>
                        </ul>
                    </div>
                </footer>
                <div class="modal fade" id="modal-media">
                    <div class="modal-dialog modal-lg">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h4 class="modal-title">Media Library</h4>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                    <span class="sr-only">Close</span>
                                </button>
                            </div>
                            <div class="modal-body modal-tab-container">
                                <ul class="nav nav-tabs modal-tabs" role="tablist">
                                    <li class="nav-item">
                                        <a class="nav-link" href="#gallery" data-toggle="tab" role="tab">Gallery</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link active" href="#upload" data-toggle="tab" role="tab">Upload</a>
                                    </li>
                                </ul>
                                <div class="tab-content modal-tab-content">
                                    <div class="tab-pane fade" id="gallery" role="tabpanel">
                                        <div class="images-container">
                                            <div class="row"> </div>
                                        </div>
                                    </div>
                                    <div class="tab-pane fade active in" id="upload" role="tabpanel">
                                        <div class="upload-container">
                                            <div id="dropzone">
                                                <form action="https://modularcode.io/" method="POST" enctype="multipart/form-data" class="dropzone needsclick dz-clickable" id="demo-upload">
                                                    <div class="dz-message-block">
                                                        <div class="dz-message needsclick"> Drop files here or click to upload. </div>
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button type="button" class="btn btn-primary">Insert Selected</button>
                            </div>
                        </div>
                        <!-- /.modal-content -->
                    </div>
                    <!-- /.modal-dialog -->
                </div>
                <!-- /.modal -->
                <div class="modal fade" id="confirm-modal">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h4 class="modal-title">
                                    <i class="fa fa-warning"></i> Alert</h4>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                <p>Are you sure want to do this?</p>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-primary" data-dismiss="modal">Yes</button>
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>
                            </div>
                        </div>
                        <!-- /.modal-content -->
                    </div>
                    <!-- /.modal-dialog -->
                </div>
                <!-- /.modal -->
            </div>
        </div>
        <!-- Reference block for JS -->
        <div class="ref" id="ref">
            <div class="color-primary"></div>
            <div class="chart">
                <div class="color-primary"></div>
                <div class="color-secondary"></div>
            </div>
        </div>
        <script>
            (function(i, s, o, g, r, a, m)
            {
                i['GoogleAnalyticsObject'] = r;
                i[r] = i[r] || function()
                {
                    (i[r].q = i[r].q || []).push(arguments)
                }, i[r].l = 1 * new Date();
                a = s.createElement(o),
                    m = s.getElementsByTagName(o)[0];
                a.async = 1;
                a.src = g;
                m.parentNode.insertBefore(a, m)
            })(window, document, 'script', '../../www.google-analytics.com/analytics.js', 'ga');
            ga('create', 'UA-80463319-4', 'auto');
            ga('send', 'pageview');
        </script>
        <script src="js/vendor.js"></script>
        <script src="js/app.js"></script>
    </body>

</html>


<!-- <%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--&lt;%&ndash;<a href="/UserServlet?action=create">Tao tài khoản</a>&ndash;%&gt;--%>
<%--&lt;%&ndash;<br>&ndash;%&gt;--%>
<%--&lt;%&ndash;<a href="/UserServlet?action=update">Sửa tài khoản</a>&ndash;%&gt;--%>
<%--&lt;%&ndash;<br>&ndash;%&gt;--%>
<%--&lt;%&ndash;<a href="/UserServlet?action=remove">Xoá tài khoản</a>&ndash;%&gt;--%>

<%--<a href="/UserServlet?action=create">Tao tài khoản</a>--%>
<%--<br>--%>
<%--<a href="/UserServlet?action=update">Sửa tài khoản</a>--%>
<%--<br>--%>
<%--<a href="/UserServlet?action=remove">Xoá tài khoản</a>--%>
<%--<a href="/movie?action=create">Xoá tài khoản</a>--%> -->
