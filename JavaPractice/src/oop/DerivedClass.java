package oop;

public class DerivedClass extends BaseClass {
	
	public void add(int a,int b){
		System.out.println("Inside derived class "+a+b);
	}
	
	
	public static void main(String[] args){
		BaseClass obj = new DerivedClass();
		
		obj.add(5, 6);
	}
	

}
