<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>
<!-- Marketing messaging and featurettes
    ================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>product Inventory</h1>
			<h4>this is the product Inventory page</h4>
		</div>
		<table class="table table-striped table-hover">
			<thead>
				<tr class="bg-success">
					<td>image</td>
					<th>ProductName</th>
					<th>ProductCategory</th>
					<th>ProductPrice</th>
					<th>ProductManufacturer</th>
					<th></th>

				</tr>
			</thead>
			<c:forEach items="${products}" var="product">
				<tr>
					<td><img
						src= "/pic/${product.productId}.png" 
						style="width: 120px; height: 80px;" /></td>
					<td>${product.productName}</td>
					<td>${product.productCategory}</td>
					<td>${product.productPrice}</td>
					<td>${product.productManufacturer}</td>
					<td><a
						href='<spring:url value="/getProductList/viewProduct/${product.productId}" />'>
							<span class="glyphicon glyphicon-info-sign"></span>
					</a> <a
						href='<spring:url value="/admin/productInventory/deleteProduct/${product.productId}" />'>
							<span class="glyphicon glyphicon-remove"></span>
					</a> <a
						href='<spring:url value="/admin/productInventory/editProduct/${product.productId}" />'>
							<span class="glyphicon glyphicon-pencil"></span>
					</a></td>

				</tr>
			</c:forEach>
		</table>
		<a href='<spring:url value="/admin/productInventory/addProduct" />'
			class="btn btn-primary">addProduct</a>
	</div>
</div>

<%@include file="/WEB-INF/views/template/footer.jsp"%>