package com.kotresh;

import java.util.Arrays;
import java.util.Comparator;

public class StreamWithPrimitive {

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5,76,92,54,-235,89,8,200};
		
		Arrays.stream(arr)
		.map(i -> i *2)
		.forEach(i -> System.out.print(i+" "));
		// Print sum of all integers in an array
		
		int result = Arrays.asList(arr).stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of All numbers : "+result);
		
		Integer intVal = Arrays.stream(arr)
				.min(Comparator.naturalOrder()).get();
		System.out.println("MiniMum Val in Integer"+intVal);
		
		Integer maxVal = Arrays.stream(arr).max(Comparator.naturalOrder()).get();
		System.out.println("Maximum value in given array : "+maxVal);
		
		boolean isNegativeNumber = Arrays.stream(arr)
				.anyMatch(i -> i<0);
		System.out.println("Number smaller than 0 ?"+isNegativeNumber);

	}

}
