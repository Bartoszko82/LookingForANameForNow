package pl.bartoszko.points.game;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import pl.bartoszko.points.util.AbstractDAO;

public class GameDAOImpl extends AbstractDAO<Game> implements GameDAO{

	@Override
	public void saveGame(Game game) {
		persist(game);
	}
}
