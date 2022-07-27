package com.hcl.thread;

public class ThreadEx5 implements Runnable {
	private boolean stopRequested = false;

	public void run() {
		System.out.println("My Thread Ex5 is running");
		while(!isStopRequested()) {
			sleep(2000);
			System.out.println("...");
		}
		System.out.println("My Thread Ex5 is Finished");
	}
	
	public synchronized void requestStop() {
		this.stopRequested=true;
	}

	public synchronized boolean isStopRequested() {
		return this.stopRequested;
	}

	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ThreadEx5 t=new ThreadEx5();
		Thread t1=new Thread(t,"Claudio Thread");
		t1.start();
		 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("requesting stop");
		t.requestStop();
		System.out.println("Ex5 is Stopped");
		
	   
	}

}
