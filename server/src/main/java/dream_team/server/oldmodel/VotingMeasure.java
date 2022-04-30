package dream_team.server.oldmodel;

import java.util.List;

public class VotingMeasure {
//	Efficiency gap
//	Estimated voting results
//	Mean-median difference
//	Lopsided wins test
//	Opportunity districts
	private String id;
	private double efficiencyGap;
	private int[] estimatedVotingResults;
	private double meanMedianDifference;
	private double lopsidedT;
	private int opportunityDistrict;
	public VotingMeasure(String id, double efficiencyGap, int[] estimatedVotingResults, double meanMedianDifference,
			double lopsidedT, int opportunityDistrict) {
		this.id = id;
		this.efficiencyGap = efficiencyGap;
		this.estimatedVotingResults = estimatedVotingResults;
		this.meanMedianDifference = meanMedianDifference;
		this.lopsidedT = lopsidedT;
		this.opportunityDistrict = opportunityDistrict;
	}
	/**
	 * @return the efficiencyGap
	 */
	public double getEfficiencyGap() {
		return efficiencyGap;
	}
	/**
	 * @param efficiencyGap the efficiencyGap to set
	 */
	public void setEfficiencyGap(double efficiencyGap) {
		this.efficiencyGap = efficiencyGap;
	}
	/**
	 * @return the estimatedVotingResults
	 */
	public int[] getEstimatedVotingResults() {
		return estimatedVotingResults;
	}
	/**
	 * @param estimatedVotingResults the estimatedVotingResults to set
	 */
	public void setEstimatedVotingResults(int[] estimatedVotingResults) {
		this.estimatedVotingResults = estimatedVotingResults;
	}
	/**
	 * @return the meanMedianDifference
	 */
	public double getMeanMedianDifference() {
		return meanMedianDifference;
	}
	/**
	 * @param meanMedianDifference the meanMedianDifference to set
	 */
	public void setMeanMedianDifference(double meanMedianDifference) {
		this.meanMedianDifference = meanMedianDifference;
	}
	/**
	 * @return the lopsidedT
	 */
	public double getLopsidedT() {
		return lopsidedT;
	}
	/**
	 * @param lopsidedT the lopsidedT to set
	 */
	public void setLopsidedT(double lopsidedT) {
		this.lopsidedT = lopsidedT;
	}
	/**
	 * @return the opportunityDistrict
	 */
	public int isOpportunityDistrict() {
		return opportunityDistrict;
	}
	/**
	 * @param opportunityDistrict the opportunityDistrict to set
	 */
	public void setOpportunityDistrict(int opportunityDistrict) {
		this.opportunityDistrict = opportunityDistrict;
	}
	public String getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
	
	
}
