package pl.bartoszko.points.game;

public interface GameDAO {
	
    public void saveGame(Game game);
    
    Game getGame(int id);

}
