<%@page import="model.TblProductocl3"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Productos</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	background-color: #f8f9fa;
	padding-top: 20px;
}

.container {
	margin-top: 50px;
}
</style>
</head>
<body>
	<div class="container">
		<h1 class="text-center">Listado de Productos Registrados en la BD</h1>

		<div class="text-center mb-3">
			<a href="FormRegistrarProducto.jsp" class="btn btn-primary">Registrar
				Producto</a>
		</div>

		<table class="table table-bordered table-striped">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Nombre</th>
					<th scope="col">Precio Venta</th>
					<th scope="col">Precio Compra</th>
					<th scope="col">Estado</th>
					<th scope="col">Descripción</th>
					<th scope="col" colspan="2" class="text-center">Acciones</th>
				</tr>
			</thead>


			<%
			List<TblProductocl3> listadoproducto = (List<TblProductocl3>) request.getAttribute("listadodeproductos");
			if (listadoproducto != null) {
				for (TblProductocl3 lis : listadoproducto) {
			%>
			<tr>
				<td><%=lis.getIdproductocl3()%></td>
				<td><%=lis.getNombrecl3()%></td>
				<td><%=lis.getPrecioventacl3()%></td>
				<td><%=lis.getPreciocompcl3()%></td>
				<td><%=lis.getEstadocl3()%></td>
				<td><%=lis.getDescripcl3()%></td>
				<td><a
					href="ControladorProducto?accion=Eliminar&cod=<%=lis.getIdproductocl3()%>"
					class="btn btn-danger btn-sm">Eliminar</a></td>
				<td><a
					href="ControladorProducto?accion=Modificar&cod=<%=lis.getIdproductocl3()%>"
					class="btn btn-primary btn-sm">Actualizar</a></td>
			</tr>

			<%
			}
			%>
			<%
			}
			%>
		</table>
	</div>
	<!-- Bootstrap JS and dependencies (jQuery) -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@1.16.1/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>