package com.saran;

public class Welcome {

	  int x=2;//instance variable
	  static int y=2;//class variable or static variable
	  int v=x&y;            //binary value 1 0    binary value 1 0   1 0
	  
	  public void call() {
		  int z=10;      //local variable must be initialized
		  System.out.println(z);
		  System.out.println(v);
	  }
	
	public static void main(String[] args) {//Entry point for Java
		Welcome w=new Welcome();		 
		
		System.out.println("Welcome July 2022 Batch");
		System.out.println(w.x);
		System.out.println(Welcome.y);
	 
		w.call();
	}
}
