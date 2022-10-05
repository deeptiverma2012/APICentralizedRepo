package org.testing.teststeps;
//For fetching URI_Key values from the properties file we need properties class obect

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethods {
	
	Properties pr;
	
	

	// It is a class parameterized constructor 
	public HTTPMethods(Properties pr)
	{
	   this.pr = pr;	
	}
	
	public Response PostMethod(String bodydata, String urikey )
	{
		Response res= 
				given().contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.post(pr.getProperty(urikey));
		
		System.out.println("The status code is:"+res.getStatusCode());
		System.out.println(res.asString());
		return res;
						
				
	}
	public Response GetAllMethod(String urikey)
	{
		Response res= given().contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(urikey));
		System.out.println("The status code is:"+res.getStatusCode() );
		System.out.println("Payload is:"+res.asString());
		return res;
	}
	
	public Response getRequest(String urikey, String idvalue)
	{
		String completeUri= pr.getProperty(urikey)+"/"+idvalue;
		
		Response res= given().
				contentType(ContentType.JSON)
				.when()
				.get(completeUri);
		return res;
	}
	

    public Response putRequest(String bodydata, String urikey, String idvalue)
    {
    	String completeUri= pr.getProperty(urikey)+"/"+idvalue;
    	
    	Response res =
    	given()
    	.contentType(ContentType.JSON)
    	.body(bodydata)
    	.when()
    	.put(completeUri);
    	return res;
    	
    }
	
    public Response DeleteRequest(String urikey, String idvalue)
	{
		String completeUri= pr.getProperty(urikey)+"/"+idvalue;
		
		Response res= given().
				contentType(ContentType.JSON)
				.when()
				.delete(completeUri);
		return res;
	}
    
   
   
}


