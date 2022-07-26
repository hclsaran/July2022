package com.hcl.serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	String stuName;
	String stuAddress;
	transient int stuSSN; //not serialized
	
	public void display() {
		System.out.println(stuName + "  "  +stuAddress +"  "+stuSSN);
	}
	
}
public class SerializbleTest {
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.stuName="Carlos";
		s1.stuAddress="PIT";
		s1.stuSSN=12345678;
		
		try {
			FileOutputStream fos=new FileOutputStream("student.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.close();fos.close();
			System.out.println("Student objects serialized data is saved in student.ser");
		}catch(Exception e) {e.printStackTrace();}
		
	}

}
