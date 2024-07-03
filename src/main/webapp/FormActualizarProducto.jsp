<%@page import="model.TblProductocl3"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Producto</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style>
    body {
        background-color: #c5dec9;
        padding-top: 20px; /* Espacio superior */
    }
</style>
</head>

<body>
    <div class="container">
        <h1 class="text-center">Actualizar Producto</h1>

        <form method="post" action="ControladorProducto">
            <% 
                String cod = (request.getAttribute("codigo") != null) ? request.getAttribute("codigo").toString() : "";
                String nom = (request.getAttribute("nombre") != null) ? request.getAttribute("nombre").toString() : "";
                String precioventa = (request.getAttribute("precioventa") != null) ? request.getAttribute("precioventa").toString() : "";
                String preciocompra = (request.getAttribute("preciocompra") != null) ? request.getAttribute("preciocompra").toString() : "";
                String estado = (request.getAttribute("estado") != null) ? request.getAttribute("estado").toString() : "";
                String descripcion = (request.getAttribute("descripcion") != null) ? request.getAttribute("descripcion").toString() : "";
            %>
            <input type="hidden" name="codigo" value="<%= cod %>">

            <div class="form-group row">
                <label for="nombre" class="col-sm-2 col-form-label">Nombre:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="nombre" name="nombre" value="<%= nom %>">
                </div>
            </div>
            <div class="form-group row">
                <label for="precioventa" class="col-sm-2 col-form-label">Precio Venta:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="precioventa" name="precioventa" value="<%= precioventa %>">
                </div>
            </div>
            <div class="form-group row">
                <label for="preciocompra" class="col-sm-2 col-form-label">Precio Compra:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="preciocompra" name="preciocompra" value="<%= preciocompra %>">
                </div>
            </div>
            <div class="form-group row">
                <label for="estado" class="col-sm-2 col-form-label">Estado:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="estado" name="estado" value="<%= estado %>">
                </div>
            </div>
            <div class="form-group row">
                <label for="descripcion" class="col-sm-2 col-form-label">Descripción:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="descripcion" name="descripcion" value="<%= descripcion %>">
                </div>
            </div>
            
            <div class="form-group row">
                <div class="col-sm-12 text-center">
                    <button type="submit" class="btn btn-primary">Actualizar Producto</button>
                </div>
            </div>
        </form>
    </div>

    <!-- Bootstrap JS y dependencias (jQuery) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

