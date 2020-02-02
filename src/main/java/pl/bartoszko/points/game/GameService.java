package pl.bartoszko.points.game;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("gameService")
public class GameService {

	@Autowired
	GameDAO gameDAO;
	
	@Autowired
	GameTypeService gameTypeService;

	public void addNewGame(String name, Optional<Date> maybeDate, GameType gameType) {
		Date date = new Date();
		if (maybeDate.isPresent()) {
			date = maybeDate.get();
		} else {
			date.setTime(System.currentTimeMillis());
		}
		
		// TODO use GameTypeService to get GameType. 
		// if no GameType found - create new.		
		
		// TODO - check for name-date key added in DB - should it be here as well?
		Game game = new Game(name,date,gameType);
		gameDAO.saveGame(game);
	}
	
	public void addNewGame(String name, Optional<Date> maybeDate, String gameTypeName) {
		Date date = new Date();
		if (maybeDate.isPresent()) {
			date = maybeDate.get();
		} else {
			date.setTime(System.currentTimeMillis());
		}
		
		GameType gameType = gameTypeService.getGameType(gameTypeName);		
		
		// TODO - check for name-date key added in DB - should it be here as well?
		Game game = new Game(name,date,gameType);
		gameDAO.saveGame(game);
	}
}
