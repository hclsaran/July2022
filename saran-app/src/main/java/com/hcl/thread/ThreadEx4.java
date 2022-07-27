package com.hcl.thread;

public class ThreadEx4 {
	
	public static void main(String[] args) {
		 Runnable r1=()->{
	    	   String threadName=Thread.currentThread().getName();
	    	   System.out.println(threadName+" is running");
	    	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   
	    	System.out.println(threadName + "finished");
	       };
	       Thread t=new Thread(r1,"Saran Thread");
	       t.start();
	       Thread t1=new Thread(r1,"Hadiqa Thread");
	       t1.start();
	       Thread t2=new Thread(r1,"Bradan Thread");
	       t2.start();
	}

}
