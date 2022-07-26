package com.hcl.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Comparator-> java.util package and compare(obj1,obj2)
 *     compare(o1,o2)
 *     equals(obj)
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee {
	int empId;
	String empName;
	int empAge;
}

class AgeComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		if (e1.empAge == e2.empAge) {
			return 0;
		} else if (e1.empAge > e2.empAge) {
			return 1;
		} else
			return -1;
	}
}

class NameComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		 return e1.empName.compareTo(e2.empName);
	}
}

public class ComparatorExample {
	
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(111,"Taylor",27));
		list.add(new Employee(222,"Dylan",25));
		list.add(new Employee(333,"Ashley",26));
	System.out.println("Sort by empName");
	/*Collections.sort(list,new NameComparator());
	list.forEach(System.out::println);//functional programmming
	
	 
	System.out.println("Sort by empAge");
	Collections.sort(list,new AgeComparator());
	list.forEach(System.out::println);*/
	
 Collections.sort(list,(s1,s2)->s1.getEmpName().compareTo(s2.getEmpName()));
		
	}

}
