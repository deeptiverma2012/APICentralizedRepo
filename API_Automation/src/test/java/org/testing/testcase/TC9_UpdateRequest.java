package org.testing.testcase;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.Properties_Handle;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class TC9_UpdateRequest {
	
     public static String getPassengerId;
     @Test
	public void Testcase9() throws IOException {
		Properties pr = Properties_Handle.readPropertyFile("../API_Automation/URI.properties"); 
		HTTPMethods http = new HTTPMethods(pr);
		String bodydata = JsonHandle.readJson("../API_Automation/src/test/java/org/testing/resources/PassangerPayload");
		Response res= http.PostMethod(bodydata, "QA_URI_PostPassenger"); //POst Request for Passenger
		System.out.println(res.asString());
		bodydata= res.asString();
		getPassengerId =	JsonParsingUsingOrgJson.parseJsondata(bodydata, "_id");	
		System.out.println(getPassengerId);
		
		System.out.println("******************************Testcase9 Part1**********************************");
		
		String newbodydata = JsonHandle.readJson("../API_Automation/src/test/java/org/testing/resources/UpdatePassengerPayload");
		
		Response resp1 = http.putRequest(newbodydata, "QA_URI_PostPassenger", getPassengerId); //PUT request for Passenger
		
		System.out.println(resp1.getStatusCode());
		System.out.println(resp1.asString());
		
		
		
	}
}
