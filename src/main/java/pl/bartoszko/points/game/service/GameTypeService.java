package pl.bartoszko.points.game.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.bartoszko.points.game.entity.GameType;
import pl.bartoszko.points.game.entity.GameTypeDAO;
import pl.bartoszko.points.game.entity.GameTypeProperty;

@Service("gameTypeService")
public class GameTypeService {

	@Autowired
	GameTypeDAO gameTypeDAO;
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	public void addNewGameType(GameType gameType) {
		logger.debug(">> addNewGameType(), params: {}", gameType);
		gameTypeDAO.saveGameType(gameType);
		logger.trace("saved: {}", gameType);
		logger.debug("<< addNewGameType()");
	}

	public void addNewGameType(String gameTypeName, List<GameTypeProperty> gameTypeProperties) {
		logger.debug(">> addNewGameType(), params: {}, {}", gameTypeName, gameTypeProperties);
		GameType gameType = new GameType(gameTypeName, gameTypeProperties);
		logger.trace("creted: {}", gameType);
		gameTypeDAO.saveGameType(gameType);
		logger.trace("saved: {}", gameType);
		logger.debug("<< addNewGameType()");
	}
	
	public void addNewGameType(String gameTypeName) {
		List<GameTypeProperty> gameTypeProperties = new ArrayList<>(); 
		GameType gameType = new GameType(gameTypeName, gameTypeProperties);
		gameTypeDAO.saveGameType(gameType);
	}

	public List<GameType> getGameTypes() {
		return gameTypeDAO.getGameTypes();
	}
	
	public GameType getGameType(int id) {
		return gameTypeDAO.getGameType(id);
	}

	public GameType getGameType(String gameTypeName) {
		return gameTypeDAO.getGameType(gameTypeName);
	}
}
