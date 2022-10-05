package org.testing.testcase;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.Properties_Handle;
import org.testing.utilities.VariableReplacement;
import org.testing.utilities.generateRandomNames;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_PostRequest {

	public static String returnIdValue;
	@Test
	public  void Testcase1() throws IOException {
		// TODO Auto-generated method stub
		
		Properties pr = Properties_Handle.readPropertyFile("../API_Automation/URI.properties"); 
		String bodydata= JsonHandle.readJson("../API_Automation/src/test/java/org/testing/resources/InputPayload.json");
		
    	
	    /*Scanner scan = new Scanner(System.in);
		System.out.println("Please enter variable value");
		String Variablevalue = scan.next();
		
		bodydata = VariableReplacement.assignValue(bodydata, "id", Variablevalue );*/
		
		Random r = new Random();
		int idvalue = r.nextInt();
		String S = Integer.toString(idvalue);
	
		
	   bodydata = VariableReplacement.assignValue(bodydata, "id", S);
	    String fname =  generateRandomNames.generateNames(7);
	    bodydata = VariableReplacement.assignValue(bodydata, "firstname", fname);	
	    
	    String lname =  generateRandomNames.generateNames(7);
	    bodydata = VariableReplacement.assignValue(bodydata, "lastname", lname);	
	   
	   
		
    	
		HTTPMethods http = new HTTPMethods(pr);
    	Response res = http.PostMethod(bodydata,"QA_URI_NEWSTUDENTS");  
        
    	
		System.out.println("*************************Test Case #1************************************");

		returnIdValue =JsonParsingUsingOrgJson.parseJsondata(res.asString(), "id");
    	System.out.println(returnIdValue);
	}

}
