<%@page import="model.TblProductocl3"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Producto</title>
</head>

<body bgcolor="#c5dec9">
    <h1 align="center">Actualizar Producto</h1>

    <form method="post" action="ControladorProducto">
        <% 
            String cod = (request.getAttribute("codigo") != null) ? request.getAttribute("codigo").toString() : "";
            String nom = (request.getAttribute("nombre") != null) ? request.getAttribute("nombre").toString() : "";
            String precioventa = (request.getAttribute("precioventa") != null) ? request.getAttribute("precioventa").toString() : "";
            String preciocompra = (request.getAttribute("preciocompra") != null) ? request.getAttribute("preciocompra").toString() : "";
            String estado = (request.getAttribute("estado") != null) ? request.getAttribute("estado").toString() : "";
            String descripcion = (request.getAttribute("descripcion") != null) ? request.getAttribute("descripcion").toString() : "";
        %>
        <table align="center">
            <tr>
                <td><input type="hidden" name="codigo" value="<%= cod %>" /></td>
            </tr>
            <tr>
                <td>Nombre:</td>
                <td><input type="text" name="nombre" value="<%= nom %>" /></td>
            </tr>
            <tr>
                <td>Precio Venta:</td>
                <td><input type="text" name="precioventa" value="<%= precioventa %>" /></td>
            </tr>
            <tr>
                <td>Precio Compra:</td>
                <td><input type="text" name="preciocompra" value="<%= preciocompra %>" /></td>
            </tr>
            <tr>
                <td>Estado:</td>
                <td><input type="text" name="estado" value="<%= estado %>" /></td>
            </tr>
            <tr>
                <td>Descripcion:</td>
                <td><input type="text" name="descripcion" value="<%= descripcion %>" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Actualizar Producto" />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
