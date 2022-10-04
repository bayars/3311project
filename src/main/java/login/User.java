package login;

import com.opencsv.bean.CsvBindByPosition;

public class User {
    @CsvBindByPosition(position = 0)
	private int id;
    
    @CsvBindByPosition(position = 1)
	private String name;

    @CsvBindByPosition(position = 2)
	private String email;
    
    @CsvBindByPosition(position = 3)
	private String password;

    
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", email=" + email + ", password=" + password + "]";
	}
}
