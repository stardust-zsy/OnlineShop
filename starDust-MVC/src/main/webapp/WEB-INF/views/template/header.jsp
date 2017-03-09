<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: Le
  Date: 1/2/2016
  Time: 5:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>My Music Store</title>
<script src="<c:url value="/resources/js/angularJS.js" />"></script>
<!-- Bootstrap core CSS -->
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">

<!-- Carousel CSS -->
<link href="<c:url value="/resources/css/carousel.css" />"
	rel="stylesheet">

<!-- Main CSS -->
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">



</head>
<!-- NAVBAR
================================================== -->
<body>
	<div class="navbar-wrapper">
		<div class="container">

			<nav class="navbar navbar-inverse navbar-static-top">
				<div class="container">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed"
							data-toggle="collapse" data-target="#navbar"
							aria-expanded="false" aria-controls="navbar">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#">Project name</a>
					</div>
					<div id="navbar" class="navbar-collapse collapse">
						<ul class="nav navbar-nav">
							<li class="active"><a href="<c:url value="/" /> ">Home</a></li>
							<li><a href="<c:url value="/getProductList" />">Products</a></li>
							<li><a href="#contact">Contact</a></li>
						</ul>
						<ul class="nav navbar-nav pull-right">
							<li><a href="<c:url value="/admin" />">Admin</a></li>
						</ul>
					</div>
				</div>
			</nav>

		</div>
	</div>