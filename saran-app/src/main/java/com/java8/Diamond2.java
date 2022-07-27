package com.java8;
/*
 * Diamond Problem->related with mulitple inheritance
 * Java Does not support mulitple inheritance(more than one base class),
 *  but it supports multilevel inheritance(sing base class)
 *  You must override the display method in the implementation class
 */
interface Test11{
	public default void display() {
		System.out.println("calling from Test1 interface");
	}
}

interface Test22{
	public void display();
}

public class Diamond2 implements Test11,Test22{

	public void display() {
		System.out.println("calling from test 22");
		
	}
	
	
	public static void main(String[] args) {
		 	Diamond2 d=new Diamond2();
		 	d.display();
		 	Test11 tt=new Diamond2();
		 	tt.display();
		 	Test11 tt1=(Test11)d;
		 	tt1.display();
		 	
		 	
		
		 
	}

	
	
	

}
