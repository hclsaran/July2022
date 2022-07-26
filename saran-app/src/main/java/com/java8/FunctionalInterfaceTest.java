package com.java8;

interface Calculator {
	int add(int a, int b);
}

public interface FunctionalInterfaceTest {

	void call1();

	default void call2() {
		System.out.println("calling call2 method");
	}

	static void call3() {
		System.out.println("calling static method");
	}

}

class CalculatorImpl {

	public static void main(String[] args) {
		Calculator cal = (x, y) -> x + y;
		System.out.println(cal.add(2, 3));
		Calculator cal2 = (a, b) -> {
			return (a + b);
		};
		System.out.println(cal2.add(3, 4));

	}

}
