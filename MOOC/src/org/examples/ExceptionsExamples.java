package org.examples;

public class ExceptionsExamples {
	
	public static void main(String[] args) {
		System.out.println("Program is started.........");
		System.out.println("Program is in progress.........");
		
		int a=100;
		
		try
		{
		//System.out.println(a/0); //ArithmeticException
		String s="welcome";
		int n=Integer.parseInt(s); //NumberFormatException
				
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException is occured.. and handled succesfully");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException is occured.. and handled succesfully");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException is occured.. and handled succesfully");
		}
		
			
		
		try
		{
		//System.out.println(a/0); //ArithmeticException
		String s="welcome";
		int n=Integer.parseInt(s); //NumberFormatException
				
		}
		catch(Exception e)
		{
			System.out.println("Exception is occured.. and handled succesfully");
		}
		
	}

}
