package com.kotresh;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class ReduceOperation {

	public static void main(String[] args) {
		String[] words = new String[] { "expect", "salad", "blow", "harmony", "committe", "manage", "field", "flavor" };
        
		// Find largest word using Stream
		String largestWord = Arrays.stream(words).reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get();
		System.out.println("Largest Word " + largestWord);
		
		// Sum of Length of all words
		
		OptionalInt sumOfLengths = Arrays.stream(words).mapToInt(w -> w.length()).reduce((w1,w2)->w1+w2);
		System.out.println(sumOfLengths.getAsInt());
	    
		// Combine all the words
		
		String combinedWord = Arrays.stream(words).reduce((w1, w2) -> w1+"--"+w2).get();
		System.out.println("Combined word "+ combinedWord);
		
		// Simple Concatenating
		
		String concatinatedWord = Arrays.stream(words).collect(Collectors.joining());
		System.out.println("Simple Concatination: "+concatinatedWord);
		
		// Concatination with Delimiter
		
		String concatinationWithDelimiter = Arrays.stream(words).collect(Collectors.joining("||"));
		System.out.println("Concatination with Delimieter: "+concatinationWithDelimiter);
		
		// Concate words with suffix and Prefix
		
		String wordsWithSuffixAndPrefix = Arrays.stream(words).collect(Collectors.joining(" ","Begining- "," -Ending"));
		System.out.println("Words with Suffix and Prefix : "+wordsWithSuffixAndPrefix);
		
		//Partitioning words by their length even or not
		
		Map<Boolean,List<String>> part = Arrays.stream(words).collect(Collectors.partitioningBy(w -> w.length()%2==0));
		System.out.println("Word partinioned By even or odd length: "+part);
	}
}
