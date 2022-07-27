package com.hcl.thread;

public class ThreadEx3 {
	
	public static void main(String[] args) {
		Runnable r=new Runnable() { public void run() {
			System.out.println("Runnable is running");
			System.out.println("Runnable finished");
		}
	};
	Thread t=new Thread(r);
    t.start();
       Runnable r1=()->{
    	   System.out.println("Runnable Lamdba running");
    	   System.out.println("Runnable Lamdba finished");
    	   
       };
       Thread t1=new Thread(r1);
       t1.start();
	
	}

}
