package login;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

public class Csv {
		public ArrayList<User> users = new ArrayList<User>();
		public String path;
		
		public void load(String path) throws Exception{
	        List<User> beans = new CsvToBeanBuilder<User>(new FileReader(path))
	                .withType(User.class)
	                .build()
	                .parse();
	        beans.forEach(a -> users.add(a));
		}	
}