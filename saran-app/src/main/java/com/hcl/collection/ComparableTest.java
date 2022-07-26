package com.hcl.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
 * Comparable Interface-> compareTo(Object) 
 * you can sort elements on the basis of single data member only
 * compareTo-> postive integers,if the current obj > specified obj
 *             negative integer,if the current obj < speificed obj
 *             zero-> current is equal to the specififed obj
 *             
 *             try < and > on the prdPrice
 * 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
class Product implements Comparable<Product>{
	int prdId;
	String prdName;
	int prdPrice;
	
	public int compareTo(Product p) {
		if(prdPrice == p.prdPrice) {
			return 0;
		}
		else if(prdPrice < p.prdPrice) {
			return 1;		
		}
		else
			return -1;
	}
	 
	
	
	
}

public class ComparableTest {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<>();
		list.add(new Product(113,"Laptop",1000));
		list.add(new Product(111,"Desktop",500));
		list.add(new Product(112,"Mouse",10));
		
		Collections.sort(list);
		list.forEach(System.out::println);
		
		
		
	}
	

}
