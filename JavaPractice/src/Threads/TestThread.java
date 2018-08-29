package Threads;

public abstract class TestThread implements Runnable{
	
	public static void main(String[] args){
		Thread t = new Thread();
		t.start();
		t.run();
		t.start();
		
		//t.wait();
		
	
	}

	//@Override
	public void run() {
		System.out.println("Thread");
		// TODO Auto-generated method stub
		
	}

}
