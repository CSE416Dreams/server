package dream_team.server.resources;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dream_team.server.model.DistrictPlan;
import dream_team.server.oldservice.CompactnessMeasureService;
import dream_team.server.oldservice.DemographicsMeasureService;
import dream_team.server.oldservice.DistrictPlanSummaryService;
import dream_team.server.oldservice.GeographicsMeasureService;
import dream_team.server.oldservice.PopulationMeasureService;
import dream_team.server.oldservice.VotingMeasureService;
import dream_team.server.seawulf.BoxAndWhisker;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/plans")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class DataController {
//
//	@GET
//	@Path("/{boxAndWhisker}")
//	public Response getPlan(@PathParam("boxAndWhisker") String boxAndWhisker) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("seawulf_unit");
//		EntityManager em = emf.createEntityManager();
//		//BoxAndWhisker bw = (BoxAndWhisker)em.find(BoxAndWhisker.class, boxAndWhisker);
//
//		return Response.status(200).header("Access-Control-Allow-Origin", "*")
//				.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
//				.header("Access-Control-Allow-Credentials", "true")
//				.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
//				.header("Access-Control-Max-Age", "1209600").entity(bw).build();
//
//	}

}