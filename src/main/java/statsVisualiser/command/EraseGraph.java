package statsVisualiser.command;

import statsVisualiser.gui.Main;

public class EraseGraph extends Command {
	
	
	public EraseGraph(Main ui) {
		super(ui);
	}

	public void execute() {

		ui.panelCenter.remove(ui.graphStack.peek());
		ui.panelCenter.repaint();
		ui.f.pack();
		ui.graphStack.pop();
		
		
	}

	
}
