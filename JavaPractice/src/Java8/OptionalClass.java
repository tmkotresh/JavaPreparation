package Java8;

import java.util.Optional;

public class OptionalClass {
	
	
	
	public static String name=null;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> op = Optional.ofNullable(name);
		System.out.println(op.toString());
		
		
		System.out.println();
		if(name.equals("Kotresh")) {
			System.out.println("Name is "+name);
		}

	}

}
