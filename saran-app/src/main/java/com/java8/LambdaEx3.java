package com.java8;

import java.util.function.Predicate;

public class LambdaEx3 {
	@FunctionalInterface
	interface Vehicle{
		void speed();
		default void speed2() {}
		static void speed3() {}
	}
	/*Predicates -> return the boolean values(two arg(Object,Object)
	 * 
	 */
	
	public static void main(String[] args) {
		
		Predicate<String> p=(s)->s.length()>0;
		p.test("dylan");  //true
		p.negate().test("dylan");  //false
		Predicate<String> isEmpty=String::isEmpty;
	//	System.out.println(isEmpty);
		Predicate<Integer> p1=i->(i>10);
		Predicate<Integer> p2=i->(i<20);
		boolean result=p1.and(p2).test(15);
		boolean result2=p1.and(p2).negate().test(15);
		System.out.println(result);
		System.out.println(result2);
		
		
		
	}

}
