package dream_team.server_dream.state;

import org.json.JSONObject;

import dream_team.server_dream.district.District;

// this class holds the state archetype
public class State {
	private String name;
	private String partyLean;
	private long population;
	private District[] districts;
	//private County[] counties;
	private JSONObject geojsonFile;
	public State() {
		//no-args
	}
	public State(String name, String partyLean, long population, District[] districts, JSONObject geojsonFile) {
		this.name = name;
		this.partyLean = partyLean;
		this.population = population;
		this.districts = districts;
		this.geojsonFile = geojsonFile;
	}
	
	public JSONObject getGeojsonFile() {
		return geojsonFile;
	}
	public void setGeojsonFile(JSONObject geojsonFile) {
		this.geojsonFile = geojsonFile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPartyLean() {
		return partyLean;
	}
	public void setPartyLean(String partyLean) {
		this.partyLean = partyLean;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public District[] getDistricts() {
		return districts;
	}
	public void setDistricts(District[] districts) {
		this.districts = districts;
	}
	
}
