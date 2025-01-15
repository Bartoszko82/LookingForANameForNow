package pl.bartoszko.points.game.entity;

import java.util.List;


public interface GameTypePropertyDAO {

	void saveGameTypeProperty(GameTypeProperty gameTypeProperty);
	
	List<GameTypeProperty> getGameTypeProperties();
	
	GameTypeProperty getGameTypeProperty(int id);
	
	GameTypeProperty getGameTypeProperty(String gameTypePropertyName);

	
}
