package org.testing.testcase;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.Properties_Handle;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class TC8_GetRequest {
	@Test
	public void Testcase8() throws IOException
	{
		Properties pr = Properties_Handle.readPropertyFile("../API_Automation/URI.properties"); 
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.getRequest("QA_URI_AllAirlines", TC6_PostRequest.returnIdValue);
		System.out.println("*********************TestCase8*************************************");
		
		System.out.println("Status code is:"+ res.statusCode());
		System.out.println(res.asString());
		
		
	}

}
