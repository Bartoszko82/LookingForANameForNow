package pl.bartoszko.points.game;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import pl.bartoszko.points.game.dto.GameDTO;
import pl.bartoszko.points.game.dto.GameTypeDTO;
import pl.bartoszko.points.game.entity.Game;
import pl.bartoszko.points.game.service.GameService;
import pl.bartoszko.points.game.service.GameTypeService;

@Slf4j
@Component("GameProvider")
public class GameProviderImpl implements GameProvider {

	@Autowired
	private GameService gameService;

	@Autowired
	private GameTypeService gameTypeService;

	@Override
	public List<GameDTO> getGames() {
		List<Game> games = gameService.getGames();
		return games.stream().map(GameConverter::toGameDTO).collect(Collectors.toList());
	}

	@Override
	public GameDTO getGame(int id) {

		Game game = gameService.getGame(id);
		GameDTO gameDTO = GameConverter.toGameDTO(game);
		return gameDTO;
	}

	@Override
	public GameTypeDTO getGameType(int gameTypeId) {
		GameTypeDTO gameTypeDTO = new GameTypeDTO();
		return gameTypeDTO;
	}

	@Override
	public List<GameTypeDTO> getGameTypes() {
		return Collections.emptyList();
	}

}
