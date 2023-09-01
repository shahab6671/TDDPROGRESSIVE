package progressive_utils;

import java.io.IOException;
import java.util.Properties;

import progressive_constants.KeyConfig;

public class ReadConfig {
	Properties properties;
	
	public ReadConfig() {
		loadProperties();
		
	}
	public void loadProperties()  {
		properties =new Properties();
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("configuration.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getValue(KeyConfig key) {
		return properties.getProperty(key.toString());
		
	}

}
