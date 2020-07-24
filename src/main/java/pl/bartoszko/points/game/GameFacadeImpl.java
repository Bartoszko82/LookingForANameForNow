package pl.bartoszko.points.game;

import java.util.Date;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public void addNewGame(GameDTO gameDTO, GameTypeDTO gameTypeDTO) {
		Optional<Date> empty = Optional.empty();
		gameService.addNewGame(gameDTO.getName(), empty, convertToGameType(gameTypeDTO));
	}
	
	@Override
	public void addNewGame(GameDTO gameDTO, Date date, GameTypeDTO gameTypeDTO) {
		gameService.addNewGame(gameDTO.getName(), Optional.of(date), convertToGameType(gameTypeDTO));
	}

//No getGame method in gameService yet
//	@Override
//	public GameDTO getGame(int id) {
//		GameDTO gameDTO = convertToGameDTO(gameService.getGame(id));
//		return gameDTO;
//	}

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
