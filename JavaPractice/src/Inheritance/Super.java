package Inheritance;

import java.io.IOException;

public  abstract class Super {
	int index = 5;
	public Super(){
		System.out.println("Inside Super");
	}
	public void printVal() throws IOException{
		System.out.println("Super");
		}
	
	public  abstract void testabstract();

}
