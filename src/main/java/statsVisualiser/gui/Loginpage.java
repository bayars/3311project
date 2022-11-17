package statsVisualiser.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import login.Csv;
import login.User;

public class Loginpage extends JFrame implements ActionListener {
	
    private static final long serialVersionUID = 1L;
    private static Loginpage loginpageInstance = null;

	Container container=getContentPane();
	
    JLabel userLabel=new JLabel("Username:");
    JLabel passwordLabel=new JLabel("Password:");
    JTextField userTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JButton submitButton=new JButton("Submit!");
    
	private Loginpage(){
		container.setLayout(null);
		setLocationAndSize();
        addComponentsToContainer();
        listenButtons();
   }
	
   public static Loginpage getInstance() {
	   if( loginpageInstance == null) {
		   loginpageInstance = new Loginpage();
	   }
	   return loginpageInstance;
   }

   public void setLocationAndSize()
   {
       userLabel.setBounds(50,30,90,30);
       passwordLabel.setBounds(50,60,90,30);
       userTextField.setBounds(150,30,150,20);
       passwordField.setBounds(150,60,150,20);
       submitButton.setBounds(50,90,300,30);
   }
   
   public void addComponentsToContainer()
   {
       container.add(userLabel);
       container.add(passwordLabel);
       container.add(userTextField);
       container.add(passwordField);
       container.add(submitButton);
   }
	
   
   public void listenButtons() {
	   submitButton.addActionListener(this);
   }
   
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
		ArrayList<String> usernameList = new ArrayList<>();
		ArrayList<String> passwordList = new ArrayList<>();
		if ( e.getSource() == submitButton) {
			String username, password;
			username = userTextField.getText();
			password = passwordField.getText();
			Csv userCredentials = new Csv();
			try {
				userCredentials.load("./users.csv");
			} catch (Exception e1) {
				e1.printStackTrace();
				System.out.println("File Location not Correct!!!");
			}
			ArrayList<User> user = userCredentials.users;
			for( int i = 0; i < user.size(); i++ ){
				usernameList.add(user.get(i).getName());
				passwordList.add(user.get(i).getPassword());
			}
			if ( authentication(usernameList, passwordList, username, password) ){
				dispose();
				@SuppressWarnings("unused")
				Main main = new Main();
			}else{
				JOptionPane.showMessageDialog(this, "Login Credentials incorrect!!");
			}
		}
		
	}
	
	public boolean authentication(ArrayList<String> Userlist, ArrayList<String> passwordList, String Username, String Password ) {
		if (Userlist.contains(Username) && passwordList.contains(Password) ) {
			return true;
		}
		return false;
	}
   
	public static void main(String[] args) {

		JFrame frame = new Loginpage();
        frame.setTitle("Login Page");
        frame.setBounds(10,10,400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
		frame.setVisible(true);
	}


	
}