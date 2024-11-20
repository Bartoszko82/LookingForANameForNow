package pl.bartoszko.points.game;

import lombok.experimental.UtilityClass;
import pl.bartoszko.points.game.dto.GameDTO;
import pl.bartoszko.points.game.dto.GameTypeDTO;
import pl.bartoszko.points.game.entity.Game;
import pl.bartoszko.points.game.entity.GameType;

@UtilityClass
public class GameConverter {

	public static GameDTO toGameDTO (Game game) {

		GameDTO gameDTO = new GameDTO();
		gameDTO.setName(game.getName());
		gameDTO.setGameState(game.getGameState());
        GameTypeDTO gameTypeDTO = toGameTypeDTO(game.getGameType());
		gameDTO.setGameType(gameTypeDTO);
		
		return gameDTO;
	}
	public static GameTypeDTO toGameTypeDTO (GameType gameType) {
        GameTypeDTO gameTypeDTO = new GameTypeDTO();
        gameTypeDTO.setId(gameType.getId());
		gameTypeDTO.setTypeName(gameType.getTypeName());
		return gameTypeDTO;
	}
	
}
