package com.hcl.basic;

public class Strings {
	
	public static void main(String[] args) {
		String s1="Dylan";  //String is always immutable
		String s2="Dylan";
		//s1.concat("Saran");
		String s3=new String("Dylan"); 
		String s4=s3.intern();  //store the string in the constant pool
		
		if(s1.equals(s4)) {
			System.out.println(true);
			
		}else {
			System.out.println(false);
		}
		if(s1==s4) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
	}
}
