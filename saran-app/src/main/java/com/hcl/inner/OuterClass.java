package com.hcl.inner;
//Java Inner class
public class OuterClass {	
	private int x=34;	
	class Inner{
		
		void display() {
			System.out.println("The private value of outerclass variable x is :"+x);
		}
		
	}
	public static void main(String[] args) {
		OuterClass out=new OuterClass();
		OuterClass.Inner outin=out.new Inner();
		outin.display();
	}

}
