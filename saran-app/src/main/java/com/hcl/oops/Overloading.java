package com.hcl.oops;

public class Overloading {
	
	static int sum(int a, int b) {return a+b;}
	static int sum(int a, int b,int c) {return a+b+c;}
	
	public static void main(String[] args) {
		System.out.println(Overloading.sum(1,2));
		System.out.println(Overloading.sum(1,2,3));
		
	}
	

}
