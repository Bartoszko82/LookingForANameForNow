package pl.bartoszko.points.util;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDAO<T> {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void persist(T entity) {
		getSession().persist(entity);
	}
	
	public T getClass(Class<T> classT, int id) {
		return (T) getSession().get(classT, id);
	}
	
	public List<T> getClasses(Class<T> classT) { //TODO not preyty, 
		CriteriaBuilder cb = getSession().getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(classT);
		Root<T> rootEntry = cq.from(classT);
		CriteriaQuery<T> all = cq.select(rootEntry);
		TypedQuery<T> allQuery = getSession().createQuery(all);
		return allQuery.getResultList();
	}
}
