<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Producto</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Registrar Producto</h1>
<div align="center">
    <a href="ControladorProducto?accion=Listar" style="text-decoration: none; color: blue;">Ver Listado de Productos</a>
</div>
<form action="ControladorProducto" method="post">
<table border="2" align="center">
<tr>
<td>Nombre</td>
<td><input type="text" name="nombre"></td>
</tr>
<tr>
<td>Precio Venta</td>
<td><input type="text" name="precioventa"></td>
</tr>
<tr>
<td>Precio Compra</td>
<td><input type="text" name="preciocompra"></td>
</tr>
<tr>
<td>Estado</td>
<td><input type="text" name="estado"></td>
</tr>
<tr>
<td>Descripcion</td>
<td><input type="text" name="descripcion"></td>
</tr>
<tr>
<td colspan="2"  align="center" >
<input type="submit" value="Registrar Producto">
</td>
</tr>
</table>
</form>
</body>
</html>