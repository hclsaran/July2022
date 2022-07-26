package com.hcl.oops;

public final class Final {//can not be inherited
	final int x=12;// constant
	
	final void display() {System.out.println("calling display");}	

}
//class Test extends Final{
	// void display() {System.out.println("calling display");}	
//}
class ABC{
	static final int d;
	static {
		d=12;
	}
	public static void main(String[] args) {
		System.out.println(ABC.d);
	}
	
}
