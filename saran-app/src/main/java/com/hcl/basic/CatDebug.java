package com.hcl.basic;

import com.hcl.Cat;

public class CatDebug {
	
	public static void main(String[] args) {
		Cat c1=new Cat(111,"Bob");
		c1.setCatId(222);
		c1.setCatName("Apollo");
		
		Cat c2=new Cat(111,"Bob");
		c2.setCatId(333);
		c2.setCatName("Bentley");
		c2.getCatName();
		System.out.println(c2.getCatName());
		
		Cat[] cats=new Cat[2];
		cats[0]=c1;
		cats[1]=c2;
	}

}
