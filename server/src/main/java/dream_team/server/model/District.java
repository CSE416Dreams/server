package dream_team.server.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import dream_team.server.model.PoliticalParty;

@Entity
@Table (name = "Districts")
public class District {
	
	@Id
	@Column(name = "DistrictKey")
	private String districtID;
	@Column(name = "DistrictNum")
	private Integer districtNum;
	@ManyToOne(targetEntity = DistrictPlan.class)
	@JoinColumn(name = "PlanName")
	private DistrictPlan planName;
	@Column(name = "Area")
	private Long area;
	@Column(name = "Perimeter")
	private Long perimeter;
	@Column(name = "Incrumbent")
	private String incumbent;
	@Column(name = "Population")
	private Integer population;
	@Column(name = "VoteRep")
	private Integer voteRep;
	@Column(name = "VoteDem")
	private Integer voteDem;
	
	@OneToOne
    @JoinColumn(name = "demographicsID", referencedColumnName = "demographicsID")
	private Demographics demographics;

	@Transient
	private boolean isMMD;
	@Transient
	private double polsbyPopperValue;
	@Transient
	private double schwartzbergValue;
	@Transient
	private boolean isSafeDistrict;
	@Transient
	private List<County> counties;
	@Transient
	private int[] voteSplit;
	
	public District() {
	}
	
	public Integer getDistrictNum() {
		return districtNum;
	}

	public String getDistrictID() {
		return districtID;
	}

	public Long getArea() {
		return area;
	}

	public Long getPerimeter() {
		return perimeter;
	}


	public String getIncumbent() {
		return incumbent;
	}

	public Integer getPopulation() {
		return population;
	}

	public Integer getVoteRep() {
		return voteRep;
	}

	public Integer getVoteDem() {
		return voteDem;
	}


	public Demographics getDemographics() {
		return demographics;
	}

	public boolean isMMD() {
		this.isMMD = isMajorityMinorityDistrict();
		return isMMD;
	}


	public double getPolsbyPopperValue() {
		this.polsbyPopperValue = calculatePolsbyPopperValue();
		return polsbyPopperValue;
	}

	public double getSchwartzbergValue() {
		this.schwartzbergValue = calculateSchwartzbergValue();
		return schwartzbergValue;
	}

	public List<County> getCounties() {
		return counties;
	}

	public Boolean getIsSafeDistrict() {
		isSafeDistrict = isSafeDistrict();
		return isSafeDistrict;
	}

	public int[] getVoteSplit() {
		return voteSplit;
	}

	public Double calculatePolsbyPopperValue() {
        return (4*Math.PI * ((double)area/((double)perimeter * (double)perimeter)));
    }

    public Double calculateSchwartzbergValue() {
        double temp = Math.sqrt((area / Math.PI));
        return (1/((perimeter)/(2*Math.PI * temp)));
    }

    public Boolean opportunityDistrict() {
        double wasted = voteSplit[PoliticalParty.REPUBLICAN.ordinal()] - voteSplit[PoliticalParty.DEMOCRATIC.ordinal()];
        wasted = wasted/(voteSplit[PoliticalParty.REPUBLICAN.ordinal()] + voteSplit[PoliticalParty.DEMOCRATIC.ordinal()]);
        if(wasted < 0.5) {
            return true;
        }
        return false;
    }
	 public Boolean isMajorityMinorityDistrict() {
	        int minorities = population - demographics.getWhitePopulation();
	        if(minorities > demographics.getWhitePopulation()) {
	            return true;
	        }
	        return false;
	    }
	 
	 public Boolean isSafeDistrict() {
		 double totalVote = voteRep+voteDem;
		 double diff = Math.abs(voteRep-voteDem);
		 double threshold = .10;
		 return (diff/totalVote)<=threshold;
		 
	 }
	
}
