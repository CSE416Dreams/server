package dream_team.server.oldservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dream_team.server.database.DatabaseClass;
import dream_team.server.oldmodel.CompactnessMeasure;
import dream_team.server.oldmodel.DistrictPlanSummary;
import dream_team.server.oldmodel.GeographicsMeasure;
import dream_team.server.oldmodel.PopulationMeasure;
import dream_team.server.oldmodel.VotingMeasure;

public class VotingMeasureService {
	private Map<String, VotingMeasure> votemeasures = DatabaseClass.getVmeasures();
	
	public VotingMeasureService() {//double efficiencyGap, int[] estimatedVotingResults, double meanMedianDifference,
		//double lopsidedT, int opportunityDistrict
		votemeasures.put("mississippi-plan1", new VotingMeasure("mississippi-plan1-vote", 0.5, new int[] {8,7,6,2}, 0.5, 0.4, 3));
		votemeasures.put("mississippi-plan2",  new VotingMeasure("mississippi-plan2-vote", 0.5, new int[] {8,7,6,2}, 0.5, 0.4, 3));
		votemeasures.put("georgia-plan1",  new VotingMeasure("georgia-plan1-vote", 0.5, new int[] {8,7,6,2}, 0.5, 0.4, 3));
		votemeasures.put("georgia-plan2",  new VotingMeasure("georgia-plan2-vote", 0.5, new int[] {8,7,6,2}, 0.5, 0.4, 3));
		votemeasures.put("florida-plan1",  new VotingMeasure("florida-plan1-vote", 0.5, new int[] {8,7,6,2}, 0.5, 0.4, 3));
		votemeasures.put("florida-plan2",  new VotingMeasure("florida-plan2-vote", 0.5, new int[] {8,7,6,2}, 0.5, 0.4, 3));
		votemeasures.put("florida-plan3",  new VotingMeasure("florida-plan3-vote", 0.5, new int[] {8,7,6,2}, 0.5, 0.4, 3));
	}

	public VotingMeasure getvotemeasure(String votemeasureName) {
		return votemeasures.get(votemeasureName);
	}
	public List<VotingMeasure> getAllvotemesaures(){
		return new ArrayList<VotingMeasure>(votemeasures.values());
	}
	
	public VotingMeasure addVoteMeasure(VotingMeasure votemeasure) {
		votemeasures.put(votemeasure.getId(), votemeasure);
		return votemeasure;
	}
}
