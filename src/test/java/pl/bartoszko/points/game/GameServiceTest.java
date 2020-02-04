package pl.bartoszko.points.game;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class GameServiceTest {

	@InjectMocks
	GameService gameService;
	
	@Mock
	GameDAO gameDAO;
	
	@Mock
	GameTypeService gameTypeService;
	
	@Test
	public void newGameShouldBeCreated() {
		// given
		Game game = createGame("test", "football");
		
		//when
		when(gameTypeService.getGameType("football")).thenReturn(createGameType("football"));
		gameService.addNewGame("test", Optional.of(getDate()), "football");
		
		//then
		verify(gameDAO, times(1)).saveGame(game);
	}
	
	private static Date getDate() {
		Date date = new Date();
		date.setTime(1569439370);
		return date;
	}

	private static GameType createGameType(String gameTypeName) {
		List<GameTypeProperty> gameTypeProperties = new ArrayList<>();
		GameType gameType = new GameType("football", gameTypeProperties);
		return gameType;
	}
	
	private static Game createGame() {
		List<GameTypeProperty> gameTypeProperties = new ArrayList<>();
		GameType gameType = new GameType("football", gameTypeProperties);
		Game game = new Game("testGame", getDate(), gameType);
		return game;
	}
	
	private static Game createGame(String gameName, String gameTypeName) {
		List<GameTypeProperty> gameTypeProperties = new ArrayList<>();
		GameType gameType = new GameType(gameTypeName, gameTypeProperties);
		Game game = new Game(gameName, getDate(), createGameType(gameTypeName));
		return game;
	}
}
