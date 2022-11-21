package run_app;

import javax.swing.JFrame;

import statsVisualiser.gui.Loginpage;

public class Client {

	public static void main(String[] args) {
		JFrame frame = Loginpage.getInstance();
        frame.setTitle("Login Page");
        frame.setBounds(10,10,400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
		frame.setVisible(true);
	}

}
