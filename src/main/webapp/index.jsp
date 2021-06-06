<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mr.Nguyen
  Date: 6/4/2021
  Time: 11:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<
<html>
<head>
    <style>
        input {
            color: #1b1e21;
        }
    </style>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Moviepoint - Online Movie,Vedio and TV Show HTML Template</title>
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
                <a href="#"><img src="assets/img/logo.png" alt="logo"/></a>
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
                    <li><a href="#">Welcome </a></li>
                    <li><a href="#">${sessionScope.userModel}</a></li>
                    <li><a class="login-popup" href="#">Đăng Nhập</a></li>
                    <li><a href="/Login?action=create">Đăng Ký</a></li>
                    <li><a href="/Login?action=logout">Đăng Xuất</a></li>
                </ul>
            </div>
            <div class="menu-area">
                <div class="responsive-menu"></div>
                <div class="mainmenu">
                    <ul id="primary-menu">
                        <li><a class="active" href='<c:url value="/Login"/>'>Home</a></li>
                        <li><a href="movies.jsp">Movies</a></li>

                        <li><a href="top-movies.jsp">Top Movies</a></li>

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
            <h6>YOUR NAME</h6>
            <input type="text" name="name"/>
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
            <p>${s}</p>
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
<!-- hero area start -->
<section class="hero-area" id="home">
    <div class="container">
        <div class="hero-area-slider">
            <c:forEach var="listMovie" items="${listMovie}">
            <div class="row hero-area-slide">
                <div class="col-lg-6 col-md-5">
                    <div class="hero-area-content">
                        <img src="${listMovie.image_movie}" alt="about"/>
                    </div>
                </div>
                <div class="col-lg-6 col-md-7">
                    <div class="hero-area-content pr-50">
                        <h2>${listMovie.title}</h2>
                        <div class="review">
                            <div class="author-review">
                                <i class="icofont icofont-star"></i>
                                <i class="icofont icofont-star"></i>
                                <i class="icofont icofont-star"></i>
                                <i class="icofont icofont-star"></i>
                                <i class="icofont icofont-star"></i>
                            </div>
                            <h4>180k voters</h4>
                        </div>
                        <p>${listMovie.description}</p>
                        <div class="slide-trailor">
                            <h3>Watch Trailer</h3>
                            <a class="theme-btn theme-btn2 popup-youtube" href="${listMovie.youtubeTrainer}" >Trainer</a>
                        </div>
                    </div>
                </div>
            </div>
            </c:forEach>
