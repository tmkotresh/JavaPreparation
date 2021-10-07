package com.kotresh;

import java.util.stream.IntStream;

public class ParallelStreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();
		long counted = IntStream.rangeClosed(0,100000000).filter(i->i%2==0).count();
        long duration = System.currentTimeMillis()-startTime;
        System.out.println("Duration with sequential stream: "+ duration);
        
        long startTimewithParallel = System.currentTimeMillis();
		long countedwithParallel = IntStream.rangeClosed(0,100000000).parallel().filter(i->i%2==0).count();
        long durationwithParallel = System.currentTimeMillis()-startTimewithParallel;
        System.out.println("Duration with parallel stream: "+ durationwithParallel);
	}

}
