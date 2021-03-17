package com.testfun;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestAutomation {
	
	@Test
	private void getrequest() {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI ="https://reqres.in/api/users";
		
		 Response response = RestAssured.given().param("page", "2").when().get();
		 
		 System.out.println(response.getStatusCode());
		 System.out.println(response.getContentType());
		 System.out.println(response.getBody().asString());

		 System.out.println(response.getTime());
		 System.out.println(response.getCookies());
	}

}
