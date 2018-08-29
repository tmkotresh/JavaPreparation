package Inheritance;

import java.io.IOException;

public class InheritanceTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Super obj = new Sub();
		System.out.println(obj.index);
		try {
			obj.printVal();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new IOException();
		}

	}

}
