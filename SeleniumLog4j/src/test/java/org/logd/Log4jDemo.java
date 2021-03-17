package org.logd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	
	public static Logger Logger = LogManager.getLogger(Log4jDemo.class);
	
	
	
	public static void main(String[] args) {
		
		System.out.println("\n   hello world.....?  \n");
		
		Logger.info("information message");
		
		Logger.error("error message");
		
		Logger.warn("warning  message");
		
		Logger.fatal("error message");
		
		
	}
}
