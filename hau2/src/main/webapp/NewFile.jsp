<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="generator" content="">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto:200,300,400,500,600,700" rel="stylesheet">
</head>
<body>


<!-- HEADER =============================-->
<header class="item header margin-top-0">
<div class="wrapper">
	<nav role="navigation" class="navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button data-target="#navbar-collapse-02" data-toggle="collapse" class="navbar-toggle" type="button">
			<i class="fa fa-bars"></i>
			<span class="sr-only">Toggle navigation</span>
			</button>
			<a href="index.html" class="navbar-brand brand"> SCORILO </a>
		</div>
		<div id="navbar-collapse-02" class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li class="propClone"><a href="index.html">Home</a></li>
				<li class="propClone"><a href="shop.html">Shop</a></li>
				<li class="propClone"><a href="product.html">Product</a></li>
				<li class="propClone"><a href="checkout.html">Checkout</a></li>
				<li class="propClone"><a href="contact.html">Contact</a></li>
			</ul>
		</div>
	</div>
	</nav>
	<div class="container">
		<div class="row">
			<div class="col-md-12 text-center">
				<div class="text-homeimage">
					<div class="maintext-image" data-scrollreveal="enter top over 1.5s after 0.1s">
						 Increase Digital Sales
					</div>
					<div class="subtext-image" data-scrollreveal="enter bottom over 1.7s after 0.3s">
						 Boost revenue with Scorilo
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</header>


<section class="item content">
    <div class="container toparea">
        <div class="underlined-title">
            <div class="editContent">
                <h1 class="text-center latestitems">OUR PRODUCTS</h1>
            </div>
            <div class="wow-hr type_short">
                <span class="wow-hr-h">
                <i class="fa fa-star"></i>
                <i class="fa fa-star"></i>
                <i class="fa fa-star"></i>
                </span>
            </div>
        </div>
    
        <div id="target-contentdm">
            <div class="row">
                <div class="chitiet" id="ct" style="background-color: white;"></div>
                        <div class="chitiet2" id="thongso"></div>
                        <c:forEach items="${productList}" var="product" >
                        <form method="POST" action="pages/themgiohang.php?ID=<?php echo $row['ID']; ?>">
                        <div class="col-md-4">
                            <div class="productbox">
                                <div class="fadeshop">
                                    <div class="captionshop text-center" style="display: none;">
                                        <h3>${product.Tensp}</h3>
                                        <p>
                                             This is a short excerpt to generally describe what the item is about.
                                        </p>
                                        <p>
                                        <!-- <i class="fa fa-shopping-cart"></i> -->
                                        <span class="new" id="<?php echo $row['ID'].'them'; ?>">Purchase</span>
                                            <span class="new" id="<?php echo $row['ID'].'ct'; ?>"><i class="fa fa-link"></i> Details</span>
                                            
                                        </p>
                                    </div>
                                    <span class="maxproduct"><img src="<?php echo $row['Hinh'] ?>" alt=""></span>
                                </div>
                                <div class="product-details">
                                    <a href="#">
                                    <p>${product.Tensp}</p>
                                    </a>
                                    <span class="price">
                                    <span class="edd_price">${product.Gia}</span>
                                    </span>
                                </div>
                            </div>
                        </div>
                        </form>
                        </c:forEach>
                        
                </div> 
        </div>
        
    </div>
    

<!-- FOOTER =============================-->
<div class="footer text-center">
	<div class="container">
		<div class="row">
			<p class="footernote">
				 Connect with Scorilo
			</p>
			<ul class="social-iconsfooter">
				<li><a href="#"><i class="fa fa-phone"></i></a></li>
				<li><a href="#"><i class="fa fa-facebook"></i></a></li>
				<li><a href="#"><i class="fa fa-twitter"></i></a></li>
				<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
				<li><a href="#"><i class="fa fa-pinterest"></i></a></li>
			</ul>
			<p>
				 &copy; 2017 Your Website Name<br/>
				Scorilo - Free template by <a href="https://www.wowthemes.net/">WowThemesNet</a>
			</p>
		</div>
	</div>
</div>

<!-- SCRIPTS =============================-->
<script src="js/jquery-.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/anim.js"></script>
<script>
//----HOVER CAPTION---//	  
jQuery(document).ready(function ($) {
	$('.fadeshop').hover(
		function(){
			$(this).find('.captionshop').fadeIn(150);
		},
		function(){
			$(this).find('.captionshop').fadeOut(150);
		}
	);
});
</script>
	
</body>
</html>