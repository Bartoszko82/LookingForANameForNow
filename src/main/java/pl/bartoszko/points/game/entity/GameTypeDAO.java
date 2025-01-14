package pl.bartoszko.points.game.entity;

import java.util.List;

public interface GameTypeDAO {

	void saveGameType(GameType gameType);
	
	List<GameType> getGameTypes();
	
	GameType getGameType(int id);
	
	GameType getGameType(String gameTypeName);

}
