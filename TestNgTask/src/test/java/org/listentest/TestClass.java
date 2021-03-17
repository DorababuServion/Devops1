package org.listentest;import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

	
	@Test
	private void setup() {
		// TODO Auto-generated method stub
		Assert.assertTrue(true);

	}
	@Test
	private void loginbyemail() {
		// TODO Auto-generated method stub
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods = {"loginbyemail"})
	private void loginbyid() {
		// TODO Auto-generated method stub
		Assert.assertTrue(true);
	}
	
}
