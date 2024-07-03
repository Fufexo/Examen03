package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IProducto;
import model.TblProductocl3;

public class ClassProductoImp implements IProducto{

	@Override
	public void RegistrarProducto(TblProductocl3 producto) {
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL3_FOURNIERFABRIZIO");
        EntityManager em=fabr.createEntityManager();
        em.getTransaction().begin();
        em.persist(producto);
        System.out.println("Producto registrado en la BD correctamente");
        em.getTransaction().commit();
        em.close();
		
	}

	@Override
	public void ActualizarProducto(TblProductocl3 producto) {
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL3_FOURNIERFABRIZIO");
		EntityManager em = fabr.createEntityManager();
		em.getTransaction().begin();
		em.merge(producto);
		System.out.println("Producto actualizado en la base de datos");
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public void EliminarProducto(TblProductocl3 producto) {
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL3_FOURNIERFABRIZIO");
		EntityManager em = fabr.createEntityManager();
		em.getTransaction().begin();
		TblProductocl3 elim = em.merge(producto);
		em.remove(elim);
		System.out.println("Producto eliminado de la base de datos");
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public TblProductocl3 BuscarProducto(TblProductocl3 producto) {
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL3_FOURNIERFABRIZIO");
		EntityManager em = fabr.createEntityManager();
		em.getTransaction().begin();
		TblProductocl3 buspro = em.find(TblProductocl3.class, producto.getIdproductocl3());
		em.getTransaction().commit();
		em.close();
		return buspro;
	}

	@Override
	public List<TblProductocl3> ListadoProducto() {
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL3_FOURNIERFABRIZIO");
		EntityManager em=fabr.createEntityManager();
		em.getTransaction().begin();
		List<TblProductocl3> listadoproductos=em.createQuery("select p from TblProductocl3 p",TblProductocl3.class).getResultList();
		em.getTransaction().commit();
		em.close();
		return listadoproductos;
	}

}
