package com.hcl.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	/*
	 *HashSet store the elements using hashing technique
	 *doesnt maintain the insertion order
	 *allows null values
	 *Not Thread safe(non synchronized)
	 * default capacity for HashSet is 16
	 */
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("Test1");
		set.add(new String("Test2"));
		set.add("Test3");
		//set.add(null);
		set.add(new String("Test2"));
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		set.removeIf(str->str.contains("Test2"));
		System.out.println(set);
		
	}

}
