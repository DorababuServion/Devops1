package jca;

import org.testng.annotations.Test;

public class ExdataprCl {
	
	
	@Test(dataProvider = "sampledata",dataProviderClass = DataProvidr.class)
	private void tc1(String data1 , String dat2) {
		// TODO Auto-generated method stub
		System.out.println(data1);
		System.out.println(dat2);
	}
	
	

}
