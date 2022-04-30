package dream_team.server.oldmodel;

import java.util.List;

public class PoliticalFairnessMeasure {
	private String id;
	private List<String[]> seatsToVote;
	private List<String[]> efficiencyGap;
	private List<String[]> t_test;
	private List<String[]> meanMedianDifference;
	public PoliticalFairnessMeasure(String id, List<String[]> seatsToVote, List<String[]> efficiencyGap,
			List<String[]> t_test, List<String[]> meanMedianDifference) {
		this.id = id;
		this.seatsToVote = seatsToVote;
		this.efficiencyGap = efficiencyGap;
		this.t_test = t_test;
		this.meanMedianDifference = meanMedianDifference;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<String[]> getSeatsToVote() {
		return seatsToVote;
	}
	public void setSeatsToVote(List<String[]> seatsToVote) {
		this.seatsToVote = seatsToVote;
	}
	public List<String[]> getEfficiencyGap() {
		return efficiencyGap;
	}
	public void setEfficiencyGap(List<String[]> efficiencyGap) {
		this.efficiencyGap = efficiencyGap;
	}
	public List<String[]> getT_test() {
		return t_test;
	}
	public void setT_test(List<String[]> t_test) {
		this.t_test = t_test;
	}
	public List<String[]> getMeanMedianDifference() {
		return meanMedianDifference;
	}
	public void setMeanMedianDifference(List<String[]> meanMedianDifference) {
		this.meanMedianDifference = meanMedianDifference;
	}
	
	
}
