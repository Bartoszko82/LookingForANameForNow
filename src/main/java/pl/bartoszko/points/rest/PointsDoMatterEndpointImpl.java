package pl.bartoszko.points.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.bartoszko.points.game.GameFacade;
import pl.bartoszko.points.game.GameTypeDTO;


@RestController
@RequestMapping("/")
public class PointsDoMatterEndpointImpl {
	
	@Autowired
	GameFacade gameFacade;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!";
	}

	@GetMapping("/gametypes") 
	public List<GameTypeDTO> getGameTypes() {
		return gameFacade.getGameTypes();
	}
}
