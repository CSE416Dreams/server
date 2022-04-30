package dream_team.server.model;

public enum SelectedState {
	FLORIDA(1), GEORGIA(2), MISSISSIPPI(3),;

	SelectedState(int i) {
		this.stateNumber = i;
	}
	
	private int stateNumber;
	public int getStateNumber() {
		return this.stateNumber;
	}
}
