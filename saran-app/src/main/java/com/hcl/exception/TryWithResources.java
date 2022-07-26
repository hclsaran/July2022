package com.hcl.exception;

import java.io.FileOutputStream;

public class TryWithResources {
	
	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("saran.text")){
			String txt="Welcome to the world of Java";
			byte arr[]=txt.getBytes();
			fos.write(arr);
		}catch(Exception e) {System.out.println(e);}
		
	}

}
