package com.hcl.basic;

public class Debug {
	public static void main(String[] args) {	
	int first=7;
	int second=8;
	
	int sum=add(first,second);
	System.out.println("The sum is "+sum);
	}

	private static int add(int first, int second) {
		int sum=first+second;
		return sum;
	}
	
	

}
