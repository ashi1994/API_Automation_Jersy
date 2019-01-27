package com.common;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;



public class Webservices {
	static javax.ws.rs.client.Client client = ClientBuilder.newClient();
	static WebTarget webTarget 
	  = client.target("https://reqres.in/");
	
	public static Response getCall(String apiurl) {
	
		WebTarget employeeWebTarget 
		  = webTarget.path(apiurl);
		Invocation.Builder invocationBuilder 
		  = employeeWebTarget.request("application/json");
		Response response = invocationBuilder.get();
		return response;
		
	}
	
	
	public static Response postCall(String apiurl,String payload) {
		
		WebTarget employeeWebTarget 
		  = webTarget.path(apiurl);
		Invocation.Builder invocationBuilder 
		  = employeeWebTarget.request("application/json");
		Response response = invocationBuilder.post(Entity.json(payload));
		return response;
		
	}
	
	public static Response putCall(String apiurl,String payload) {
		
		WebTarget employeeWebTarget 
		  = webTarget.path(apiurl);
		Invocation.Builder invocationBuilder 
		  = employeeWebTarget.request("application/json");
		Response response = invocationBuilder.put(Entity.json(payload));
		return response;
		
	}
	
    public static Response deleteCall(String apiurl) {
		
		WebTarget employeeWebTarget 
		  = webTarget.path(apiurl);
		Invocation.Builder invocationBuilder 
		  = employeeWebTarget.request("application/json");
		Response response = invocationBuilder.delete();
		return response;
		
	}
	

}