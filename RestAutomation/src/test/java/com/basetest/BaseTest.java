package com.basetest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;

import com.Utilies.FileEnv;

import io.restassured.RestAssured;

public class BaseTest {
	
	@BeforeClass
	public void bastest() throws IOException {
		// TODO Auto-generated method stub
		RestAssured.baseURI = FileEnv.propertyRead("serverUrl");
	}

}
