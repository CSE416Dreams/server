package dream_team.server.oldservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dream_team.server.database.DatabaseClass;
import dream_team.server.oldmodel.CompactnessMeasure;
import dream_team.server.oldmodel.DistrictPlanSummary;

public class CompactnessMeasureService {
	private Map<String, CompactnessMeasure> cmeasures = DatabaseClass.getcmeasures();
	
	public CompactnessMeasureService() {
		cmeasures.put("mississippi-plan1", new CompactnessMeasure(null, 0.2, 0.3));
		cmeasures.put("mississippi-plan2", new CompactnessMeasure(null, 0.4, 0.3));
		cmeasures.put("georgia-plan1", new CompactnessMeasure(null, 0.3, 0.3));
		cmeasures.put("georgia-plan2", new CompactnessMeasure(null, 0.3, 0.4));
		cmeasures.put("florida-plan1", new CompactnessMeasure(null, 0.3, 0.5));
		cmeasures.put("florida-plan2", new CompactnessMeasure(null, 0.2, 0.3));
		cmeasures.put("florida-plan3", new CompactnessMeasure(null, 0.3, 0.4));
	}

	public CompactnessMeasure getcmeasure(String cmeasureName) {
		return cmeasures.get(cmeasureName);
	}
	public List<CompactnessMeasure> getAllcmesaures(){
		return new ArrayList<CompactnessMeasure>(cmeasures.values());
	}
	
	public CompactnessMeasure addCMeasure(CompactnessMeasure cmeasure) {
		cmeasures.put(cmeasure.getId(), cmeasure);
		return cmeasure;
	}
}
