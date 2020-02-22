package pl.bartoszko.points.game;

import java.util.List;

public class GameTypeDTO {
	
	private int id;
	
	private String typeName;
	
	private List<GameTypePropertyDTO> gameTypeProperties;
	
	private List<GameDTO> games;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public List<GameTypePropertyDTO> getGameTypeProperties() {
		return gameTypeProperties;
	}

	public void setGameTypeProperties(List<GameTypePropertyDTO> gameTypeProperties) {
		this.gameTypeProperties = gameTypeProperties;
	}

	public List<GameDTO> getGames() {
		return games;
	}

	public void setGames(List<GameDTO> games) {
		this.games = games;
	}
	
}
