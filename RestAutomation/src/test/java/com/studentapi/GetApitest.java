package com.studentapi;

import org.testng.annotations.Test;

import com.apiconfig.ApiPath;
import com.basetest.BaseTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetApitest extends BaseTest {

	
	@Test
	public void getapitest() {
		// TODO Auto-generated method stub
		
		Response response = RestAssured.given().when().get(ApiPath.apiPath.Get_list_of_users);
		
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getCookies());
		System.out.println(response.getTime());
		
	}
}
