package dream_team.server.model;

@jakarta.xml.bind.annotation.XmlRootElement
public class StateMap {
	private String state;
	private String geoJSONMap;
	
	public StateMap() {
		
	}
	
	public StateMap(String state, String geoJSONMap) {
		this.state = state;
		this.geoJSONMap = geoJSONMap;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getGeoJSONMap() {
		return geoJSONMap;
	}

	public void setGeoJSONMap(String geoJSONMap) {
		this.geoJSONMap = geoJSONMap;
	}
	
	
}
