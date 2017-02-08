package businesslogic;

import java.util.ArrayList;
import java.util.List;

public class ExperimentList {
	
	private List<NewExperiment> experimentList = new ArrayList<NewExperiment>();
	
	void addExperiment(NewExperiment newExperiment){
		this.experimentList.add(newExperiment);
	}
	
	void removeExperiment(int index){
		this.experimentList.remove(index);
	}
}
