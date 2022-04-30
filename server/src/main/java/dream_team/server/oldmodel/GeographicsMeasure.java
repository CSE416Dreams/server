package dream_team.server.oldmodel;

public class GeographicsMeasure {
//Polsby-Popper
//	Schwartzberg value
//	Split counties
	private String id;
	private CompactnessMeasure cm;
	private int splitCounties;
	public GeographicsMeasure(String id, CompactnessMeasure cm, int splitCounties) {
		this.id = id;
		this.cm = cm;
		this.splitCounties = splitCounties;
	}
	/**
	 * @return the cm
	 */
	public CompactnessMeasure getCm() {
		return cm;
	}
	/**
	 * @param cm the cm to set
	 */
	public void setCm(CompactnessMeasure cm) {
		this.cm = cm;
	}
	/**
	 * @return the splitCounties
	 */
	public int getSplitCounties() {
		return splitCounties;
	}
	/**
	 * @param splitCounties the splitCounties to set
	 */
	public void setSplitCounties(int splitCounties) {
		this.splitCounties = splitCounties;
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
