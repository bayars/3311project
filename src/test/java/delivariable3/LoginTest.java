package delivariable3;


import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import login.Csv;
import login.User;
import statsVisualiser.gui.Loginpage;

public class LoginTest {

	@Test
	public void CsvLoad() throws Exception {
		Csv user = new Csv();
		user.load("./users.csv");
		assertTrue( user.users.toString().contains("efecan") );
	}
	
	@Test
	public void ValidCredentialUserLogin() throws Exception {
		Loginpage login = Loginpage.getInstance();
		ArrayList<String> usernameList = new ArrayList<String>();
		ArrayList<String> passswordList = new ArrayList<String>();
		usernameList.add("safa");
		passswordList.add("12345");
		String username = "safa";
		String password = "12345";
		assertTrue(login.authentication(usernameList, passswordList, username, password));
	}	
	@Test
	public void InvalidCredentialUserLogin() throws Exception {
		Loginpage login = Loginpage.getInstance();
		ArrayList<String> usernameList = new ArrayList<String>();
		ArrayList<String> passswordList = new ArrayList<String>();
		usernameList.add("safa");
		passswordList.add("12345");
		String username = "safa";
		String password = "123456";
		assertFalse(login.authentication(usernameList, passswordList, username, password));
	}
	
	@Test
	public void TestUserCreation() throws Exception {
		User user = new User();
		user.setName("testUser");
		assertEquals(user.getName(), "testUser");
	}
	
	@Test
	public void TestUserCreationPassword() throws Exception {
		User user = new User();
		user.setPassword("testPassword");
		assertEquals(user.getPassword(), "testPassword");
	}
}
