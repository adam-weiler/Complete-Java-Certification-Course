package com.jobready.threading;

public class Application {
	
	public static void main(String args[]) {
		System.out.println("Starting Thread 1");  // Runs this line first.
		
		Task1 taskRunner = new Task1("Thread-A");
		taskRunner.start();  // Starts this line, but..
		
		System.out.println("Starting Thread 2");  // .. moves on to this line. Doesn't wait for start() to complete.
		
		
//		taskRunner.start();  // Illegal. Cannot start a thread more than once.
		
		
		Task1 taskRunner2 = new Task1("Thread-B");
		taskRunner2.start();  // These numbers get mixed in with previous numbers.
		
		
		
		
		System.out.println("Starting Thread 3");  // Runs this line first.
		
//		Task2 taskRunner3 = new Task2("Thread-C");
//		Thread t3 = new Thread(taskRunner3);  // This way..
		
		Thread t3 = new Thread(new Task2("Thread-C")); // .. or this way.
		
		t3.start();  // Starts this line, but..
		
		System.out.println("Starting Thread 4");  // .. moves on to this line. Doesn't wait for start() to complete.
		
				
//		Task2 taskRunner4 = new Task2("Thread-D");
//		Thread t4 = new Thread(taskRunner4);  // This way..

//		Thread t4 = new Thread(new Task2("Thread-D")); // .. or this way...
		
		Thread t4 = new Thread(new Runnable() {  // .. or this way.
			
			@Override
			public void run() {
				Thread.currentThread().setName("Anonymous Thread");
				
				for(int i=0; i < 500; i++) {
					System.out.println("Number: " + i + " - " + Thread.currentThread().getName());  // ie: Number: 1 - Thread-0
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		t4.start();  // These numbers get mixed in with previous numbers.
	}
	
}


class Task1 extends Thread {  // This allows multithreading.
	
	String name;
	
	public Task1(String name) {
		this.name = name;
	}

	public void run() {
		this.currentThread().setName(this.name);
		
		for(int i=0; i < 500; i++) {
			System.out.println("Number: " + i + " - " + Thread.currentThread().getName());  // ie: Number: 1 - Thread-0
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


class Task2 implements Runnable {  // This disables the multithreading, unless we define it differently above.
	
	String name;
	
	public Task2(String name) {
		this.name = name;
	}

	public void run() {
		Thread.currentThread().setName(this.name);
		
		for(int i=0; i < 500; i++) {
			System.out.println("Number: " + i + " - " + Thread.currentThread().getName());  // ie: Number: 1 - Thread-0
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}