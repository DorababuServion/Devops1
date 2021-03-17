package com.TestRunner;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Tc1_Get {
	
	public static void main(String[] args) {
		
	
	// TODO Auto-generated method stub
		//base url
		RestAssured.baseURI  = "http://restapi.demoqa.com/utilities/weather/city";
		//requestobject
		RequestSpecification httprequest =  RestAssured.given();
		//respone object
		Response respone = httprequest.request(Method.GET,"/Hyderabad");
		
		ResponseBody body = respone.getBody();
		
		String asString = body.asString();
		
		System.out.println("Respone Body is"+asString);
		
		
		
		
		
		
	}

}
