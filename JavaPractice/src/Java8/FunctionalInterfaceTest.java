package Java8;

public class FunctionalInterfaceTest implements Runnable {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Before Java 8
		
		Thread t = new Thread(new FunctionalInterfaceTest());
		
		t.start();
		
		Thread t1 = new Thread(()-> System.out.println("Thread is running using java 8"));
		t1.start();
		
		

	}


	@Override
	public void run() {
		System.out.println("Before Java 8 feature");
		
	}
	
	

}
