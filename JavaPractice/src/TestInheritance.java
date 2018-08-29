

public class TestInheritance  {
	
	public void  method1(Object o) {
		System.out.println("Inside parent class");
	}
	
	void method2(){
		System.out.println("Inside Parent non static method");
	}
	
	public static void main(String [] args){
	 
		TestInheritance t = new A();
		t.method1("abc");
		
		//TestInheritance t1 = new B();
		//t1.method2();
	    
		
	}


}

 class A extends TestInheritance{
	 public void  method1(String s) {
			System.out.println("Inside child class");
		}
 
	 
		
}
 
 
 class B extends TestInheritance{
	 @Override
	void method2(){
			System.out.println("Inside child non static method");
		}
	 
		
}