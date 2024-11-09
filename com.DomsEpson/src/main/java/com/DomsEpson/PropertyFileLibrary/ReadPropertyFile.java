package com.DomsEpson.PropertyFileLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static FileInputStream fis = null;
	public static FileOutputStream fos = null;
	public static Properties property = null;

	public static String readdata(String key) {
		// 1.Convert The Physical File Into Java Readable File
		try
		{
			fis = new FileInputStream("./src/test/resources/Data/commondata.properties");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}

		// 2.Create An Object For Properties Class
		property = new Properties();

		// 3.Load All the keys/Datas
		try 
		{
			property.load(fis);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

		// 4.Fetch The Data
		String data = property.getProperty(key);
		return data;

	}

	public static void writedata(String Key, String value) {
		// 1.Convert The Physical File Into Java Readable File
		try 
		{
			fis = new FileInputStream("./src/test/resources/Data/commondata.properties");
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}

		// 2.Create An Object For Properties Class
		property = new Properties();

		// 3.Load All the keys/Datas
		try 
		{
			property.load(fis);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		// 4.Write The Data
		property.put(Key, value);

		// 5.Convert Java Readable into physical file
		try
		{
			fos = new FileOutputStream("./src/test/resources/Data/commondata.properties");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		// 6.Store the data
		try 
		{
			property.store(fos, "Latest Key Updated Succesful");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
