package dream_team.server.oldservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dream_team.server.database.DatabaseClass;
import dream_team.server.oldmodel.CompactnessMeasure;
import dream_team.server.oldmodel.DistrictPlanSummary;
import dream_team.server.oldmodel.GeographicsMeasure;
import dream_team.server.oldmodel.PopulationMeasure;

public class PopulationMeasureService {
	private Map<String, PopulationMeasure> popmeasures = DatabaseClass.getPopmeasures();
	
	public PopulationMeasureService() {
		popmeasures.put("mississippi-plan1", new PopulationMeasure("mississippi-plan1-pop", 0.5));
		popmeasures.put("mississippi-plan2",  new PopulationMeasure("mississippi-plan2-pop", 0.3));
		popmeasures.put("georgia-plan1",  new PopulationMeasure("georgia-plan1-pop", 0.4));
		popmeasures.put("georgia-plan2",  new PopulationMeasure("georgia-plan2-pop", 0.1));
		popmeasures.put("florida-plan1",  new PopulationMeasure("florida-plan1-pop", 0.1));
		popmeasures.put("florida-plan2",  new PopulationMeasure("florida-plan2-pop", 0.2));
		popmeasures.put("florida-plan3",  new PopulationMeasure("florida-plan3-pop", 0.3));
	}

	public PopulationMeasure getpopmeasure(String popmeasureName) {
		return popmeasures.get(popmeasureName);
	}
	public List<PopulationMeasure> getAllpopmesaures(){
		return new ArrayList<PopulationMeasure>(popmeasures.values());
	}
	
	public PopulationMeasure addPopMeasure(PopulationMeasure popmeasure) {
		popmeasures.put(popmeasure.getId(), popmeasure);
		return popmeasure;
	}
}
