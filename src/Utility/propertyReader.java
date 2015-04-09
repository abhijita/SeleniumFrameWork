package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyReader {

	private Properties seleniumproperties;
	
	public propertyReader() {
		// TODO Auto-generated constructor stub
		seleniumproperties = new Properties();
		try {
			seleniumproperties.load(new FileInputStream("selenium.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
	
	public String getBrwoserType(){
		return seleniumproperties.getProperty("browser");
	}
	
}
