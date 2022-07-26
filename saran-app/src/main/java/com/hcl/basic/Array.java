package com.hcl.basic;

import java.util.Arrays;

class Emp{
	int empId;
	String empName;
	Emp(int empId,String empName){
		this.empId=empId;
		this.empName=empName;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}

public class Array {

	public static void main(String[] args) {
		int[] arr;
		arr=new int[3];
		arr[0]=45;
		arr[1]=23;
		arr[2]=25;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Index "+i + "   "+arr[i]);
		}
		Emp[] emp;
		emp=new Emp[3];
		emp[0]=new Emp(111,"Vijay");
		emp[1]=new Emp(222,"Athul");
		emp[2]=new Emp(333,"Justin");
		
		for(int i=0;i<emp.length;i++) {
			System.out.println("Index "+i + "   "+emp[i].empId+" "+emp[i].empName);
			
		}
		Emp[] emp1=new Emp[] {new Emp(123,"Brandan"),new Emp(124,"Hadiqa"),new Emp(125,"Jordan")};
		for(Emp emp2:emp1) {
			System.out.println(emp2);
		}
		Arrays.asList(emp).forEach(System.out::println);
		
		
		
	}
}
