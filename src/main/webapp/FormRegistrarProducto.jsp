<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Producto</title>
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
    <h1 class="text-center">Registrar Producto</h1>

    <div class="text-center mb-3">
        <a href="ControladorProducto?accion=Listar" class="btn btn-primary">Ver Listado de Productos</a>
    </div>

    <form action="ControladorProducto" method="post">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="form-group">
                    <label for="nombre">Nombre</label>
                    <input type="text" class="form-control" id="nombre" name="nombre" required>
                </div>
                <div class="form-group">
                    <label for="precioventa">Precio Venta</label>
                    <input type="text" class="form-control" id="precioventa" name="precioventa" required>
                </div>
                <div class="form-group">
                    <label for="preciocompra">Precio Compra</label>
                    <input type="text" class="form-control" id="preciocompra" name="preciocompra" required>
                </div>
                <div class="form-group">
                    <label for="estado">Estado</label>
                    <input type="text" class="form-control" id="estado" name="estado" required>
                </div>
                <div class="form-group">
                    <label for="descripcion">Descripción</label>
                    <input type="text" class="form-control" id="descripcion" name="descripcion" required>
                </div>
                <div class="text-center">
                    <button type="submit" class="btn btn-success">Registrar Producto</button>
                </div>
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
