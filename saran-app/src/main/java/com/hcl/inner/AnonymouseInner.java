package com.hcl.inner;

interface Product {
	public void getAllProducts();
}

public class AnonymouseInner {

	public static void main(String[] args) {
		Product p = new Product() {
			public void getAllProducts() {
				System.out.println("All products has been displayed");
			}

		};
		p.getAllProducts();

	}

}
