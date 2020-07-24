package pl.bartoszko.points.game;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GameTypeServiceTest {
	
	@InjectMocks
	GameTypeService gameTypeService;
	
	@Mock
	GameTypeDAO gameTypeDAO;
	
	List<GameTypeProperty> emptyGameTypeProperties;
	
	@Before
	public void createEmptyGameTypeProperties() {
		emptyGameTypeProperties = new ArrayList<>();
	}
	
	@Test
	public void newGameTypeTest() {
	GameType gameType = new GameType("basketball", emptyGameTypeProperties);  
		
	gameTypeService.addNewGameType(gameType);	
		
	verify(gameTypeDAO, times(1)).saveGameType(gameType);
	}
	
	@Test
	public void newGameTypeGivenNameAndPropsTest() {
	GameType gameType = new GameType("basketball", emptyGameTypeProperties);  
		
	gameTypeService.addNewGameType("basketball", emptyGameTypeProperties);	
		
	verify(gameTypeDAO, times(1)).saveGameType(gameType);
	}
	
	@Test
	public void newGameTypeGivenNameOnlyTest() {
	GameType gameType = new GameType("basketball", emptyGameTypeProperties);
		
	gameTypeService.addNewGameType("basketball");	
		
	verify(gameTypeDAO, times(1)).saveGameType(gameType);
	}
	
	
	@Ignore
//	@Test
	public void newGameTypeWithNullAndNullTest() {

	GameType gameType = new GameType("basketball", emptyGameTypeProperties); 
	
	gameTypeService.addNewGameType("basketball", null);	//TODO should I allow null here? If not, where I should check that?
		
	verify(gameTypeDAO, times(1)).saveGameType(gameType);
	}
	
	
}