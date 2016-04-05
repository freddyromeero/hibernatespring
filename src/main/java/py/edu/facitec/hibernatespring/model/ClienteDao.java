package py.edu.facitec.hibernatespring.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
//para gestionar los datos
@Repository
public class ClienteDao {
	
	@PersistenceContext
	private EntityManager manager;

	public void save(Cliente cliente) {
		//para insertar un dato en la bd
		manager.persist(cliente); 
	}
	

}
