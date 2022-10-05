package org.testing.testcase;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.Properties_Handle;
import org.testing.utilities.VariableReplacement;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_PostRequest {

	public static String returnIdValue;
	@Test
	public void Testcase6() throws IOException
	{
		Properties pr = Properties_Handle.readPropertyFile("../API_Automation/URI.properties"); 
		String bodydata= JsonHandle.readJson("../API_Automation/src/test/java/org/testing/resources/AirlinesPayload");
		
		Random r = new Random();
		int idvalue = r.nextInt();
		String S = Integer.toString(idvalue);
		
	  bodydata = VariableReplacement.assignValue(bodydata, "id", S );	     
	      
	      returnIdValue= JsonParsingUsingOrgJson.parseJsondata(bodydata, "id");
	      System.out.println("The return value is:"+ returnIdValue); 
		
	      HTTPMethods http = new HTTPMethods(pr);	      
          Response res = http.PostMethod(bodydata, "QA_URI_AirlinePost" );	      

	      System.out.println("****************************TestCase6*****************************");
	     
	      System.out.println("Status code is:"+ res.getStatusCode());
	      System.out.println(res.asString());
	      
		
	}
}
