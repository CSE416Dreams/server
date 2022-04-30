package dream_team.server.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table (name = "States")
public class State {
	@Id
	@Column (name = "stateID")
	private String id;
	@Column (name = "stateName")
	private String name;
    @OneToMany(mappedBy = "state", 
    		   cascade = CascadeType.PERSIST)
	private List<DistrictPlan> dps; 
    //need to add stateSeawulf here
	
	@Transient
	private String[] planNames;
	public State(String name, String id, long population, List<DistrictPlan>dps, String[] planNames) {
		this.name = name;
		this.id = id;
		this.dps = dps;
		this.planNames = planNames;
	}
	public State() {}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<DistrictPlan> getDps() {
		return dps;
	}

	public void setDps(List<DistrictPlan> dps) {
		this.dps = dps;
	}

	public String[] getPlanNames() {
		return planNames;
	}

	public void setPlanNames(String[] planNames) {
		this.planNames = planNames;
	}
	
}
