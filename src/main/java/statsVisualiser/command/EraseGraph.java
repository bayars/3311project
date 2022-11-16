package statsVisualiser.command;

import statsVisualiser.gui.main;

public class EraseGraph extends Command {
	
	
	public EraseGraph(main ui) {
		super(ui);
	}

	public void execute() {

		ui.panelCenter.remove(ui.graphStack.peek());
		ui.panelCenter.repaint();
		ui.f.pack();
		ui.graphStack.pop();
		
		
	}

	
}
