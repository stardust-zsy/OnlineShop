<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>
<!-- Marketing messaging and featurettes
    ================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>admin PAGE</h1>
		</div>

		<div>
			<c:if test="${pageContext.request.userPrincipal.name!=null}">
				<h2>
					Welcom:${pageContext.request.userPrincipal.name} | <a
						href="<c:url value= "/j_spring_security_logout"/>">logout</a>
				</h2>


			</c:if>
		</div>

		<a href="<c:url value="/admin/productInventory" />">product
			Inventory</a>
	</div>
</div>

<%@include file="/WEB-INF/views/template/footer.jsp"%>