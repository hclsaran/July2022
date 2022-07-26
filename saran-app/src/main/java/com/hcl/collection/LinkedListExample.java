package com.hcl.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	//uses a doubly linked list to store the elements
	//duplicate elements;insertion order
	//maniuplating is faster...Retrieving is slower
	public static void main(String[] args) {
		List<String> linked=new LinkedList<>();
		linked.add("Justin");
		linked.add("John");
		linked.add("Justin");
		linked.add("Ryyan");	
		Iterator<String> itr=linked.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	} 

}
