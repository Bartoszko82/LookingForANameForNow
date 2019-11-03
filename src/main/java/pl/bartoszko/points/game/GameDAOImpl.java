package pl.bartoszko.points.game;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pl.bartoszko.points.util.AbstractDAO;

@Repository
@Transactional
public class GameDAOImpl extends AbstractDAO<Game> implements GameDAO{

	@Override
	public void saveGame(Game game) {
		persist(game);
	}
}
