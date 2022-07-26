package com.hcl.oops;


abstract class Generic{
	public abstract int discount(int x);
	public void print() {
		System.out.println("any message");
	}
}

class Costco extends Generic{

	@Override
	public int discount(int x) {
		// TODO Auto-generated method stub
		return 1;
	}
	
}
class Walmart extends Generic{

	@Override
	public int discount(int x) {
		// TODO Auto-generated method stub
		return 2;
	}
	
}

public class AbstractMain {
	public static void main(String[] args) {
		Costco c1=new Costco();
		c1.discount(1);
		c1.print();
		
	}
      
      
}
