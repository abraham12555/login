<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
<title>SpringMVC Starter Application</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href='http://fonts.googleapis.com/css?family=Raleway:400,200'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/static/resources/css/login.css"/>" />



</head>

<body>

	<div class="container">
		<div class="row login_box">
			<div class="col-md-12 col-xs-12" align="center">
				<div class="line">
					<h3>12 : 30 AM</h3>
				</div>
				<div class="outter">
					<img src="http://lorempixel.com/output/people-q-c-100-100-1.jpg"
						class="image-circle" />
				</div>
				<h1>Bienvenido</h1>

			</div>


			<form
				action="${pageContext.request.contextPath}/j_spring_security_check"
				method="post">
				<div class="col-md-12 col-xs-12 login_control">

					<div class="control">
						<div class="label">Nombre de usuario o Correo</div>
						<input type="text" name="username" class="form-control" value="abraham"
							placeholder="Ejemplo: abraham1255@gmail.com" />
					</div>

					<div class="control">
						<div class="label">Contraseña</div>
						<input type="password" name="password" value="123" class="form-control"
							value="" />
					</div>
					<div align="center">
						<button class="btn btn-orange">Ingresar</button>
					</div>

					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />

				</div>
				<c:if test="${not empty error}">
					<div class="alert alert-danger">
						<strong>Algo salió mal,</strong> ${error}
					</div>
				</c:if>

				<c:if test="${not empty msg}">
					<div class="alert alert-success">
						<strong>Felicidades!</strong>${msg}</div>
				</c:if>
			</form>




		</div>

	</div>
</body>
</html>
