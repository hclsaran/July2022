package com.hcl.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListExample {
	//creates a dnyamic array;stores the duplicate elements of different data types, maintains insertion order
	//non synchronized
	// when you retreive the values it will faster
	//when do you manipulation(insert,delete and update) will be slower
	
	public static void main(String[] args) {
		//Generics ->making sure that its type safety
		 
		List<String> list2=new ArrayList<>();//run time polymorphism
		 
		
		list2.add("Justin");
		list2.add(new String("Amritpal"));
		list2.add("Rachid");
		list2.add("dummy");
		
	
		Iterator<String> itr=list2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		list2.remove("dummy");
		
		System.out.println(list2);
		System.out.println(list2.contains("Rachd"));
		
	}

}
