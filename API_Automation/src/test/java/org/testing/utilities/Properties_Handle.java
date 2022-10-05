package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
//Purpose: The purpose of this method is to load properties file
// Input--> Location of the properties file
//Output--> It will return the object of the properties file

public class Properties_Handle {
	
	public static Properties readPropertyFile(String filepath) throws IOException
	{
		File f = new File(filepath);
		FileReader fr = new FileReader(f);
		
		Properties pr = new Properties();
		pr.load(fr);
		return pr;
		
	}

}
