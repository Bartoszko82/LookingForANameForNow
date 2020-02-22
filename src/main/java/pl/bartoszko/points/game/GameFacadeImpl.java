package pl.bartoszko.points.game;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("gameFacade")
public class GameFacadeImpl implements GameFacade {

	@Autowired
	private GameService gameService;
	
	@Autowired 
	private GameTypeService gameTypeService;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public void addNewGame(GameDTO gameDTO, GameTypeDTO gameTypeDTO) {
		gameService.addNewGame(gameDTO.getName(), Optional.empty(), convertToGameType(gameTypeDTO));
	}

	@Override
	public GameDTO getGame() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNewGameType(GameTypeDTO gameTypeDTO) {
		gameTypeService.addNewGameType(convertToGameType(gameTypeDTO));
	}

	@Override
	public GameTypeDTO getGameType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Game convertToGame(GameDTO gameDTO) {
		Game game = modelMapper.map(gameDTO, Game.class);
		return game;
	}

	private GameDTO convertToGameDTO(Game game) {
		GameDTO gameDTO = modelMapper.map(game, GameDTO.class);
		return gameDTO;
	}
	
	
	private GameType convertToGameType(GameTypeDTO gameTypeDTO) {
		GameType gameType = modelMapper.map(gameTypeDTO, GameType.class);
		return gameType;
	}

	private GameTypeDTO convertToGameTypeDTO(GameType gameType) {
		GameTypeDTO gameTypeDTO = modelMapper.map(gameType, GameTypeDTO.class);
		return gameTypeDTO;
	}
}
