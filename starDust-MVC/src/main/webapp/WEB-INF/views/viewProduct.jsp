<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@include file="/WEB-INF/views/template/header.jsp"%>
<!-- Marketing messaging and featurettes
    ================================================== -->
<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>product detail</h1>
		</div>
		<div class="container" ng-app="cartApp">
			<div class="row">
				<div class="col-md-5">
					<img src="/pic/${product.productId}.png" alt="image"
						style="width: 100%; height: 300px" />
				</div>
				<div class="col-md-5">
					<h2>productName:${product.productName}</h2>
					<h3>productCategory:${product.productCategory}</h3>
					<h3>productManufacturer:${product.productManufacturer}</h3>
					<h3>productPrice:${product.productPrice}</h3>
					<br>
				<c:set var="role" scope="page" value="${param.role}" />
				<c:set var="url" scope="page" value="/getProductList" />
				<c:if test="${role='admin'}">
					<c:set var="url" scope="page" value="/admin/productInventory" />
				</c:if>
					<p ng-controller="cartCtrl">
						<a href="<c:url value="${url}" />" class="btn btn-default">Back</a>
						<a href="#" class="btn btn-warning btn-large"
							ng-click="addToCart('${product.productId}')"><span
							class="glyphicon glyphicon-shopping-cart"></span>Order Now</a> 
							<a href="<spring:url value="/cart" />" class="btn btn-default"><span
							class="glyphicon glyphicon-hand-right"></span>View Cart</a>

					</p>

				</div>
				<br>

			</div>
		</div>
	</div>
</div>
        <script src="<c:url value="/resources/js/controller.js" /> "></script>
<%@include file="/WEB-INF/views/template/footer.jsp"%>