package pl.bartoszko.points.rest;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import pl.bartoszko.points.game.GameDTO;
import pl.bartoszko.points.game.GameFacade;

@Profile("poc")
@Component("endpoint_poc")
public class PointsDoMatterEndpointPoc {

	@Autowired
	GameFacade gameFacade;

	ObjectMapper mapper = new ObjectMapper();

	public void newGame(File file) {
		
		try {
			GameDTO gameDTO = mapper.readValue(file, GameDTO.class);

			gameFacade.addNewGame(gameDTO, gameDTO.getGameType());

		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
