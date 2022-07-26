package com.hcl.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



/*
 * TreeSet-> contains unique elmenents
 * retrieval time are fast
 *  doesnt allow null elements
 *  not a thread safe(not synchronized)
 *  maintains the ascending order
 *  
 *  
 */
public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		
	
		/*set.forEach(System.out::println); functional programming
		 Iterator<String> itr=set.descendingIterator();  imperartive programming
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }*/
		 
	/*	 System.out.println("Lowest Value :"+set.pollFirst());
		 System.out.println("Highest Value :"+set.pollLast());*/
		 System.out.println("Inital Set" +set);
		 System.out.println("Reverse the Set"+ set.descendingSet());
		 System.out.println("head set "+set.headSet("C",true));//prints only A,B<C
		 System.out.println("Sub set "+set.subSet("A",false,"E",true));
		 
		 System.out.println("Tail Set"+set.tailSet("C",false));
		 
		
	}

}
