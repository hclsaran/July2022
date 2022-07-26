package com.hcl.exception;

public class CustomException extends Exception {

	   public CustomException(String s) {
		   super(s);
	   }
}

class Main{
	  public static void main(String[] args) throws CustomException{
		try {
			throw new CustomException("Custom Exception");//single line explicitly
		}catch(CustomException e) {System.out.println(e.getMessage());}
	}
}
