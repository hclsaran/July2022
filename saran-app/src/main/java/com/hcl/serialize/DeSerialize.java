package com.hcl.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerialize {

	public static void main(String[] args) {
		Student s=null;
		
			try {
				FileInputStream fis=new FileInputStream("student.ser");
				ObjectInputStream ois=new ObjectInputStream(fis);
				s=(Student)ois.readObject(); //ois.readObject return Object but we want only student object
				ois.close();fis.close();
				
				
				System.out.println(s.stuName);
				System.out.println(s.stuAddress);
				System.out.println(s.stuSSN);
				
			}catch(Exception e) {e.printStackTrace();}
		
		
	}
}
