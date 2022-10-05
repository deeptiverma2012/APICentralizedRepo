package org.testing.testcase;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.Properties_Handle;
import org.testng.annotations.Test;


import io.restassured.response.Response;


public class TC10_DeleteRequest {

	@Test
	public static void Testcase10() throws IOException {
		Properties pr = Properties_Handle.readPropertyFile("../API_Automation/URI.properties"); 
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.DeleteRequest("QA_URI_PostPassenger", TC9_UpdateRequest.getPassengerId);
		System.out.println("*****************************TestCase10***********************************");
		System.out.println(res.getStatusCode());
		System.out.println(res.asString());
		
	}
}
