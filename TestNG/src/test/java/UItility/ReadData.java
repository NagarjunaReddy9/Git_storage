package UItility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadData {

	public Properties pro;
	public File file;
	public FileInputStream fis;

	public String getValue(String Key) {
		String value;
		
			file = new File("./config/configuration.properties");
			try {
			fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		value = pro.getProperty(Key);
		return value;
	}
}
