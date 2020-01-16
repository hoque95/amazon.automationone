package cucumberSupportCode;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ReadPropertiesFile {
	public static ReadPropertiesFile readPropertiesFile;
	//map store data like key and value
	public static Map<String,String> readProperties() {
		
		Properties prop = new Properties();
		FileInputStream fi;
		try {
			fi = new FileInputStream("C:\\Users\\hoque\\eclipse-workspace\\amazon.automationone\\Utility\\file.properties");
			prop.load(fi);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Map<String, String> properties = new HashMap<String, String>();
		Enumeration<Object> keyValue = prop.keys();
		while(keyValue.hasMoreElements()) {
			//casting
		String key = (String) keyValue.nextElement();
		String value = prop.getProperty(key);
		properties.put(key, System.getProperty(key, value));
		}
		return properties;
		
		}
	}
	
