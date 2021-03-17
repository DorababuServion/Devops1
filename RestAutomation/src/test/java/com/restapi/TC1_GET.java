package com.restapi;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class TC1_GET {
	
	
	public static void main(String[] args) {
		
		RestAssured.baseURI = "http://localhost:8085/student/list";
		RequestSpecification httpRequest = RestAssured.given();
		
		Response response = httpRequest.request(Method.GET);
		String asString = response.body().asString();
		
		System.out.println(asString);
		
		
		int statusCode = response.getStatusCode();	
		System.out.println(statusCode);
	
	}

}
