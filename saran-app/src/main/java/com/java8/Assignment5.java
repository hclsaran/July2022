package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
 class Employee {
	int id;
	String name;
	int age;
	String gender;
	String dept;
	int yearOfJoining;
	int salary;
}
public class Assignment5 {
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "John", 28, "Male", "IT", 2010, 80000));
		list.add(new Employee(2, "Ashley", 30, "Female", "IT", 2013, 50000));
		list.add(new Employee(3, "Kim", 26, "Female", "HR", 2011, 90000));
		list.add(new Employee(4, "Chris", 29, "Male", "Maintenance", 2020, 40000));
		list.add(new Employee(5, "Paul", 35, "Male", "Accounts", 2017, 60000));
		list.add(new Employee(6, "Karen", 30, "Female", "Maintenance", 2018, 60000));
		
		// Number of males and females in organization
				List<Employee> mList = list.stream().filter(e -> e.getGender().equals("Male"))// get Male gender objects
						.collect(Collectors.toList());// collect objects to create a list
				System.out.println("No. of males in the organization is :" + mList.size());

				List<Employee> fList = list.stream().filter(e -> e.getGender().equals("Female"))// get Female gender objects
						.collect(Collectors.toList());// collect objects to create a list
				System.out.println("No. of females in the organization is :" + fList.size());
				//Optimize your code
				Map<String,Long> maleandfemale=list
						.stream()
						.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
				System.out.println(maleandfemale);
				
	}

}
