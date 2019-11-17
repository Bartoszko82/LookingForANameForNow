
package pl.bartoszko.points.game;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pl.bartoszko.points.util.AbstractDAO;

@Repository("gameTypeDAO")
@Transactional
public class GameTypeDAOImpl extends AbstractDAO<GameType> implements GameTypeDAO {

	@Override
	public void saveGameType(GameType gameType) {
		persist(gameType);
	}
	
}
