package pl.bartoszko.points.game;

import org.springframework.stereotype.Repository;

@Repository("gameDAO")
public interface GameDAO {
	
    public void saveGame(Game game);
}
