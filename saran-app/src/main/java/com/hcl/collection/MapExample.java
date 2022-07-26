package com.hcl.collection;

import java.util.HashMap;
import java.util.Map;


public class MapExample {
	
	//Map is not a part of Collection
	/*Real time use case->Lets say in an orgnaization we have lot of employees
	 * if we want to find the details of employees (i have mulitple brandon names)
	 * with the help of id's(id must be unique) 
	 * Map stores key values pairs
	 * id=1 name=brandon
	 * id=23 name=bradon
	 * Map doesnt allow primitive data types
	 * HashMap does allow one null key and many no of null values
	 */
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(121, "Brandon");
		map.put(122, "Rachid");
		map.put(123, "Vijaya");
		map.put(124, "Gaurav");
		map.put(125, "Claudio");
		
		System.out.println(map);
		System.out.println(map.get(123));
		System.out.println(map.containsKey(122));
		System.out.println(map.containsValue("Claudi"));
		map.put(124, "Blaise");
		System.out.println(map);
		map.replace(123, "Chris");
		System.out.println(map);
		map.putIfAbsent(126, "Ajay");
		System.out.println(map);
		
		
	}

}
