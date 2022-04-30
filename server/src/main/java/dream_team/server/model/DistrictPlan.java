package dream_team.server.model;

import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.json.JSONObject;

import jakarta.json.bind.annotation.JsonbTransient;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
@Table (name = "DistrictPlans")
public class DistrictPlan {
	
	@Id
	@Column(name = "PlanName")
	private String planName;
	@ManyToOne(targetEntity = State.class,fetch = FetchType.LAZY, 
			cascade = CascadeType.ALL)
	@JoinColumn(name = "StateID")
	private State state;
	@Column(name = "Status")
	private String planStatus;
	@Column(name = "Date")
	private String planDate;
	@Column(name = "Proposed")
	private String proposedBy;
	@Column(name = "SplitCountyNum")
	private Integer numSplitCounties;
	@Column(name = "SplitID")
	private String splitID;

	@OneToMany(mappedBy = "planName", 
 		   cascade = CascadeType.PERSIST) 
    private List<District> districts;


	@Transient
	private String[] planSummary;
	@Transient
	private double eqPopMeasure;
	@Transient
	private double efficiencyGap;
	@Transient
	private double meanMedianDifference;
	@Transient
	private double lopSidedWinsTest;
	@Transient
	private JSONObject seatsToVoteCurve;
	@Transient
    private int numOfMajorityMinorityDistricts;
	@Transient
	private double avgPolsbyPopperValue;
	

	public DistrictPlan() {
		
	}
	public String getPlanName() {
		return planName;
	}
	public String getStatus() {
		return planStatus;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public String getPlanDate() {
		return planDate;
	}
	public String getProposedBy() {
		return proposedBy;
	}
	public Integer getNumSplitCounties() {
		return numSplitCounties;
	}
	public String getSplitID() {
		return splitID;
	}
	public List<District> getDistricts() {
		return districts;
	}
	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}
	 public String[] getPlanSummary() {
		return planSummary;
	}
	public void setPlanSummary(String[] planSummary) {
		this.planSummary = planSummary;
	}
	public int getNumOfMajorityMinorityDistricts() {
		this.numOfMajorityMinorityDistricts = calculateTotalMajorityMinorityDistricts();
		return numOfMajorityMinorityDistricts;
	}
	public double getEqPopMeasure() {
		this.eqPopMeasure = calculateEqualPopulationMeasure();
		return eqPopMeasure;
	}
	public double getEfficiencyGap() {
		this.efficiencyGap = calculateEfficiencyGap();
		return efficiencyGap;
	}
	public double getMeanMedianDifference() {
		this.meanMedianDifference = calculateMeanMedianDifference() ;
		return meanMedianDifference;
	}
	public JSONObject getSeatsToVoteCurve() {
		return seatsToVoteCurve;
	}
	public void setSeatsToVoteCurve(JSONObject seatsToVoteCurve) {
		this.seatsToVoteCurve = seatsToVoteCurve;
	}
	public double getAvgPolsbyPopperValue() {
		this.avgPolsbyPopperValue = calculateAvgPolsbyPopperValue();
		return avgPolsbyPopperValue;
	}
	
	public Integer calculateTotalMajorityMinorityDistricts() {
			int numOfMMDs = 0;
	        for(District temp : districts) {
	            if(isMajorityMinorityDistrict(temp.getPopulation(), 
	            		temp.getDemographics().getWhitePopulation()) == true) {
	            	numOfMMDs++;
	            }
	        }
	        return numOfMMDs;
	    }
	 public Boolean isMajorityMinorityDistrict(int totalPopulation, int white) {
	        int minorities = totalPopulation - white;
	        if(minorities > white) {
	            return true;
	        }
	        return false;
	    }
	 public Double calculateEqualPopulationMeasure() {
		 	double totalSum = 0;
	        for(District temp : districts) {
	            totalSum += temp.getPopulation();
	        }
	        double mean = totalSum/(double)districts.size();
	        double sqDiff = 0.0;
	        for(District temp : districts) {
	            sqDiff += Math.pow((temp.getPopulation() - mean),2);
	        }
	        return sqDiff/(double)districts.size();
	    }
	 public Double calculateAvgPolsbyPopperValue() {
		 double sum = 0.0;
		 for(District temp: districts) {
			 sum += temp.getPolsbyPopperValue();
		 }
		 return sum/districts.size();
	 }
	 public Double calculateEfficiencyGap() {
//	        int wasted = 0;
//	        int total = 0;
//	        for (District temp : districts) {
//	            wasted += (temp.getVoteRep() - temp.getVoteDem());
//	            total += temp.getVoteRep();
//	            total += temp.getVoteDem();
//	        }
//	        double efficiencygap = (double)wasted / (double)total;
//	        return efficiencygap;
		 return 1.2;
	    }
	 public Double calculateMeanMedianDifference() {
//	        double[] votes = new double[districts.size()];
//	        for(int x = 0; x < districts.size(); x++) {
//	            double temp = (double)(districts.get(x).getVoteRep() - districts.get(x).getVoteDem())
//	            		/(districts.get(x).getVoteRep() + districts.get(x).getVoteDem());
//	            votes[x] = temp;
//	        }
//	        Arrays.sort(votes);
//	        double median = 0;
//	        if(votes.length % 2 != 0)
//	            median = (double) votes[votes.length/2];
//	        else
//	            median = (double) (votes[(votes.length - 1)/2] + votes[votes.length / 2] / 2.0);
//	        double mean = 0;
//	        for(int x = 0; x < votes.length; x++) {
//	            mean += votes[x];
//	        }
//	        mean = mean / votes.length;
//	        return mean - median;
		 return 1.3;
	    }
}
