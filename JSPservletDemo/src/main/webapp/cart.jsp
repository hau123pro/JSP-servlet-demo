<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="generator" content="">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="css/newcss.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto:200,300,400,500,600,700" rel="stylesheet">
<script src="js/jquery-.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/anim.js"></script>
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
			<li class="propClone"><a href="shop.html">${loginUser.getUserName()}</a></li>
				<li class="propClone"><a href="index.jsp">Product</a></li>
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
<div class="container toparea" style="background: rgba(234, 241, 234, 1)">
	<div class="underlined-title">
		<div class="editContent">
			<h1 class="text-center latestitems">MAKE PAYMENT</h1>
		</div>
		<div class="wow-hr type_short">
			<span class="wow-hr-h">
			<i class="fa fa-star"></i>
			<i class="fa fa-star"></i>
			<i class="fa fa-star"></i>
			</span>
		</div>
	</div>
	<div id="edd_checkout_wrap" >
		<form id="edd_checkout_cart_form" >
			<div id="edd_checkout_cart_wrap">
			<table style="width:100%;text-align:center">
			<%@ page language="java" import="java.util.*,java.lang.*,DTO.Product,java.text.DecimalFormat" 
			%>
			<% 
			List<Product> Cart=(List<Product>)session.getAttribute("cart");
			int tongtien=0;
			int tongsl=0;
			if(Cart!=null&&Cart.size()!=0){
				
				%>
			
			<?php
				}
			?>
			<div style="width: 700px;height: auto;float: left;margin-top: -9px;position: relative;" id="dssp">
			<% 
				for( Product i: Cart){
				int thanhtien=i.getGia()*i.getSoluong();
				tongtien=tongtien+ thanhtien;
				tongsl=tongsl+i.getSoluong();
			%>
			<!-- FIXXXXXXX -->
<div id="itemincart" style="background-color:white;width: 650px;height: 200px;margin: 10px auto;border-radius: 10px;"><div style="float:left;margin:5px 10px"><img src="images/cam.jpg" style="float:left; height:180px;width:150px"></div>
				<div style="float:left; width:45%; margin-top: 55px; font-size:1em;">
					<p><% out.print(i.getTensp()); %></p>
					<p style="margin-top:20px;font-size:15px;font-weight:400px;color:blue;cursor:pointer " id="<% out.print(i.getID()+"xoa"); %>">Delete</p>
				</div>
				<div style="float:right;width:18%;margin-top:55px;margin-right:20px;font-size:16px">
					<div style="font-weight:bold;">
						<% DecimalFormat formatter = new DecimalFormat("###,###,###.##");
							out.println(formatter.format(i.getGia())+" VND");	
						%>
						</div>
						<div style="text-align:center;margin-top:15px;cursor:pointer">
							<div style="border-radius:5px 0 0 5px; float:left;border:solid 0.5px;width:35px;padding:auto;height:30px;line-height:29px;" id="<% out.print(i.getID()+"tru"); %>">&ndash;
								</div>
							<div style="float:left;border:solid 0.5px;width:40px;padding:auto;font-weight:20;height: 30px;line-height:28px"><input type="text" size=1px style="text-align:center;height:25px;outline:none;border:none" class="<% out.print(i.getID()+"change"); %>" value="<% out.println(i.getSoluong()); %>"></div>
							<div style="border-radius:0 5px 5px 0; float:left;border:solid 0.5px;width:35px;padding:auto;height:30px;line-height:28px" id="<% out.print(i.getID()+"cong"); %>">+</div>
						</div>
					</div>
				</div>
				<script>
                                        
												document.getElementById("<% out.print(i.getID()+"cong"); %>").addEventListener("click",function(){ congsp("<% out.print(i.getID()); %>") });
												document.getElementById("<% out.print(i.getID()+"tru"); %>").addEventListener("click",function(){ trusp("<% out.print(i.getID()); %>") });
												document.getElementById("<% out.print(i.getID()+"xoa"); %>").addEventListener("click",function(){ xoasp("<% out.print(i.getID()); %>") });
												function isso(so) {
													var pattern = new RegExp(/^[0-9]+$/);
													return pattern.test(so);
												}
												$('.<% out.print(i.getID()+"change"); %>').keyup(function(){
													var tk=$('.<% out.print(i.getID()+"change"); %>').val();
													console.log(tk);
													if(isso(tk)){
														$.post('${pageContext.request.contextPath}/CartServlet',{
															ID : <% out.print(i.getID()); %>,
															type: "change",
															soluong:tk
														},function(response){
															if(response!=""){
																alert(response);
																}
															window.location.reload();
														});
													}
													else {
														if(tk!=""){
														alert("Dữ liệu không hợp lệ");
														location.reload();
														}
													}
												});
												function congsp(a){
													var type="cong";
													$.ajax({
														type:"POST",
														url:'${pageContext.request.contextPath}/CartServlet',
														data:  { 
															ID : a,
															type: type
															},
														success: function(response){
															if(response!=""){
															alert(response);
															}
															window.location.reload();
														}
													});
													
												}
												function trusp(a){
													var type="tru";
													$.ajax({
														type:"POST",
														url:'${pageContext.request.contextPath}/CartServlet',
														data:  { 
															ID : a,
															type: type
															},
														success: function(response){
															window.location.reload();
														}
													});
													
												}
												function xoasp(a){
													var type="xoa";
													$.ajax({
														type:"POST",
														url:'${pageContext.request.contextPath}/CartServlet',
														data:  { 
															ID : a,
															type: type
															},
														success: function(response){
															window.location.reload();
														}
													});
													
												}
												
				</script>
			
				
				<!-- FIXXXXXX -->
				<% }
				}
				else {	
					%>
				<tr>
					<td colspan="8"><p>No Product right now</p></td>
				</tr>

				<% } %>
			</div>
			<% if(Cart!=null&&Cart.size()!=0){ %>
			<div style="width: 400px;height: 300px;float: right;border-radius: 10px;background-color: white;margin-bottom:20px" id='tong'>
				<div>
						<div style="margin:40px 120px">ORDER SUMMARY</div>
						<div style="margin-left:20px;">Subtotal (<span id='tongsl'><% out.print(tongsl); %> item(s))<span style="margin-left:90px">
						<% DecimalFormat formatter = new DecimalFormat("###,###,###.##");
							out.println(formatter.format(tongtien)+" VND");	
						%></span> </div>
						<div style="border-bottom:1px solid;margin:30px auto; width:90%;"></div>
						<div style="margin-left:20px;margin-top:20px">Total 
							<span style="margin-left:170px;font-size:20px;color:red;font-weight:bold">
							<% 
								out.println(formatter.format(tongtien)+" VND");	
							%></span>
						</div>
							<input style="margin:10px auto;margin-left:40px;width:80%;border: solid 0.5px;text-align:center;background-color:red;color:white"  type="button" id="thanhtoan" name="edd-purchase" value="Purchase">
					</div>
				</div>
				<% } %>
			</table>
			
			</div>
		</form>
		
	</div>
</div>
</section>

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