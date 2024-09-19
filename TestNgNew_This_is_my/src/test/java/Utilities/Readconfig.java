 package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {
	Properties pro;
	
	public  Readconfig ()  {
		File f=new File("./config/configuration.properties");
		try {
			FileInputStream fis=new FileInputStream(f);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("exception is"+e.getMessage());
			
		}
		
	}	

	
	public  String getUrl(){
		String baseUrl=pro.getProperty("url");
		return baseUrl;
		
	}
	
	
	public  String getUsername(){
		String un=pro.getProperty("username");
		return un;
		
	}

	public  String getPassword(){
		String pwd=pro.getProperty("password");
		return pwd; 
		
	}

	
}

