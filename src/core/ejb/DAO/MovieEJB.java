package core.ejb.DAO;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import core.entity.Movies;

@Stateless
@Local
public class MovieEJB {

/*	@PersistenceContext
	private EntityManager entityManager;
	*/
	
	//@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void saveMovies(Movies movies) {
		//entityManager.persist(movies);
		//entityManager.flush();
		System.out.println(movies.getTitle());
	}
}
