package org.testing.testcase;

import java.io.IOException;
import java.util.Properties;



import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.Properties_Handle;
import org.testing.utilities.VariableReplacement;
import org.testing.utilities.generateRandomNames;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class TC4_PutRequest{
	@Test
	public void Testcase4() throws IOException
	{
	   Properties pr = Properties_Handle.readPropertyFile("../API_Automation/URI.properties");
	   String bodydata= JsonHandle.readJson("../API_Automation/src/test/java/org/testing/resources/UpdatedPayload.json");
	   HTTPMethods http = new HTTPMethods(pr);

	     bodydata = VariableReplacement.assignValue(bodydata, "id", TC1_PostRequest.returnIdValue);
	     String fname =  generateRandomNames.generateNames(7);
		    bodydata = VariableReplacement.assignValue(bodydata, "firstname", fname);	
		    
		    String lname =  generateRandomNames.generateNames(7);
		    bodydata = VariableReplacement.assignValue(bodydata, "lastname", lname);	
		   
	     Response res= http.putRequest(bodydata, "QA_URI_NEWSTUDENTS",TC1_PostRequest.returnIdValue );
	     System.out.println("***********************TestCase 4**************************************");
	     System.out.println(res.asString());
	     System.out.println("Status Code is"+res.statusCode() );
	  
	   
	  
	}
	
	
}

