package dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import base.Baseclass;
public class Configfile{

		private Properties properties;
		//public String FilePath ="Config//Configuration.properties";
		public Configfile() {
			String path ="Config/Configurations.properties";

			try {
				FileInputStream Locator = new FileInputStream(path);
				properties = new Properties();
				properties.load(Locator);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		public String getData(String ElementName) {
			// Read value using the logical name as Key
			String data = properties.getProperty(ElementName);
			if(data!= null) return data;
			else throw new RuntimeException("driverPath not specified in the Configuration.properties file");
		}

	}



