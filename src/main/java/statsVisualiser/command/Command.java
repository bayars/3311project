package statsVisualiser.command;

import statsVisualiser.gui.main;

public abstract class Command {

	public String country, analysis, graphType;
	public int yearStart, yearEnd;
	main ui;
	
	public Command(main ui){
		
		this.ui = ui;
		
	}
	
	 public abstract void execute();
	
	
	
}
