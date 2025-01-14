package pl.bartoszko.points.game;

import java.util.Date;

import org.springframework.stereotype.Component;

import pl.bartoszko.points.game.dto.GameDTO;
import pl.bartoszko.points.game.dto.GameTypeDTO;

@Component("GameCreator")
public class GameCreatorImpl implements GameCreator {

	@Override
	public void addNewGame(GameDTO gameDTO, GameTypeDTO gameTypeDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewGame(GameDTO gameDTO, Date date, GameTypeDTO gameTypeDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewGameType(GameTypeDTO gameType) {
		// TODO Auto-generated method stub
		
	}

}
