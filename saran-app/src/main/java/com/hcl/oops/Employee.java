package com.hcl.oops;

public class Employee {
	int empId;
	String empName;
	
	void insertEmp(int empId,String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	void print() {
		System.out.println(empId+"  "+empName);
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.empId=100;
		e1.empName="Rachid";
		e2.empId=101;
		e2.empName="Marlon";
		 System.out.println(e1.empId+" "+e1.empName);
		 System.out.println(e2.empId+" "+e2.empName );
		e1.insertEmp(102, "Huy"); 
		e2.insertEmp(103,"Dylan");
		e1.print();
		e2.print();
		
		 
		 
		 
	}

}
