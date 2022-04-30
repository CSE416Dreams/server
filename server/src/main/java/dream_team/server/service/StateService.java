package dream_team.server.service;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dream_team.server.database.DatabaseClass;
import dream_team.server.model.State;
import dream_team.server.model.Status;
import dream_team.server.oldmodel.DistrictPlanSummary;
import dream_team.server.model.SelectedState;

public class StateService {
	private Map<String, State> states = DatabaseClass.getStates();
	public StateService() {

	}
	public State getState(String state) {
		return states.get(state);
	}
	public List<State> getAllStates(){
		return new ArrayList<State>(states.values());
	}
	
	public State addState(State state) {
		states.put(state.getName(), state);
		return state;
	}

}
