package dream_team.server.model;

import javax.persistence.*;

@Entity
@Table
public class Demographics {
	
	@Column(name = "demographicsID")
	@Id
	private String id;
	
	@Column(name = "White")
	private Integer whitePopulation;
	
	@Column(name = "Black")
	private Integer blackPopulation;
	
	@Column(name = "Asian")
	private Integer asianPopulation;
	
	@Column(name = "AmericanIndianandAlaskaNative")
	private Integer amInd_and_AlaNatPopulation;
	
	@Column(name = "NativeHawaiianandOtherPacificIslander")
	private Integer natHaw_and_OPIPopulation;
	
	@Column(name = "Hispanic")
	private Integer hispanicPopulation;

	@Transient
	private Integer totalPopulation;
	
	public String getId() {
		return id;
	}

	public Integer getWhitePopulation() {
		return whitePopulation;
	}

	public Integer getBlackPopulation() {
		return blackPopulation;
	}

	public Integer getAsianPopulation() {
		return asianPopulation;
	}

	public Integer getAmInd_and_AlaNatPopulation() {
		return amInd_and_AlaNatPopulation;
	}

	public Integer getNatHaw_and_OPIPopulation() {
		return natHaw_and_OPIPopulation;
	}

	public Integer getHispanicPopulation() {
		return hispanicPopulation;
	}
	
	public Integer getTotalPopulation() {
		//+ amInd_and_AlaNatPopulation + natHaw_and_OPIPopulation are excluded as we do not have the 
		//population for these groups for florida atm.
		return whitePopulation + blackPopulation + asianPopulation;
	}

}
