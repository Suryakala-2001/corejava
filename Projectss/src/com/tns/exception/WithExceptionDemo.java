package com.tns.exception;

public class WithExceptionDemo {
	
  public static void divide() {
	  int a=6,b=0,c;
	  try {
	 c=a/b;
  }
	  catch(ArithmeticException e) {
		System.out.println("Exception Caught"+e.getMessage());  
}
	  catch(Exception e) {
			System.out.println("Exception Caught"+e.getMessage());  
	}
	  finally {
		  System.out.println("it will be executed");
	  }
}
}