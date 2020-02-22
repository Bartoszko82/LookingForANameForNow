package pl.bartoszko.points.game;

public interface GameFacade {
	
	public void addNewGame(GameDTO gameDTO, GameTypeDTO gameTypeDTO);
	
	public GameDTO getGame();
	
	public void addNewGameType(GameTypeDTO gameType);
	
	public GameTypeDTO getGameType();

}
