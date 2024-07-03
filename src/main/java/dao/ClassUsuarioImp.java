package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IUsuario;
import model.TblUsuariocl3;

public class ClassUsuarioImp implements IUsuario{

	@Override
	public void RegistrarUsuario(TblUsuariocl3 usuario) {
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL3_FOURNIERFABRIZIO");
        EntityManager em=fabr.createEntityManager();
        em.getTransaction().begin();
        em.persist(usuario);
        System.out.println("Usuario registrado en la BD correctamente");
        em.getTransaction().commit();
        em.close();
	}

	@Override
	public void ActualizarUsuario(TblUsuariocl3 usuario) {
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL3_FOURNIERFABRIZIO");
		EntityManager em = fabr.createEntityManager();
		em.getTransaction().begin();
		em.merge(usuario);
		System.out.println("Usuario actualizado en la base de datos");
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public void EliminarUsuario(TblUsuariocl3 usuario) {
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL3_FOURNIERFABRIZIO");
		EntityManager em = fabr.createEntityManager();
		em.getTransaction().begin();
		TblUsuariocl3 elim = em.merge(usuario);
		em.remove(elim);
		System.out.println("Usuario eliminado de la base de datos");
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public TblUsuariocl3 BuscarUsuario(TblUsuariocl3 usuario) {
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL3_FOURNIERFABRIZIO");
		EntityManager em = fabr.createEntityManager();
		em.getTransaction().begin();
		TblUsuariocl3 bususu = em.find(TblUsuariocl3.class, usuario.getIdusuariocl3());
		em.getTransaction().commit();
		em.close();
		return bususu;
	}

	@Override
	public List<TblUsuariocl3> ListadoUsuario() {
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL3_FOURNIERFABRIZIO");
		EntityManager em=fabr.createEntityManager();
		em.getTransaction().begin();
		List<TblUsuariocl3> listadousuarios=em.createQuery("SELECT u FROM TblUsuariocl3 u",TblUsuariocl3.class).getResultList();
		em.getTransaction().commit();
		em.close();
		return listadousuarios;
	}

}
