package com.hcl.loop;

public class ForLoop {

	public static void main(String[] args) {
		int x=1;
		 
		do{
			System.out.println(x);
			x++;
		}while(x<=10);
		
	}
}
//In a real time scenario sometime i may have to skip
//some of numbers in forloop 
//i==1 iam confident it doesnt throw any exception
//until i==7;