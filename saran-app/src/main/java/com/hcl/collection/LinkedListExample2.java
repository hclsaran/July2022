package com.hcl.collection;

import java.util.LinkedList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Book{
	
	private int bkId;
	private String bkName;
	
	
}

public class LinkedListExample2 {
	//Collection doesn't support primitive data type

	
	public static void main(String[] args) {
		
		List<Book> list=new LinkedList<>();
		Book b1=new Book(111,"Thinking in Java");
		Book b2=new Book(222,"Thinking in SpringBoot");
		Book b3=new Book(333,"Thinking in Maven");
		Book b4=new Book(444,"Thinking in Angular");
		list.add(b1);list.add(b2);list.add(b3);list.add(b4);
		
		for(Book book:list) {
			System.out.println(book.getBkId()+book.getBkName());
		}
		
		Book b22=new Book();
		b22.setBkId(123);
		System.out.println(b22);
		
		
		
	}

}
