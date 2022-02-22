package dream_team.server_dream.district;

public class District {
	private String districtNumber;
	private String districtName;
	private long population;
	public District() {
		//no-args
	}
	public District(String districtNumber, String districtName, long population) {
		this.districtNumber = districtNumber;
		this.districtName = districtName;
		this.population = population;
	}
	public String getDistrictNumber() {
		return districtNumber;
	}
	public void setDistrictNumber(String districtNumber) {
		this.districtNumber = districtNumber;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	
	
	
}
