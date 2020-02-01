package pl.bartoszko.points.game;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("gameTypeService")
public class GameTypeService {

	@Autowired
	GameTypeDAO gameTypeDAO;

	public void addNewGameType(GameType gameType) {
		gameTypeDAO.saveGameType(gameType);
	}

	public void addNewGameType(String gameTypeName, List<GameTypeProperty> gameTypeProperties) {
		GameType gameType = new GameType(gameTypeName, gameTypeProperties);
		gameTypeDAO.saveGameType(gameType);
	}
	
	public void addNewGameType(String gameTypeName) {
		List<GameTypeProperty> gameTypeProperties = new ArrayList<>(); 
		GameType gameType = new GameType(gameTypeName, gameTypeProperties);
		gameTypeDAO.saveGameType(gameType);
	}

	public GameType getGameType(int id) {
		return gameTypeDAO.getGameType(id);
	}

	public GameType getGameType(String gameTypeName) {
		return gameTypeDAO.getGameType(gameTypeName);
	}
}
