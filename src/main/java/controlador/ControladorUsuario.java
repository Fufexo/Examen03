package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClassUsuarioImp;
import model.TblUsuariocl3;

/**
 * Servlet implementation class ControladorUsuario
 */
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        ClassUsuarioImp crud = new ClassUsuarioImp();
        List<TblUsuariocl3> listadousuarios = crud.ListadoUsuario();

        boolean credencial = false;

        for(TblUsuariocl3 user:listadousuarios){
            if (user.getUsuariocl3().equals(usuario) && user.getPasswordcl3().equals(password)) {
              credencial = true;
              break;
          } 
        }

        if (credencial == true) {
            response.sendRedirect("FormRegistrarProducto.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
	}

}
