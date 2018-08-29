package DesignPattern;

public class TestDesignPatternClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Singleton instance = Singleton.getInstance();
		
		System.out.println("First Instance "+instance.hashCode());
		
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println("Second Instance "+instance2.hashCode());
		
		
	}

}
