package org.testing.testcase;

import java.io.IOException;
import java.util.Properties;



import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.Properties_Handle;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class TC2_GetAllRequest {
	@Test	
public void Testcase2() throws IOException
{
	Properties pr = Properties_Handle.readPropertyFile("../API_Automation/URI.properties");
	HTTPMethods http = new HTTPMethods(pr);
	Response res= http.GetAllMethod("QA_URI_NEWSTUDENTS");
	JsonParsingUsingOrgJson.responseParse(res.asString(), "id");
	System.out.println("**************************TestCase2*****************************");
}


}
