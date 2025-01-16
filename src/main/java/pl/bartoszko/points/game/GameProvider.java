package pl.bartoszko.points.game;

import java.util.List;

import org.springframework.stereotype.Component;

import pl.bartoszko.points.game.dto.GameDTO;
import pl.bartoszko.points.game.dto.GameTypeDTO;

@Component("GameProvider")
public interface GameProvider {
	
	public List<GameDTO> getGames(); 
	
	public GameDTO getGame(int id);
	
	public List<GameTypeDTO> getGameTypes();
	
	public GameTypeDTO getGameType(int id);

}
