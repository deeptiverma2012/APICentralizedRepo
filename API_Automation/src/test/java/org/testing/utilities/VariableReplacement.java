package org.testing.utilities;

import java.util.regex.Pattern;

public  class VariableReplacement {

	public static String assignValue(String data, String Variablename,String VariableValue )
	{
		data= data.replaceAll(Pattern.quote("{{"+Variablename+"}}"), VariableValue);
		return data; 
		
	}
	
	

}
