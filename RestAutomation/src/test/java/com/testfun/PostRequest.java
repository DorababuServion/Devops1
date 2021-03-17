package com.testfun;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostRequest {
	
	@Test
	private void postapi() {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://reqres.in/api/users";
		
		String json ="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		
		RestAssured.given().body(json).post().then().log().all().assertThat().statusCode(201);
		
	}

}