<%--            <div class="row hero-area-slide">--%>
<%--                <div class="col-lg-6 col-md-5">--%>
<%--                    <div class="hero-area-content">--%>
<%--                        <img src="assets/img/slide1.png" alt="about"/>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="col-lg-6 col-md-7">--%>
<%--                    <div class="hero-area-content pr-50">--%>
<%--                        <h2>Last Avatar</h2>--%>
<%--                        <div class="review">--%>
<%--                            <div class="author-review">--%>
<%--                                <i class="icofont icofont-star"></i>--%>
<%--                                <i class="icofont icofont-star"></i>--%>
<%--                                <i class="icofont icofont-star"></i>--%>
<%--                                <i class="icofont icofont-star"></i>--%>
<%--                                <i class="icofont icofont-star"></i>--%>
<%--                            </div>--%>
<%--                            <h4>180k voters</h4>--%>
<%--                        </div>--%>
<%--                        <p>She is a devil princess from the demon world. She grew up sheltered by her parents and--%>
<%--                            doesn't really know how to be evil or any of the common actions, She is unable to cry due to--%>
<%--                            Keita's accidental first wish, despite needed for him to wish...</p>--%>
<%--                        <h3>Cast:</h3>--%>
<%--                        <div class="slide-cast">--%>
<%--                            <div class="single-slide-cast">--%>
<%--                                <img src="assets/img/cast/cast1.png" alt="about"/>--%>
<%--                            </div>--%>
<%--                            <div class="single-slide-cast">--%>
<%--                                <img src="assets/img/cast/cast2.html" alt="about"/>--%>
<%--                            </div>--%>
<%--                            <div class="single-slide-cast">--%>
<%--                                <img src="assets/img/cast/cast3.png" alt="about"/>--%>
<%--                            </div>--%>
<%--                            <div class="single-slide-cast">--%>
<%--                                <img src="assets/img/cast/cast4.png" alt="about"/>--%>
<%--                            </div>--%>
<%--                            <div class="single-slide-cast">--%>
<%--                                <img src="assets/img/cast/cast5.png" alt="about"/>--%>
<%--                            </div>--%>
<%--                            <div class="single-slide-cast">--%>
<%--                                <img src="assets/img/cast/cast6.png" alt="about"/>--%>
<%--                            </div>--%>
<%--                            <div class="single-slide-cast">--%>
<%--                                <img src="assets/img/cast/cast7.png" alt="about"/>--%>
<%--                            </div>--%>
<%--                            <div class="single-slide-cast text-center">--%>
<%--                                5+--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                        <div class="slide-trailor">--%>
<%--                            <h3>Watch Trailer</h3>--%>
<%--                            <a class="theme-btn theme-btn2" href="#"><i class="icofont icofont-play"></i> Tickets</a>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--            <div class="row hero-area-slide">--%>
<%--                <div class="col-lg-6 col-md-5">--%>
<%--                    <div class="hero-area-content">--%>
<%--                        <img src="assets/img/slide3.png" alt="about"/>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="col-lg-6 col-md-7">--%>
<%--                    <div class="hero-area-content pr-50">--%>
<%--                        <h2>The Deer God</h2>--%>
<%--                        <div class="review">--%>
<%--                            <div class="author-review">--%>
<%--                                <i class="icofont icofont-star"></i>--%>
<%--                                <i class="icofont icofont-star"></i>--%>
<%--                                <i class="icofont icofont-star"></i>--%>
<%--                                <i class="icofont icofont-star"></i>--%>
<%--                                <i class="icofont icofont-star"></i>--%>
<%--                            </div>--%>
<%--                            <h4>180k voters</h4>--%>
<%--                        </div>--%>
<%--                        <p>She is a devil princess from the demon world. She grew up sheltered by her parents and--%>
<%--                            doesn't really know how to be evil or any of the common actions, She is unable to cry due to--%>
<%--                            Keita's accidental first wish, despite needed for him to wish...</p>--%>
<%--                        <h3>Cast:</h3>--%>
<%--                        <div class="slide-cast">--%>
<%--                            <div class="single-slide-cast">--%>
<%--                                <img src="assets/img/cast/cast1.png" alt="about"/>--%>
<%--                            </div>--%>
<%--                            <div class="single-slide-cast">--%>
<%--                                <img src="assets/img/cast/cast2.html" alt="about"/>--%>
<%--                            </div>--%>
<%--                            <div class="single-slide-cast">--%>
<%--                                <img src="assets/img/cast/cast3.png" alt="about"/>--%>
<%--                            </div>--%>
<%--                            <div class="single-slide-cast">--%>
<%--                                <img src="assets/img/cast/cast4.png" alt="about"/>--%>
<%--                            </div>--%>
<%--                            <div class="single-slide-cast">--%>
<%--                                <img src="assets/img/cast/cast5.png" alt="about"/>--%>
<%--                            </div>--%>
<%--                            <div class="single-slide-cast">--%>
<%--                                <img src="assets/img/cast/cast6.png" alt="about"/>--%>
<%--                            </div>--%>
<%--                            <div class="single-slide-cast">--%>
<%--                                <img src="assets/img/cast/cast7.png" alt="about"/>--%>
<%--                            </div>--%>
<%--                            <div class="single-slide-cast text-center">--%>
<%--                                5+--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                        <div class="slide-trailor">--%>
<%--                            <h3>Watch Trailer</h3>--%>
<%--                            <a class="theme-btn theme-btn2" href="#"><i class="icofont icofont-play"></i> Tickets</a>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
        </div>
        <div class="hero-area-thumb">
            <div class="thumb-prev">
                <div class="row hero-area-slide">
                    <div class="col-lg-6">
                        <div class="hero-area-content">
                            <img src="assets/img/slide3.png" alt="about"/>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="hero-area-content pr-50">
                            <h2>Last Avatar</h2>
                            <div class="review">
                                <div class="author-review">
                                    <i class="icofont icofont-star"></i>
                                    <i class="icofont icofont-star"></i>
                                    <i class="icofont icofont-star"></i>
                                    <i class="icofont icofont-star"></i>
                                    <i class="icofont icofont-star"></i>
                                </div>
                                <h4>180k voters</h4>
                            </div>
                            <p>She is a devil princess from the demon world. She grew up sheltered by her parents and
                                doesn't really know how to be evil or any of the common actions, She is unable to cry
                                due to Keita's accidental first wish, despite needed for him to wish...</p>
                            <h3>Cast:</h3>
                            <div class="slide-cast">
                                <div class="single-slide-cast">
                                    <img src="assets/img/cast/cast1.png" alt="about"/>
                                </div>
                                <div class="single-slide-cast">
                                    <img src="assets/img/cast/cast2.html" alt="about"/>
                                </div>
                                <div class="single-slide-cast">
                                    <img src="assets/img/cast/cast3.png" alt="about"/>
                                </div>
                                <div class="single-slide-cast">
                                    <img src="assets/img/cast/cast4.png" alt="about"/>
                                </div>
                                <div class="single-slide-cast">
                                    <img src="assets/img/cast/cast5.png" alt="about"/>
                                </div>
                                <div class="single-slide-cast">
                                    <img src="assets/img/cast/cast6.png" alt="about"/>
                                </div>
                                <div class="single-slide-cast">
                                    <img src="assets/img/cast/cast7.png" alt="about"/>
                                </div>
                                <div class="single-slide-cast text-center">
                                    5+
                                </div>
                            </div>
                            <div class="slide-trailor">
                                <h3>Watch Trailer</h3>
                                <a class="theme-btn theme-btn2" href="#"><i class="icofont icofont-play"></i>
                                    Tickets</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="thumb-next">
                <div class="row hero-area-slide">
                    <div class="col-lg-6">
                        <div class="hero-area-content">
                            <img src="assets/img/slide1.png" alt="about"/>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="hero-area-content pr-50">
                            <h2>The Deer God</h2>
                            <div class="review">
                                <div class="author-review">
                                    <i class="icofont icofont-star"></i>
                                    <i class="icofont icofont-star"></i>
                                    <i class="icofont icofont-star"></i>
                                    <i class="icofont icofont-star"></i>
                                    <i class="icofont icofont-star"></i>
                                </div>
                                <h4>180k voters</h4>
                            </div>
                            <p>She is a devil princess from the demon world. She grew up sheltered by her parents and
                                doesn't really know how to be evil or any of the common actions, She is unable to cry
                                due to Keita's accidental first wish, despite needed for him to wish...</p>
                            <h3>Cast:</h3>
                            <div class="slide-cast">
                                <div class="single-slide-cast">
                                    <img src="assets/img/cast/cast1.png" alt="about"/>
                                </div>
                                <div class="single-slide-cast">
                                    <img src="assets/img/cast/cast2.html" alt="about"/>
                                </div>
                                <div class="single-slide-cast">
                                    <img src="assets/img/cast/cast3.png" alt="about"/>
                                </div>
                                <div class="single-slide-cast">
                                    <img src="assets/img/cast/cast4.png" alt="about"/>
                                </div>
                                <div class="single-slide-cast">
                                    <img src="assets/img/cast/cast5.png" alt="about"/>
                                </div>
                                <div class="single-slide-cast">
                                    <img src="assets/img/cast/cast6.png" alt="about"/>
                                </div>
                                <div class="single-slide-cast">
                                    <img src="assets/img/cast/cast7.png" alt="about"/>
                                </div>
                                <div class="single-slide-cast text-center">
                                    5+
                                </div>
                            </div>
                            <div class="slide-trailor">
                                <h3>Watch Trailer</h3>
                                <a class="theme-btn theme-btn2" href="#"><i class="icofont icofont-play"></i>
                                    Tickets</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section><!-- hero area end -->
