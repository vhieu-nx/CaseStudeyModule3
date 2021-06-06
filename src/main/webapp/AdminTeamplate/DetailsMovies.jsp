<%--
  Created by IntelliJ IDEA.
  User: Mr.Nguyen
  Date: 6/5/2021
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Moviepoint - Details Movie</title>
    <!-- Favicon Icon -->
    <link rel="icon" type="image/png" href="assets/img/favcion.png"/>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css" media="all"/>
    <!-- Slick nav CSS -->
    <link rel="stylesheet" type="text/css" href="assets/css/slicknav.min.css" media="all"/>
    <!-- Iconfont CSS -->
    <link rel="stylesheet" type="text/css" href="assets/css/icofont.css" media="all"/>
    <!-- Owl carousel CSS -->
    <link rel="stylesheet" type="text/css" href="assets/css/owl.carousel.css">
    <!-- Popup CSS -->
    <link rel="stylesheet" type="text/css" href="assets/css/magnific-popup.css">
    <!-- Main style CSS -->
    <link rel="stylesheet" type="text/css" href="assets/css/style.css" media="all"/>
    <!-- Responsive CSS -->
    <link rel="stylesheet" type="text/css" href="assets/css/responsive.css" media="all"/>
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<!-- Page loader -->
<div id="preloader"></div>
<!-- header section start -->
<header class="header">
    <div class="container">
        <div class="header-area">
            <div class="logo">
                <a href="index-2.html"><img src="assets/img/logo.png" alt="logo"/></a>
            </div>
            <div class="header-right">
                <form action="#">
                    <select>
                        <option value="Movies">Movies</option>
                        <option value="Movies">Movies</option>
                        <option value="Movies">Movies</option>
                    </select>
                    <input type="text"/>
                    <button><i class="icofont icofont-search"></i></button>
                </form>
                <ul>
                    <li><a href="#">Welcome Guest!</a></li>
                    <li><a class="login-popup" href="#">Login</a></li>
                </ul>
            </div>
            <div class="menu-area">
                <div class="responsive-menu"></div>
                <div class="mainmenu">
                    <ul id="primary-menu">
                        <li><a class="active" href="/trang-chu">Home</a></li>
                        <li><a href="#">Movies</a></li>

                        <li><a href="#">Top Movies</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</header>
<div class="login-area">
    <div class="login-box">
        <a href="#"><i class="icofont icofont-close"></i></a>
        <h2>LOGIN</h2>
        <form action="/Login?action=login" method="post">
            <h6>EMAIL ADDRESS</h6>
            <input type="text" name="email"/>
            <h6>PASSWORD</h6>
            <input type="text" name="password"/>
            <div class="login-remember">
                <input type="checkbox"/>
                <span>Remember Me</span>
            </div>
            <div class="login-signup">
                <span>SIGNUP</span>
            </div>
            <button type="submit" style="color:#e91010" class="theme-btn" value="login">LOGIN</button>
            <p></p>
            <%--					<a href="/UserServlet" class="theme-btn">LOG IN</a>--%>
            <span>Or Via Social</span>
            <div class="login-social">
                <a href="#"><i class="icofont icofont-social-facebook"></i></a>
                <a href="#"><i class="icofont icofont-social-twitter"></i></a>
                <a href="#"><i class="icofont icofont-social-linkedin"></i></a>
                <a href="#"><i class="icofont icofont-social-google-plus"></i></a>
                <a href="#"><i class="icofont icofont-camera"></i></a>
            </div>
        </form>

    </div>
</div>
<!-- header section end -->
<!-- breadcrumb area start -->
<section class="breadcrumb-area">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumb-area-content">
                    <h1>Movie Detalied Page</h1>
                </div>
            </div>
        </div>
    </div>
</section><!-- breadcrumb area end -->
<!-- transformers area start -->
<section class="transformers-area" id="myDIV">
    <div class="container">
        <div class="transformers-box">
            <div class="row flexbox-center">
                <div class="col-lg-5 text-lg-left text-center">
                    <div class="transformers-content">
                        <img src="${movies.image_movie}" alt="about"/>
                    </div>
                </div>
                <div class="col-lg-7">
                    <div style="color: #3bc1f1" class="transformers-content">
                        <h2 style="margin-left: 50px;color: orangered">Title: ${movies.title}</h2>
                        <p style="color: #3bc1f1"> Category
                            <c:forEach items="${categories}" var="category">
                                <option style="color: #3bc1f1" value="${category.category_id}"
                                        <c:forEach items="${categoriesOfMovie}" var="cOB">
                                            <c:if test="${category.category_id == categoryOfMovie.movie_id}">selected="true"</c:if>
                                        </c:forEach>>
                                        ${category.name}
                                </option>
                            </c:forEach>
                        </p>
                        <ul>
                            <li>
                                <div class="transformers-left">
                                    Content:
                                </div>
                                <div class="transformers-right">
                                    ${movies.content}>
                                </div>
                            </li>
                            <li>
                                <div class="transformers-left">
                                    Time:
                                </div>
                                <div class="transformers-right">
                                    190m
                                </div>
                            </li>
                            <li>
                                <div class="transformers-left">
                                    Description
                                </div>
                                <div class="transformers-right">
                                    ${movies.description}
                                </div>
                            </li>
                            <li>
                                <div class="transformers-left">
                                    Language:
                                </div>
                                <div class="transformers-right">
                                    VietNamese
                                </div>
                            </li>

                            <li>
                                <div class="transformers-left">
                                    Share:
                                </div>
                                <div class="transformers-right">
                                    <a href="#"><i class="icofont icofont-social-facebook"></i></a>
                                    <a href="#"><i class="icofont icofont-social-twitter"></i></a>
                                    <a href="#"><i class="icofont icofont-social-google-plus"></i></a>
                                    <a href="#"><i class="icofont icofont-youtube-play"></i></a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>

        </div>
    </div>
