package dream_team.server.oldservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dream_team.server.database.DatabaseClass;
import dream_team.server.oldmodel.CompactnessMeasure;
import dream_team.server.oldmodel.DistrictPlanSummary;
import dream_team.server.oldmodel.GeographicsMeasure;

public class GeographicsMeasureService {
	private Map<String, GeographicsMeasure> geomeasures = DatabaseClass.getGeomeasures();
	
	public GeographicsMeasureService() {
		geomeasures.put("mississippi-plan1", new GeographicsMeasure("mississippi-plan1-geo", new CompactnessMeasure(0.2,0.3), 3));
		geomeasures.put("mississippi-plan2",  new GeographicsMeasure("mississippi-plan2-geo", new CompactnessMeasure(0.2,0.3), 3));
		geomeasures.put("georgia-plan1",  new GeographicsMeasure("georgia-plan1-geo", new CompactnessMeasure(0.2,0.3), 3));
		geomeasures.put("georgia-plan2",  new GeographicsMeasure("georgia-plan2-geo", new CompactnessMeasure(0.2,0.3), 3));
		geomeasures.put("florida-plan1",  new GeographicsMeasure("florida-plan1-geo", new CompactnessMeasure(0.2,0.3), 3));
		geomeasures.put("florida-plan2",  new GeographicsMeasure("florida-plan2-geo", new CompactnessMeasure(0.2,0.3), 3));
		geomeasures.put("florida-plan3",  new GeographicsMeasure("florida-plan3-geo", new CompactnessMeasure(0.2,0.3), 3));
	}

	public GeographicsMeasure getgeomeasure(String geomeasureName) {
		return geomeasures.get(geomeasureName);
	}
	public List<GeographicsMeasure> getAllgeomesaures(){
		return new ArrayList<GeographicsMeasure>(geomeasures.values());
	}
	
	public GeographicsMeasure addCMeasure(GeographicsMeasure geomeasure) {
		geomeasures.put(geomeasure.getId(), geomeasure);
		return geomeasure;
	}
}
