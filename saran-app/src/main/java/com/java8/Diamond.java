package com.java8;
//`<div>${faker.commerce.productName()}</div>`
interface Test1{
	public default void display() {
		System.out.println("calling from Test1 interface");
	}
}

interface Test2{
	public default void display() {
		System.out.println("calling from Test2 interface");
	}
}

public class Diamond implements Test1,Test2{
	/*
	 * Diamond Problem->related with mulitple inheritance
	 * Java Does not support mulitple inheritance(more than one base class),
	 *  but it supports multilevel inheritance(sing base class)
	 *  You must override the display method in the implementation class
	 */
	@Override
	public void display() {
		 Test1.super.display();
		// Test2.super.display();
		
		
	}
	public static void main(String[] args) {
		 	Diamond d=new Diamond();
		 	d.display();
		
		 
	}

	

}
