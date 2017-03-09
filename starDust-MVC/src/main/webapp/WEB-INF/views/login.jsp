<%@include file="/WEB-INF/views/template/header.jsp"%>

<script>
function test(){
/*var str="Hello world!"
document.write(str.match("world") + "<br />")
document.write(str.match("World") + "<br />")
document.write(str.match("worlld") + "<br />")
document.write(str.match("world!"))
*/

	var one = document.getElementById("one").value;
	var two = document.getElementById("two").value;
	
	document.getElementById("three").value = parseInt(one) + parseInt(two);
	

}
</script>

<div class="container-wrapper">
	<div class="container">
		<div id="login-box">

			<c:if test="${not empty msg}">
				<div class="msg">${msg}</div>
			</c:if>

			<form name="loginForm"
				action="<c:url value="/j_spring_security_check" />" method="post">

				<c:if test="${not empty error}">
					<div class="error" style="color: red">${error}</div>
				</c:if>
				<div class="form-group">
					<label for="username">User:</label> <input type="text" id="name"
						name="username" value="admin" class="form-control" /><label
						for="password">Password:</label> <input type="password"
						id="password" name="password" value="admin" class="form-control" />
				</div>
				<input type="submit" value="Submit" class="btn btn-default">

				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
			</form>

		</div>
	</div>
</div>


<div>

<input id="one" type="text" /> +
<input id="two" type="text" /> 
<input  type="button" onclick="test()" value="=" /> 

<input id="three" type="text" />


</div>


<%@include file="/WEB-INF/views/template/footer.jsp"%>