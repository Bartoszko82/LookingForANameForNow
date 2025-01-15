package pl.bartoszko.points.game.dto;

import java.util.Date;
import java.util.List;

import pl.bartoszko.points.game.GameState;
import pl.bartoszko.points.user.TeamDTO;

public class GameDTO {
	
	private int id;

	private String name;

	private Date date;

	private GameState gameState;
	
	private GameTypeDTO gameType;
	
	private List<TeamDTO> teams;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public GameState getGameState() {
		return gameState;
	}

	public void setGameState(GameState gameState) {
		this.gameState = gameState;
	}

	public GameTypeDTO getGameType() {
		return gameType;
	}

	public void setGameType(GameTypeDTO gameType) {
		this.gameType = gameType;
	}

	public List<TeamDTO> getTeams() {
		return teams;
	}

	public void setTeams(List<TeamDTO> teams) {
		this.teams = teams;
	}

}
