package dream_team.server.oldmodel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



public class CompactnessMeasure {
	
	private String id;
	private double polsbyPopperValue;
	private double schwartzValue;
	
	public CompactnessMeasure(String id, double polsbyPopperValue, double schwartzValue) {
		this.id = id;
		this.polsbyPopperValue = polsbyPopperValue;
		this.schwartzValue = schwartzValue;
	}
	public CompactnessMeasure(double polsbyPopperValue, double schwartzValue) {
		this.polsbyPopperValue = polsbyPopperValue;
		this.schwartzValue = schwartzValue;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPolsbyPopperValue() {
		return polsbyPopperValue;
	}

	public void setPolsbyPopperValue(double polsbyPopperValue) {
		this.polsbyPopperValue = polsbyPopperValue;
	}

	public double getSchwartzValue() {
		return schwartzValue;
	}

	public void setSchwartzValue(double schwartzValue) {
		this.schwartzValue = schwartzValue;
	}
}
