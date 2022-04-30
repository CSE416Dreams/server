package dream_team.server.oldservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dream_team.server.database.DatabaseClass;
import dream_team.server.oldmodel.DemographicsMeasure;
import dream_team.server.oldmodel.DistrictPlanSummary;

public class DemographicsMeasureService {
	private Map<String, DemographicsMeasure> dmeasures = DatabaseClass.getdmeasures();
	
	public DemographicsMeasureService() {
		dmeasures.put("mississippi-plan1", new DemographicsMeasure("mississippi-plan1-demo", new double[] {0.6,0.2,0.2,0.1}, 0.3));
		dmeasures.put("mississippi-plan2", new DemographicsMeasure("mississippi-plan2-demo", new double[] {0.2,0.4,0.2,0.1}, 0.3));
		dmeasures.put("georgia-plan1", new DemographicsMeasure("georgia-plan1-demo",new double[] {0.2,0.4,0.2,0.1}, 0.3));
		dmeasures.put("georgia-plan2", new DemographicsMeasure("georgia-plan2-demo",new double[] {0.2,0.4,0.2,0.1}, 0.3));
		dmeasures.put("florida-plan1", new DemographicsMeasure("florida-plan1-demo",new double[] {0.2,0.4,0.2,0.1}, 0.3));
		dmeasures.put("florida-plan2", new DemographicsMeasure("florida-plan2-demo",new double[] {0.2,0.4,0.2,0.1}, 0.3));
		dmeasures.put("florida-plan3", new DemographicsMeasure("florida-plan3-demo",new double[] {0.2,0.4,0.2,0.1}, 0.3));
	}

	public DemographicsMeasure getdmeasure(String dmeasureName) {
		return dmeasures.get(dmeasureName);
	}
	public List<DemographicsMeasure> getAlldmesaures(){
		return new ArrayList<DemographicsMeasure>(dmeasures.values());
	}
	
	public DemographicsMeasure addDMeasure(DemographicsMeasure dmeasure) {
		dmeasures.put(dmeasure.getId(), dmeasure);
		return dmeasure;
	}
}
