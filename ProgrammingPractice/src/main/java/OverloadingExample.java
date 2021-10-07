
public class OverloadingExample {
	
	public void add(int a, int b) {
		System.out.println("Inside int"+a+b);
	}
	
	public void add(float a,float b) {
		System.out.println("Inside float"+a+b);
	}
	
	public static void main(String[] args) {
		OverloadingExample obj = new OverloadingExample();
		
		obj.add(3f, 2);
	}

}
