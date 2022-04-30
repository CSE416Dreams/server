/**
 * 
 */
package dream_team.server.oldmodel;

/**
 * @author jmath
 *
 */
public class PopulationMeasure {
	private String id;
	private double equalPopulation;

	public PopulationMeasure(String id, double equalPopulation) {
		this.id = id;
		this.equalPopulation = equalPopulation;
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

	/**
	 * @return the equalPopulation
	 */
	public double getEqualPopulation() {
		return equalPopulation;
	}

	/**
	 * @param equalPopulation the equalPopulation to set
	 */
	public void setEqualPopulation(double equalPopulation) {
		this.equalPopulation = equalPopulation;
	}
	
	

}
