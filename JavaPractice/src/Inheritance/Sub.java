package Inheritance;

import java.io.FileNotFoundException;

public  class Sub extends Super {
 int index =2;
 
 public Sub(){
	 System.out.println("Inside Sub");
 }
 @Override
public void printVal() throws FileNotFoundException{
	 System.out.println("Sub");
 }

@Override
public void testabstract() {
	// TODO Auto-generated method stub
	
}
 
 
}
