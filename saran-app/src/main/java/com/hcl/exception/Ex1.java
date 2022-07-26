package com.hcl.exception;

public class Ex1 {

	public static void main(String[] args) {
		int x=45;
		int y=0;
		try {
		//int x1=Integer.parseInt("welcome");
			getInt();
		
		int z=x/y;
		}catch(ArithmeticException | NumberFormatException e) {e.printStackTrace();}
		finally {
			System.out.println("closing up memory resources.Finally block will be executed always whether exception is thrown or not");
		}
		System.out.println("continue working");
		

	}
	
	private static void getInt() {
		int u=Integer.parseInt("xyz");
	}

}
