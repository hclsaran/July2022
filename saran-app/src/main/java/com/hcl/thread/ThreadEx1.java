package com.hcl.thread;

public class ThreadEx1 extends Thread{
	
	public void run() {
		System.out.println("My Thread is running");
		System.out.println("My Thread is Finished");
	}
	
	public static void main(String[] args) {//main method is your main method
		ThreadEx1 t1=new ThreadEx1();  //ChildThread
		t1.start();
		
		
	}

}
