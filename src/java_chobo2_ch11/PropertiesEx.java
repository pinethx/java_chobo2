package java_chobo2_ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesEx {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("url", "jdbc:mysql://localhost:3306/mysql_study?useSSL=false");
		prop.setProperty("user","user_mysql_study");
		prop.setProperty("password","123456");
		
		//file 저장
		try {
			prop.store(new FileOutputStream("oupt.txt"), "Properties Example");
			prop.store(new FileWriter("output2.properties"), "Properties Example");
			
			prop.storeToXML(new FileOutputStream("output.xml"), "Properties Example to XML", "UTF-8");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//file 로부터 로드
		Properties loadProp = new Properties();
		Properties xmlProp = new Properties();
		try {
			loadProp.load(new FileInputStream("oupt.txt"));
			prnProperties(loadProp);
			
			xmlProp.loadFromXML(new FileInputStream("output.xml"));
			prnProperties(xmlProp);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void prnProperties(Properties loadProp) {
		Set <Object> keys = loadProp.keySet();
		for(Object key : keys) {
			System.out.println(key + " : " + loadProp.getProperty((String)key));
		}
	}
}
