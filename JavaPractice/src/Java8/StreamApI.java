package Java8;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamApI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"A","B","C","D","A","C"};
		
		
		 Supplier<Stream<String>> streamSupplier = () -> Stream.of("A", "B", "C", "D");
		  
		  
		Stream<String> stream = Arrays.stream(arr);
		
		System.out.println(stream.count());
		
		//System.out.println(streamSupplier.distinct().count());
		
		//before java 8
		
		for (String string : arr) {
			
			if(string.contains("A")) {
				System.out.println("Character present");
			}
			
		}
		
		// Java 8 feature
		
		System.out.println(stream.anyMatch(element -> element.contains("A")));
		

	}

}
