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
	@ManyToOne(targetEntity = DistrictPlan.class,fetch = FetchType.LAZY, 
			cascade = CascadeType.ALL)
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
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "demographicsID", referencedColumnName = "demographicsID")
	private Demographics demographics;

	@Transient
	private boolean isMMD;
	@Transient
	private double polsbyPopperValue;
	@Transient
	private double schwartzbergValue;
	
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

	public void setDistrictID(String districtID) {
		this.districtID = districtID;
	}

	public Long getArea() {
		return area;
	}

	public void setArea(Long area) {
		this.area = area;
	}

	public Long getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(Long perimeter) {
		this.perimeter = perimeter;
	}

	public String getIncumbent() {
		return incumbent;
	}

	public void setIncumbent(String incumbent) {
		this.incumbent = incumbent;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public Integer getVoteRep() {
		return voteRep;
	}

	public void setVoteRep(Integer voteRep) {
		this.voteRep = voteRep;
	}

	public Integer getVoteDem() {
		return voteDem;
	}

	public void setVoteDem(Integer voteDem) {
		this.voteDem = voteDem;
	}

	public Demographics getDemographics() {
		return demographics;
	}

	public void setDemographics(Demographics demographics) {
		this.demographics = demographics;
	}

	public boolean isMMD() {
		return isMMD;
	}

	public void setMMD(boolean isMMD) {
		this.isMMD = isMMD;
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

	public void setCounties(List<County> counties) {
		this.counties = counties;
	}

	public int[] getVoteSplit() {
		return voteSplit;
	}

	public void setVoteSplit(int[] voteSplit) {
		this.voteSplit = voteSplit;
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
	
}
