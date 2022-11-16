package statsVisualiser.command;

import statsVisualiser.gui.main;

public class DrawGraph extends Command {

	public DrawGraph(main ui) {
		super(ui);
	}

	

	public void execute() {
		
		
		ui.currentJPanel = ui.currentGraph.panel;
		ui.currentJPanel.setVisible(true);
		ui.panelCenter.add(ui.currentJPanel);
		ui.panelCenter.repaint();
		ui.f.pack();
		ui.graphStack.push(ui.currentJPanel);
		
		
		
		
	}

	
	
	
	
	
}
