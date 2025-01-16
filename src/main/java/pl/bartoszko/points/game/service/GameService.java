package pl.bartoszko.points.game.service;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.bartoszko.points.game.entity.Game;
import pl.bartoszko.points.game.entity.GameDAO;
import pl.bartoszko.points.game.entity.GameType;

@Service("gameService")
public class GameService {

	@Autowired
	GameDAO gameDAO;

	public void addNewGame(String name, Optional<Date> maybeDate, GameType gameType) {
		Date date = new Date();
		if (maybeDate.isPresent()) {
			date = maybeDate.get();
		} else {
			date.setTime(System.currentTimeMillis());
		} 
		Game game = new Game(name, date, gameType);
		gameDAO.saveGame(game);
	}
	
	public List<Game> getGames() {
		return Collections.emptyList();
	}
	
	public Game getGame(int gameId) {
		return gameDAO.getGame(gameId);
	}
}
