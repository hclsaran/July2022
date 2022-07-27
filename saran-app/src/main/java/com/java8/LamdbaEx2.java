package com.java8;

public class LamdbaEx2 {
	
	interface EmpFactory<E extends Emp>{
		E create(String empFirstName,String empLastName);
	}
	
	public static void main(String[] args) {
		EmpFactory<Emp> empFac=Emp::new;  //constructor reference new Emp()
		Emp emp=empFac.create("Saran", "Paddy");
		System.out.println(emp);
		
	}

}
