package pl.bartoszko.points.game.entity;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("gameTypePropertyDAO")
@Transactional
public class GameTypePropertyDAOImpl extends AbstractDAO<GameTypeProperty> implements GameTypePropertyDAO{

	@Override
	public void saveGameTypeProperty(GameTypeProperty gameTypeProperty) {
		persist(gameTypeProperty);
	}

	@Override
	public List<GameTypeProperty> getGameTypeProperties() {
		return getClasses(GameTypeProperty.class);
	}

	@Override
	public GameTypeProperty getGameTypeProperty(int id) {
		return getClass(GameTypeProperty.class, id);
	}

	@Override
	public GameTypeProperty getGameTypeProperty(String gameTypePropertyName) {
	return null;
	}

}
