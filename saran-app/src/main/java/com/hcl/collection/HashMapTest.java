package com.hcl.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
class Student{
	int stuId;
	String stuName;
	int stuSal;
}
public class HashMapTest {
	/*
	 * When you use HashMap it will throw ConcurrentModificationException 
	 * whereas if you replace HashMap with ConcurrentHashMap then it will both read and 
	 * write operations simultaneously
	 * Java Collection are fail-fast 
	 */
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		Map<Student,Integer> stuMap=new TreeMap<>((o1,o2)->(o2.getStuSal()-o1.getStuSal()));
		stuMap.put(new Student(111,"Hadiqa",50000), 60);
		stuMap.put(new Student(222,"Huy",60000), 90);
		stuMap.put(new Student(333,"Justin",70000), 40);
		stuMap.put(new Student(444,"Sumaiya",80000), 110);
		System.out.println(stuMap);
		
		List<Entry<String,String>> entries=new ArrayList<>(map.entrySet());
		System.out.println("-------------------------------------------------");
		Collections.sort(entries,(o1,o2)->o1.getKey().compareTo(o2.getKey()));
		stuMap.entrySet().stream()
		                 .sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getStuName).reversed()))
		                 .forEach(System.out::println);
		                 
		
		
		
		
	/*	Iterator<String> itr=map.keySet().iterator();
		while(itr.hasNext()) {
			String key=itr.next();
			System.out.println("Map Value :"+map.get(key));
			if(key.equals("2")) {
				map.put("4", "4");
			}
			
		}*/
		
		 
		
		
	}

}
