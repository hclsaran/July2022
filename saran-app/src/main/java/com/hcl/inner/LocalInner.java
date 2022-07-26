package com.hcl.inner;

public class LocalInner {
	
	private int y=12;
	
	void print() {
		class Local{
			void display() {
				System.out.println("The private value of y is "+y);
			}
			
		
		}
		Local l1=new Local();
		l1.display();
	}
	public static void main(String[] args) {
		LocalInner lin=new LocalInner();
		lin.print();
	}

}
