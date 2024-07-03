package testEntidades;

import java.util.List;
import dao.ClassProductoImp;
import model.TblProductocl3;

public class TestEntidadProducto {

	public static void main(String[] args) {
		
		TblProductocl3 producto = new TblProductocl3();
		ClassProductoImp crud = new ClassProductoImp();
		/*
		producto.setNombrecl3("Arroz Costeño");
		producto.setPrecioventacl3(5.5);
		producto.setPreciocompcl3(3.5);
		producto.setEstadocl3("Nuevo");
		producto.setDescripcl3("Arroz costeño por kilo");
		
		crud.RegistrarProducto(producto);
		*/
		List<TblProductocl3> listado = crud.ListadoProducto();
		for(TblProductocl3 lis:listado) {
			
			System.out.println("nombre: " + lis.getNombrecl3()+ " precioventa: " + lis.getPrecioventacl3() +
					" preciocompra: " + lis.getPreciocompcl3() + " estado: " + lis.getEstadocl3() + " descripcion: " + lis.getDescripcl3());
		
		}
	}
}
