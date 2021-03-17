package com.restapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


	public class TC3_MAPS {

		
	@Test
	private void testmap() {
		// TODO Auto-generated method stub
		RestAssured.baseURI ="https://maps.googleapis.com";		
		RequestSpecification httprequest = RestAssured.given();
		Response respone = httprequest.request(Method.GET,"/maps/api/place/nearbysearch/xml?location=-33.8670522,151.1957362&radius=1500&type=supermarket&key=AIzaSyBjGCE3VpLU4lgTqSTDmHmJ2HoELb4Jy1s\r\n");

		String asString = respone.getBody().asString();
		System.out.println(asString);
		
		String header = respone.header("content -Type");
		System.out.println(header);
		
		
		Headers headers = respone.headers();
		
		for (Header header2 : headers) {
			
	//		System.out.println(header2.getName());
			System.out.println(header2.getValue());
		}
		
		
	}
}
