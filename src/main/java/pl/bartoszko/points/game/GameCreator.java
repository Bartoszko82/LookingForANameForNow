package pl.bartoszko.points.game;

import java.util.Date;

import pl.bartoszko.points.game.dto.GameDTO;
import pl.bartoszko.points.game.dto.GameTypeDTO;

public interface GameCreator {

	public void addNewGame(GameDTO gameDTO, GameTypeDTO gameTypeDTO);
	
	public void addNewGame(GameDTO gameDTO, Date date, GameTypeDTO gameTypeDTO);
	
	public void addNewGameType(GameTypeDTO gameType);

}
