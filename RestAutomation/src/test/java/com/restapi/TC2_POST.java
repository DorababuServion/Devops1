package com.restapi;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC2_POST {

	public static void main(String[] args) throws InterruptedException {
		
	
		RestAssured.baseURI ="http://localhost:8085/student/list";
		
		RequestSpecification reqest = RestAssured.given();
		
		JSONObject jsonobject =  new JSONObject();
		jsonobject.put("FirstName", "Dorababu");
		jsonobject.put("lastName", "Chodavarapu");
		jsonobject.put("location", "chennai");
		
		
		reqest.header("Content-Type","application/json");
		reqest.body(jsonobject.toJSONString()); 
		
		
		Response response = reqest.request(Method.POST,"/register");
		response = reqest.post("/register");
		
		System.out.println(response);
		
		Thread.sleep(3000);
		
		//Validate the Response status code
		int statusCode=response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode,201); 
		
		
		//Validate the Response success code
		String successCode=response.jsonPath().get("SuccessCode");
		System.out.println(successCode);
		Assert.assertEquals(successCode, "OPERATION_SUCCESS");
		
	}
		
		
	
}
