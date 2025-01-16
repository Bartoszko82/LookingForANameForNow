package pl.bartoszko.points.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.bartoszko.points.game.GameCreator;
import pl.bartoszko.points.game.GameProvider;
import pl.bartoszko.points.game.dto.GameDTO;
import pl.bartoszko.points.game.dto.GameTypeDTO;


@RestController
@RequestMapping("/")
public class PointsDoMatterGame {
	
	@Autowired
	GameCreator gameCreator;
	
	@Autowired
	GameProvider gameProvider;
	
	@GetMapping("/getGames") 
	public List<GameDTO> getGames() {
		return gameProvider.getGames();
	}
	
	@GetMapping("/game/{gameId}") 
	public GameDTO getGame(@PathVariable int gameId) {
		return gameProvider.getGame(gameId);
	}
	
	@GetMapping("/gameType/{gameTypeId}") 
	public GameTypeDTO getGameType(@PathVariable int gameTypeId) {
		return gameProvider.getGameType(gameTypeId);
	}

}
