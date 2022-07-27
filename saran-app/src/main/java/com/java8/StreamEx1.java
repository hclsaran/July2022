package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {
	/*
	 * Stream-> sequence of object from a source(input from Collections, or Arrays
	 * support -> aggregate operations(filter,map, reduce,find match et
	 * most of the stream operations are called as intermediate operatoin
	 * stream()->return the sequential stream
	 * parrallelStream()-> 
	 * 	 */
	
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(3,2,2,3,7,3,5);
		//get the list of square the unique numbers
		
		List<Integer> squareList=numbers
				.stream()
				.map(s->s*s).distinct().collect(Collectors.toList());
		
		System.out.println(squareList);
		
		//Wanted to reduce the size of a stream
		//Generate a Random numbers->wanted to limit only upto 20;
		Random r=new Random();
		r.ints().limit(2).forEach(System.out::println);
		
		//Parallel stream
		List<String> list=Arrays.asList("abc","","bc","efg","","abcd","jdkl");
		//count the empty string
		long count=list.parallelStream().filter(s->s.isEmpty()).count();
		System.out.println(count);
		
	    String[] arr= {"Welcome","To","Java"};
	    //Arrays.stream is used to get a sequential stream from the array passed as a parameter
	    //It return a sequential stream
	    Stream<String> stream=Arrays.stream(arr);
	    stream.forEach(System.out::println);
	    //Stream.of method returns a  sequential ordered stream() whose elements are specified as values
	    //Stream.of() it calls internally the Arrays.stream() method
	    Stream<String>  stream2=Stream.of(arr);
	    stream2.forEach(System.out::println);
	    
	    int arr1[]= {1,2,3,4,5};
	    IntStream stream4=Arrays.stream(arr1);
	    stream4.forEach(System.out::println);
	    //convert int array to stream
	     Stream<int[]> stream3=Stream.of(arr1);
	     IntStream stream5=stream3.flatMapToInt(Arrays::stream);
	     stream5.forEach(s->System.out.print(s+""));
		//Arrays.stream() method only works for primitive works
	     //Stream.of() method return genericStream of type T
	     //Assignment 5 you can do it in different ways. Optimized way? Java8 optimize
	}

}
