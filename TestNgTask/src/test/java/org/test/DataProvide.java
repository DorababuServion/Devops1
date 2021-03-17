package org.test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide  extends StepDefinition{
	
	
	@Test(dataProvider = "sampledata")
	
	private void tc1(String email,String pass) {
		// TODO Auto-generated method stub
		
		LunchBrowser();
		
		maxwin();
		
		enterurl("https://adactinhotelapp.com/");
		
		Login l = new Login();
		sendstring(l.getUsername(), email);
		sendstring(l.getPassword(), pass);
		click(l.getLogin());
		
		
	}
	
	@DataProvider(name="sampledata")
	
	public Object[][] data(){
		return new  Object[][] {
			{"java","java@123"},{"dorababu@5424","Dora@1997"}
		};
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
