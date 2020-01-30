package pl.bartoszko.points.game;

public interface GameTypeDAO {

	void saveGameType(GameType gameType);
	
	GameType getGameType(int id);

}
