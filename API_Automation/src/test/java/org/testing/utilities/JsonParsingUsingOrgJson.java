package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsingUsingOrgJson {
	
	public static String parseJsondata(String responsedata, String keyname)
	{
		JSONObject js = new JSONObject(responsedata);
		return  js.getString(keyname);
	}

	public static void responseParse(String responsedata, String keyname )
	{
		JSONArray arr = new JSONArray(responsedata);
		int L= arr.length();
		
		for(int i=0; i<L; i++)
		{
			JSONObject obj =arr.getJSONObject(i);
			System.out.println("The Value of id is:"+ obj.get(keyname));
		}
	}
	
	public static int JsonParse(String responsedata, String keyname )
	{
		JSONObject ob = new JSONObject(responsedata);
		JSONObject inner = ob.getJSONObject(keyname);
		int idValue = inner.getInt("id");
		return idValue;
		
		
	}
	public static void responseParse1(String responsedata, String keyname )
	{
		JSONArray arr = new JSONArray(responsedata);
		int L= arr.length();
		
		for(int i=0; i<18; i++)
		{
			JSONObject obj =arr.getJSONObject(i);
			System.out.println("The Value of id is:"+ obj.get(keyname));
		}
	}
}
