package testEntidades;

import java.util.List;
import dao.ClassUsuarioImp;
import model.TblUsuariocl3;

public class TestEntidadUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblUsuariocl3 usuario =  new TblUsuariocl3();
		ClassUsuarioImp crud = new ClassUsuarioImp();
		/*
		usuario.setUsuariocl3("Fabrizio");
		usuario.setPasswordcl3("123");
		crud.RegistrarUsuario(usuario);
		*/
		List<TblUsuariocl3> listado = crud.ListadoUsuario();
		for(TblUsuariocl3 lis:listado) {
			System.out.println("usuario: " + lis.getUsuariocl3() + ", password: " + lis.getPasswordcl3());
		}
	}

}
