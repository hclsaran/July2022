package com.hcl.basic;

public class Static {//keyword is static (java is case sensitive
	static int y=0;// will get memory only once and retains its value
	Static(){
		y++;//0
		System.out.println(y);//1
		
	}
	public static void main(String[] args) {
		Static s1=new Static();//1
		Static s2=new Static();//1
		Static s3=new Static();//1
		
	}

}
