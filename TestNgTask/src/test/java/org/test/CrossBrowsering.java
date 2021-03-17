package org.test;

import org.testng.annotations.Test;

public class CrossBrowsering {
	
	@Test
	private void tc1(String browser) {
		// TODO Auto-generated method stub
		
		if (browser.equals("chrome")) {
			System.out.println("chrome browser open");
		}else if (browser.equals("firefox")) {
			System.out.println("FireFox Browser");
		}else {
			System.out.println("Internet Explorer");
		}
		
		
		
	}

}
