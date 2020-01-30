package pl.bartoszko.points.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import pl.bartoszko.points.game.GameType;

public abstract class AbstractDAO<T> {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void persist(T entity) {
		getSession().persist(entity);
	}

	public GameType getGameType(int id) {
		return getSession().get(GameType.class, id);
	}
	
	public T getClass(Class<T> classT, int id) {
		return (T) getSession().get(classT, id);
	}
}
