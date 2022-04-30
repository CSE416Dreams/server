package dream_team.server.resources;


import dream_team.server.model.District;
import dream_team.server.model.DistrictPlan;
import dream_team.server.model.State;
import dream_team.server.service.StateService;
import jakarta.servlet.http.HttpServlet;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.PrintWriter;

import javax.persistence.*;  
@Path("/states")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class StateController /* extends HttpServlet */  { 
	private static final long serialVersionUID = 1L;
   
	@GET
	@Path("/{stateName}")
	public Response getState(@PathParam("stateName") String stateName) {
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("state_unit");  
	    EntityManager em = emf.createEntityManager();  

	    State selectedState = (State)em.find(State.class, stateName);
		return Response
	            .status(200)
	            .header("Access-Control-Allow-Origin", "*")
	            .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
	            .header("Access-Control-Allow-Credentials", "true")
	            .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
	            .header("Access-Control-Max-Age", "1209600")
	            .entity(selectedState)
	            .build();

	}
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
//        // TODO Auto-generated method stub
//        HttpSession session=request.getSession();  
//        String uname = (String) session.getAttribute("user_name");          
//         
//    }

}  