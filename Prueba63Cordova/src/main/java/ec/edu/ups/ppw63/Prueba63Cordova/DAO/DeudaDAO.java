package ec.edu.ups.ppw63.Prueba63Cordova.DAO;

import ec.edu.ups.ppw63.Prueba63Cordova.model.Deuda;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class DeudaDAO {
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Deuda deuda) {
		em.persist(deuda);
	}
	
	public void update(Deuda deuda) {
		em.merge(deuda);
	}
	
	public void remove(int codigo) {
		Deuda deuda = em.find(Deuda.class, codigo);
		em.refresh(deuda);
	}
	
	public Deuda read(int codigo) {
		Deuda deuda = em.find(Deuda.class, codigo);
		return deuda;
	}
}
