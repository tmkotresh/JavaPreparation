package Threads;

import java.io.IOException;

public class ThreadBehaviour {

	public static void main(String[] args) throws IOException {
		
		Thread thread1 = new Thread(()-> System.out.println("Thread from Runnable interface"));
		System.out.println(thread1.getState());
		thread1.start();
		System.out.println(thread1.getState());
		try {
			thread1.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(thread1.getState());
		
		Thread t1 = new Thread(new A(), "1");
		Thread t2 = new Thread(new A(), "2");
		Thread t3 = new Thread(new A(), "3");

		t1.start();
		try {
			t1.join();
		} catch (Exception e) {

		}
		t2.start();
		try {
			t2.join();
		} catch (Exception e) {

		}
		t3.start();
		try {
			t3.join();
		} catch (Exception e) {

		}

	}
}

class A implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
