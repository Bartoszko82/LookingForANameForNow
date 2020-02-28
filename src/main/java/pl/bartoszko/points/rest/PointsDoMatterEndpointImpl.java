package pl.bartoszko.points.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;

import pl.bartoszko.points.game.GameFacade;


@Endpoint
public class PointsDoMatterEndpointImpl {
	
	
	@Autowired
	GameFacade gameFacade;
	
	


}
