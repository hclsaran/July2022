package com.hcl.oops;

public class Vehicle {
	int vid;
	String vname;
	
	Vehicle(){
		System.out.println(" Constructor is created");
	}
	Vehicle(int vid,String vname){
		this.vid=vid;
		this.vname=vname;
		System.out.println(vid + ""+vname);
	}
	
	public static void main(String[] args) {
		Vehicle c=new Vehicle();
		Vehicle c1=new Vehicle(12,"Bentley");
		
	}

}
