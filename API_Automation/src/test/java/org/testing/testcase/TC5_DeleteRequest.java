package org.testing.testcase;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.Properties_Handle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC5_DeleteRequest {

	@Test
	public void Testcase5() throws IOException {

		Properties pr = Properties_Handle.readPropertyFile("../API_Automation/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
	    Response res = http.DeleteRequest("QA_URI_NEWSTUDENTS", TC1_PostRequest.returnIdValue);
	      
	      System.out.println(TC1_PostRequest.returnIdValue);
	      System.out.println("****************************TestCase 5*****************************");
	     
	      System.out.println("Status code is:"+ res.getStatusCode());
	      System.out.println(res.asString());
	      
	      
		
		}

}
