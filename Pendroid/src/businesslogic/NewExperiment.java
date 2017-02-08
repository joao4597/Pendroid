package businesslogic;

import javax.swing.JTabbedPane;

public class NewExperiment {
	private float length;
	private int oscillations;
	private JTabbedPane tabbedPane;
	private float averagePeriod = 0;
	private ExperimentList experimentList;
	
	NewExperiment(float length, int oscillations, JTabbedPane tabbedPane, ExperimentList experimentList){
		this.length = length;
		this.oscillations = oscillations;
		this.tabbedPane= tabbedPane;
		this.experimentList = experimentList;
	}
	
	void startExperiment(){
		
	}
	
	void repaintTabbedPanel(){
		tabbedPane.removeAll();
	}
	
}
