package dream_team.server.seawulf;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import dream_team.server.model.Minority;
@Entity
@Table(name = "BoxWhisker")
public class BoxAndWhisker {
	@Id
	@Column (name = "BOXID")
	private String boxID;
	private Minority minority;
	private double mean;
	private double median;
	private double firstQ;
	private double thirdQ;
	private double max;
	private double min;
	
	
	
}
