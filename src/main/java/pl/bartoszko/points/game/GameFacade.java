package pl.bartoszko.points.game;

import java.util.Date;

public interface GameFacade {
	
	public void addNewGame(GameDTO gameDTO, GameTypeDTO gameTypeDTO);
	
	public void addNewGame(GameDTO gameDTO, Date date, GameTypeDTO gameTypeDTO);
	
//	No getGame method in gameService yet
//	public GameDTO getGame(int id);
	
	public void addNewGameType(GameTypeDTO gameType);
	
	public GameTypeDTO getGameType();

}
