package statsVisualiser.command;

import statsVisualiser.gui.Main;

public abstract class Command {

	public String country, analysis, graphType;
	public int yearStart, yearEnd;
	Main ui; 
	
	
	public Command(Main ui){
		
		this.ui = ui;
		
	}
	
	public abstract void execute();
	
	
	
}
