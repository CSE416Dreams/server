package dream_team.server.oldmodel;

import java.nio.file.Path;
import java.nio.file.Paths;

import dream_team.server.model.SelectedState;
import dream_team.server.model.Status;


//The summary will include data for each of the districtings including identifier, number of majority-minority
//districts, equal population measure, Polsby-Popper value, Republican/Democratic split, and
//other implemented measure values.
public class DistrictPlanSummary {
	private String id;
	private SelectedState state;
	private String proposedBy;
	private String dateEnacted;
	private Status status;
	private int numMMDistricts;
	private double eqPopulation;
	private double polsbyPopper;
	private int[] repdemSplit;
	private Path geoJSONDistrictMap;
	static int count = 0;

	//other measures?
	public DistrictPlanSummary(SelectedState state, String proposedBy, String dateEnacted, Status status,
			int numMMDistricts, double eqPopulation, double polsbyPopper, int[] repdemSplit, Path geoJSONDistrictMap) {
		this.id = state.name()+(count++);
		this.state = state;
		this.proposedBy = proposedBy;
		this.dateEnacted = dateEnacted;
		this.status = status;
		this.numMMDistricts = numMMDistricts;
		this.eqPopulation = eqPopulation;
		this.polsbyPopper = polsbyPopper;
		this.repdemSplit = repdemSplit;
		this.geoJSONDistrictMap = geoJSONDistrictMap;
	}
	/**
	 * @return the state
	 */
	public SelectedState getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(SelectedState state) {
		this.state = state;
	}
	/**
	 * @return the proposedBy
	 */
	public String getProposedBy() {
		return proposedBy;
	}
	/**
	 * @param proposedBy the proposedBy to set
	 */
	public void setProposedBy(String proposedBy) {
		this.proposedBy = proposedBy;
	}
	/**
	 * @return the dateEnacted
	 */
	public String getDateEnacted() {
		return dateEnacted;
	}
	/**
	 * @param dateEnacted the dateEnacted to set
	 */
	public void setDateEnacted(String dateEnacted) {
		this.dateEnacted = dateEnacted;
	}
	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}
	/**
	 * @return the numMMDistricts
	 */
	public int getNumMMDistricts() {
		return numMMDistricts;
	}
	/**
	 * @param numMMDistricts the numMMDistricts to set
	 */
	public void setNumMMDistricts(int numMMDistricts) {
		this.numMMDistricts = numMMDistricts;
	}
	/**
	 * @return the eqPopulation
	 */
	public double getEqPopulation() {
		return eqPopulation;
	}
	/**
	 * @param eqPopulation the eqPopulation to set
	 */
	public void setEqPopulation(double eqPopulation) {
		this.eqPopulation = eqPopulation;
	}
	/**
	 * @return the polsbyPopper
	 */
	public double getPolsbyPopper() {
		return polsbyPopper;
	}
	/**
	 * @param polsbyPopper the polsbyPopper to set
	 */
	public void setPolsbyPopper(double polsbyPopper) {
		this.polsbyPopper = polsbyPopper;
	}
	/**
	 * @return the repdemSplit
	 */
	public int[] getRepdemSplit() {
		return repdemSplit;
	}
	/**
	 * @param repdemSplit the repdemSplit to set
	 */
	public void setRepdemSplit(int[] repdemSplit) {
		this.repdemSplit = repdemSplit;
	}
	
	public Path getGeoJSONDistrictMap() {
		return geoJSONDistrictMap;
	}
	public void setGeoJSONDistrictMap(Path geoJSONDistrictMap) {
		this.geoJSONDistrictMap = geoJSONDistrictMap;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
}