</section><!-- transformers area end -->
<!-- details area start -->
<section class="details-area">
    <div class="container">
        <div class="row">
            <div class="col-lg-9">
                <div class="details-content">
                    <div class="details-overview">
                        <h2>Overview</h2>
                        <p>Humans are at war with the Transformers, and Optimus Prime is gone. The key to saving the
                            future lies buried in the secrets of the past and the hidden history of Transformers on
                            Earth. Now it's up to the unlikely alliance of inventor Cade Yeager, Bumblebee, a n English
                            lord and an Oxford professor to save the world. Transformers: The Last Knight has a deeper
                            mythos and bigger spectacle than its predecessors, yet still ends up being mostly hollow and
                            cacophonous. The first "Transformers" movie that could actually be characterized as badass.
                            Which isn't a bad thing. It may, in fact, be better.</p>
                    </div>
                    <div class="details-reply">
                        <h2>Leave a Reply</h2>
                        <form action="#">
                            <div class="row">
                                <div class="col-lg-4">
                                    <div class="select-container">
                                        <input type="text" placeholder="Name"/>
                                        <i class="icofont icofont-ui-user"></i>
                                    </div>
                                </div>
                                <div class="col-lg-4">
                                    <div class="select-container">
                                        <input type="text" placeholder="Email"/>
                                        <i class="icofont icofont-envelope"></i>
                                    </div>
                                </div>
                                <div class="col-lg-4">
                                    <div class="select-container">
                                        <input type="text" placeholder="Phone"/>
                                        <i class="icofont icofont-phone"></i>
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="textarea-container">
                                        <textarea placeholder="Type Here Message"></textarea>
                                        <button><i class="icofont icofont-send-mail"></i></button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="details-comment">
                        <a class="theme-btn theme-btn2" href="#">Post Comment</a>
                        <p>You may use these HTML tags and attributes: You may use these HTML tags and attributes: You
                            may use these HTML tags and attributes: </p>
                    </div>
                    <div class="details-thumb">
                        <div class="details-thumb-prev">
                            <div class="thumb-icon">
                                <i class="icofont icofont-simple-left"></i>
                            </div>
                            <div class="thumb-text">
                                <h4>Previous Post</h4>
                                <p>Standard Post With Gallery</p>
                            </div>
                        </div>
                        <div class="details-thumb-next">
                            <div class="thumb-text">
                                <h4>Next Post</h4>
                                <p>Standard Post With Preview Image</p>
                            </div>
                            <div class="thumb-icon">
                                <i class="icofont icofont-simple-right"></i>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 text-center text-lg-left">
                <div class="portfolio-sidebar">
                    <img src="assets/img/sidebar/sidebar1.png" alt="sidebar"/>
                    <img src="assets/img/sidebar/sidebar2.png" alt="sidebar"/>
                    <img src="assets/img/sidebar/sidebar4.png" alt="sidebar"/>
                </div>
            </div>
        </div>
    </div>
</section><!-- details area end -->
<!-- footer section start -->
<footer class="footer">
    <div class="container">
        <div class="row">
            <div class="col-lg-3 col-sm-6">
                <div class="widget">
                    <img src="assets/img/logo.png" alt="about"/>
                    <p>7th Harley Place, London W1G 8LZ United Kingdom</p>
                    <h6><span>Call us: </span>(+880) 111 222 3456</h6>
                </div>
            </div>
            <div class="col-lg-3 col-sm-6">
                <div class="widget">
                    <h4>Legal</h4>
                    <ul>
                        <li><a href="#">Terms of Use</a></li>
                        <li><a href="#">Privacy Policy</a></li>
                        <li><a href="#">Security</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-3 col-sm-6">
                <div class="widget">
                    <h4>Account</h4>
                    <ul>
                        <li><a href="#">My Account</a></li>
                        <li><a href="#">Watchlist</a></li>
                        <li><a href="#">Collections</a></li>
                        <li><a href="#">User Guide</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-3 col-sm-6">
                <div class="widget">
                    <h4>Newsletter</h4>
                    <p>Subscribe to our newsletter system now to get latest news from us.</p>
                    <form action="#">
                        <input type="text" placeholder="Enter your email.."/>
                        <button>SUBSCRIBE NOW</button>
                    </form>
                </div>
            </div>
        </div>
        <hr/>
    </div>
    <div class="copyright">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 text-center text-lg-left">
                    <div class="copyright-content">
                        <p><a target="_blank" href="https://www.templateshub.net">Templates Hub</a></p>
                    </div>
                </div>
                <div class="col-lg-6 text-center text-lg-right">
                    <div class="copyright-content">
                        <a href="#" class="scrollToTop">
                            Back to top<i class="icofont icofont-arrow-up"></i>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</footer><!-- footer section end -->
<!-- jquery main JS -->
<script src="assets/js/jquery.min.js"></script>
<!-- Bootstrap JS -->
<script src="assets/js/bootstrap.min.js"></script>
<!-- Slick nav JS -->
<script src="assets/js/jquery.slicknav.min.js"></script>
<!-- owl carousel JS -->
<script src="assets/js/owl.carousel.min.js"></script>
<!-- Popup JS -->
<script src="assets/js/jquery.magnific-popup.min.js"></script>
<!-- Isotope JS -->
<script src="assets/js/isotope.pkgd.min.js"></script>
<!-- main JS -->
<script src="assets/js/main.js"></script>
</body>

</html>
