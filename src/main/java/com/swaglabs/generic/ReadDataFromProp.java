package com.swaglabs.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class ReadDataFromProp {

	
		public String readdatafrompropfile(String key) throws IOException {
			FileInputStream fis = new FileInputStream(IAutoconstant.proppath);
			Properties properties = new Properties();
			properties.load(fis);
			String value = properties.getProperty(key);
			return value;

	

}
}