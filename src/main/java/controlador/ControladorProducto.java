package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import dao.ClassProductoImp;
import model.TblProductocl3;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		TblProductocl3 producto = new TblProductocl3();
		ClassProductoImp crud = new ClassProductoImp();
		List<TblProductocl3> listadoproducto= crud.ListadoProducto();
		request.setAttribute("listadodeproductos", listadoproducto);
		
		String accion = request.getParameter("accion");
		if (accion != null) {
			switch (accion) {
			case "Modificar":
				int codigo = Integer.parseInt(request.getParameter("cod"));
				producto.setIdproductocl3(codigo);
				TblProductocl3 buscarprod = crud.BuscarProducto(producto);
				request.setAttribute("codigo", buscarprod.getIdproductocl3());
				request.setAttribute("nombre", buscarprod.getNombrecl3());
				request.setAttribute("precioventa", buscarprod.getPrecioventacl3());
				request.setAttribute("preciocompra", buscarprod.getPreciocompcl3());
				request.setAttribute("estado", buscarprod.getEstadocl3());
				request.setAttribute("descripcion", buscarprod.getDescripcl3());
				request.getRequestDispatcher("/FormActualizarProducto.jsp").forward(request, response);
				break;
			case "Eliminar":
				int codeliminar = Integer.parseInt(request.getParameter("cod"));
				producto.setIdproductocl3(codeliminar);
				crud.EliminarProducto(producto);;
				listadoproducto = crud.ListadoProducto();
				request.setAttribute("listadodeproductos", listadoproducto);
				request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
				break;
			case "Listar":
				listadoproducto = crud.ListadoProducto();
				request.setAttribute("listadodeproductos", listadoproducto);
				request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
				break;
			} 
	} else {
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
	}
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String codigo = request.getParameter("codigo");
		String nombre = request.getParameter("nombre");
		double precioventa = Double.parseDouble(request.getParameter("precioventa"));
		double preciocompra = Double.parseDouble(request.getParameter("preciocompra"));
		String estado = request.getParameter("estado");
		String descripcion = request.getParameter("descripcion");
		
		TblProductocl3 producto = new TblProductocl3();
		ClassProductoImp crud = new ClassProductoImp();
		producto.setNombrecl3(nombre);
		producto.setPrecioventacl3(precioventa);
		producto.setPreciocompcl3(preciocompra);
		producto.setEstadocl3(estado);
		producto.setDescripcl3(descripcion);

		if (codigo != null && !codigo.isEmpty()) {
			int cod = Integer.parseInt(codigo);
			producto.setIdproductocl3(cod);
			crud.ActualizarProducto(producto);
		} else {
			crud.RegistrarProducto(producto);
		}

		List<TblProductocl3> listadoproducto = crud.ListadoProducto();
		request.setAttribute("listadodeproductos", listadoproducto);
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
		
	}

}
