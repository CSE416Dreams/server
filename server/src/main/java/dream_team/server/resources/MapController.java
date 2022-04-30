package dream_team.server.resources;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dream_team.server.model.StateMap;
import dream_team.server.service.MapService;
import dream_team.server.service.StateGeoJSONService;
import jakarta.ws.rs.Consumes;
//import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
//import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
//import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/maps")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class MapController {
	MapService mapService = new MapService();
	StateGeoJSONService stateGeoService = new StateGeoJSONService();
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("seawulf_unit");
	EntityManager em = emf.createEntityManager();
	
	@GET
	@Path("/{mapName}")
	public Response getMap(@PathParam("mapName") String mapName) {
		return Response
	            .status(200)
	            .header("Access-Control-Allow-Origin", "*")
	            .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
	            .header("Access-Control-Allow-Credentials", "true")
	            .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
	            .header("Access-Control-Max-Age", "1209600")
	            .entity(stateGeoService.getgeoJSONMap(mapName))
	            .build();
		
	}
	
	@POST
	public StateMap addMap(StateMap map) {
		return mapService.addMap(map);
	}
	
}
