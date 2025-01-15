package pl.bartoszko.points.game.entity;

public interface GameDAO {
	
    public void saveGame(Game game);
    
    Game getGame(int id);

}
