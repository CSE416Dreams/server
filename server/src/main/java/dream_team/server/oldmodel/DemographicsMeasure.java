package dream_team.server.oldmodel;

import java.util.List;

public class DemographicsMeasure {
	private String id;
	private double[] splitDemographics;
	private double racialFairness;
	
	public DemographicsMeasure(String id, double[] splitDemographics, double racialFairness) {
		this.id = id;
		this.splitDemographics = splitDemographics;
		this.racialFairness = racialFairness;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double[] getSplitDemographics() {
		return splitDemographics;
	}
	public void setSplitDemographics(double[] splitDemographics) {
		this.splitDemographics = splitDemographics;
	}
	public double getRacialFairness() {
		return racialFairness;
	}
	public void setRacialFairness(double racialFairness) {
		this.racialFairness = racialFairness;
	}
	
	
	
}
