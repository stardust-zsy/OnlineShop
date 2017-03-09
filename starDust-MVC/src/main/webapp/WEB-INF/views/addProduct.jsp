<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>
<!-- Marketing messaging and featurettes
    ================================================== -->
<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>addProduct page</h1>
			<p class="lead">This is addProduct page</p>
		</div>
		<form:form
			action="${pageContext.request.contextPath}/admin/productInventory/addProduct"
			method="post" commandName="product" enctype="multipart/form-data">
			<div class="form-group">
				<label for="name">name</label>
				<form:errors path="productName" cssStyle="color:red"></form:errors>
				<form:input path="productName" id="name" class="form-control" />
			</div>
			<div class="form-group">
				<label for="category">category</label> <label
					class="checkbox-inline"> <form:radiobutton
						path="productCategory" id="category" class="form-Control"
						value="guitar" />guitar
				</label> <label class="checkbox-inline"> <form:radiobutton
						path="productCategory" id="category" class="form-Control"
						value="piano" />piano
				</label>
			</div>
			<div class="form-group">
				<label for="description">description</label>
				<form:textarea path="productDescription" id="descrption"
					class="form-control" />
			</div>
			<div class="form-group">
				<label for="condition">condition</label> <label
					class="checkbox-inline"> <form:radiobutton
						path="productCondition" id="condition" class="form-Control"
						value="new" />new
				</label> <label class="checkbox-inline"> <form:radiobutton
						path="productCondition" id="condition" class="form-Control"
						value="used" />used
				</label>
			</div>
			<div class="form-group">
				<label for="price">price</label>
				<form:errors path="productPrice" cssStyle="color:red"></form:errors>
				<form:input path="productPrice" id="price" class="form-control" />
			</div>
			<div class="form-group">
				<label for="manufacturer">manufacturer</label>
				<form:input path="productManufacturer" id="manufacturer"
					class="form-control" />
			</div>

			<div class="form-group">
				<label class="control-label" for=productImage>Upload Picture</label>
				<form:input path="productImage" id="productImage" type="file"
					class="form:input-large" />
			</div>
			<input type="submit" value="submit" class="btn btn-default" />
			<a href="<c:url value="/admin/productInventory" />"
				class="btn btn-default">Cancel</a>
		</form:form>
	</div>
</div>
<%@include file="/WEB-INF/views/template/footer.jsp"%>