<!-- portfolio section start -->
<section class="portfolio-area pt-60">
    <div class="container">
        <div class="row flexbox-center">
            <div class="col-lg-6 text-center text-lg-left">
                <div class="section-title">
                    <h1><i class="icofont icofont-movie"></i> Spotlight This Month</h1>
                </div>
            </div>
            <div class="col-lg-6 text-center text-lg-right">
                <div class="portfolio-menu">
                    <ul>
                        <li data-filter="*" class="active">Latest</li>
                        <li data-filter=".soon">Comming Soon</li>
                        <li data-filter=".top">Top Rated</li>
                        <li data-filter=".released">Recently Released</li>
                    </ul>
                </div>
            </div>
        </div>
        <hr/>
        <div class="row">
            <div class="col-lg-9">
                <div class="row portfolio-item">
                    <c:forEach var="movie" items="${listMovie}">
                    <div class="col-md-4 col-sm-6 soon released">
                        <div class="single-portfolio">
                            <div class="single-portfolio-img">
                                <img src="${movie.image_movie}" alt="portfolio"/>
                                <a href="${movie.videoMovie}" class="popup-youtube">
                                    <i class="icofont icofont-ui-play"></i>
                                </a>
                            </div>
                            <div class="portfolio-content">
                                <h2>${movie.title}</h2>
                                <div class="review">
                                    <div class="author-review">
                                        <i class="icofont icofont-star"></i>
                                        <i class="icofont icofont-star"></i>
                                        <i class="icofont icofont-star"></i>
                                        <i class="icofont icofont-star"></i>
                                        <i class="icofont icofont-star"></i>
                                    </div>
                                    <h4>180k voters</h4>
                                </div>
                            </div>
                        </div>
                    </div>
                    </c:forEach>
                </div>
            </div>
            <div class="col-lg-3 text-center text-lg-left">
                <div class="portfolio-sidebar">
                    <img src="assets/img/sidebar/sidebar1.png" alt="sidebar"/>
                    <img src="assets/img/sidebar/sidebar2.png" alt="sidebar"/>
                    <img src="assets/img/sidebar/sidebar3.png" alt="sidebar"/>
                    <img src="assets/img/sidebar/sidebar4.png" alt="sidebar"/>
                </div>
            </div>
        </div>
    </div>
</section><!-- portfolio section end -->
<!-- video section start --><!-- news section end -->
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
