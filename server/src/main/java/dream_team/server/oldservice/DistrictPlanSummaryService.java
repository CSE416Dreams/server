package dream_team.server.oldservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dream_team.server.database.DatabaseClass;
import dream_team.server.model.SelectedState;
import dream_team.server.model.Status;
import dream_team.server.oldmodel.DistrictPlanSummary;

import java.nio.file.Path;
import java.nio.file.Paths;

public class DistrictPlanSummaryService {
	
	private Map<String, DistrictPlanSummary> plans = DatabaseClass.getPlanSummaries();
	
	public DistrictPlanSummaryService() {
//		plans.put("plan-r-mississippi", new DistrictPlanSummary("Republican Proposed Plan", "Republican", "2/5/2021", "Mississippi","On Jan. 24, Gov. Tate Reeves signed Mississippi’s new congressional map into law a few weeks after it passed the legislature along party lines. The map largely leaves the status quo in place: Although the map moves some turf from the 3rd District into the 2nd District in order to account for population changes, its partisan breakdown is the same as the current map: three white-majority, solidly Republican districts and one Black-majority, solidly Democratic district (the 2nd District).", "Enacted"));
		plans.put("mississippi-plan1", new DistrictPlanSummary(SelectedState.MISSISSIPPI, "republican", "2/5/2021",  Status.PROPOSED,
				1,  0.5,  0.53, new int[]{32, 25},  Paths.get("/maps/mississippi-2")));
		plans.put("mississippi-plan2", new DistrictPlanSummary(SelectedState.MISSISSIPPI, "democratic", "4/11/2021",  Status.IN_LITIGATION,
				1,  0.5,  0.53, new int[]{32, 25}, Paths.get("/maps/mississippi-2")));
		plans.put("georgia-plan1", new DistrictPlanSummary(SelectedState.GEORGIA, "republican", "2/5/2021",  Status.PROPOSED,
				1,  0.5,  0.53, new int[]{32, 25},  Paths.get("/maps/mississippi-2")));
		plans.put("georgia-plan2", new DistrictPlanSummary(SelectedState.GEORGIA, "democratic", "4/11/2021",  Status.IN_LITIGATION,
				1,  0.5,  0.53, new int[]{32, 25}, Paths.get("/maps/mississippi-2")));
		plans.put("florida-plan1", new DistrictPlanSummary(SelectedState.FLORIDA, "H000C8019", "2/5/2021",  Status.PROPOSED,
				1,  0.5,  0.53, new int[]{32, 25},  Paths.get("/maps/mississippi-2")));
		plans.put("florida-plan2", new DistrictPlanSummary(SelectedState.FLORIDA, "P000C0094", "4/11/2021",  Status.REJECTED,
				1,  0.5,  0.53, new int[]{32, 25}, Paths.get("/maps/mississippi-2")));
		plans.put("florida-plan2", new DistrictPlanSummary(SelectedState.FLORIDA, "S019C8052", "4/11/2021",  Status.REJECTED,
				1,  0.5,  0.53, new int[]{32, 25}, Paths.get("/maps/mississippi-2")));

//		plans.put("plan-r-georgia", new DistrictPlanSummary("Republican Proposed Plan", "Republican", "12/30/2020", "Georgia","The new map has five districts in which white voters are a minority of the voting-age population, unchanged from the current lines despite the fact that much of Georgia's population growth since 2010 has been driven by people of color. As a result, multiple federal lawsuits claim the map dilutes the political power of Black voters, in violation of the Voting Rights Act and/or the U.S. Constitution. However, the delay in making the maps official meant the lawsuits were filed too close to the May 24 primary, and on Feb. 28 a judge cited that fact in allowing the maps to stand, at least for the 2022 election.", "Proposed"));
//		plans.put("plan-d-georgia", new DistrictPlanSummary("Democratic Proposed Plan", "Democratic", "12/30/2020", "Georgia", "The new map has five districts in which white voters are a minority of the voting-age population, unchanged from the current lines despite the fact that much of Georgia's population growth since 2010 has been driven by people of color. As a result, multiple federal lawsuits claim the map dilutes the political power of Black voters, in violation of the Voting Rights Act and/or the U.S. Constitution. However, the delay in making the maps official meant the lawsuits were filed too close to the May 24 primary, and on Feb. 28 a judge cited that fact in allowing the maps to stand, at least for the 2022 election.", "Proposed"));
	}
	public DistrictPlanSummary getPlanSummary(String planName) {
		return plans.get(planName);
	}
	public List<DistrictPlanSummary> getAllPlanSummaries(){
		return new ArrayList<DistrictPlanSummary>(plans.values());
	}
	
	public DistrictPlanSummary addPlan(DistrictPlanSummary plan) {
		plans.put(plan.getId(), plan);
		return plan;
	}
	
//	public Message updateMessage (Message message) {
//		if (message.getId() <= 0) {
//			return null;
//		}
//		messages.put(message.getId(), message);
//		return message;
//	}
//	
//	public Message removeMessage(long id) {
//		return messages.remove(id);
//	}
}