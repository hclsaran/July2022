package com.hcl.oops;

class Bike{
	void speed() {System.out.println("100mph");}
}

public class OverRiding extends Bike {
	
	void speed() {System.out.println("200mph");	}
	
	public static void main(String[] args) {
		Bike b=new Bike();
		b.speed();
		Bike b1=new OverRiding();//runtime polymorphism
		b1.speed();
		OverRiding o=(OverRiding)b;
		o.speed();//200 it will throw a runtime exception called as ClassCastException 
	}


}
