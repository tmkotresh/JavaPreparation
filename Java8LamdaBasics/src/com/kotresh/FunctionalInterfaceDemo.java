package com.kotresh;

public class FunctionalInterfaceDemo {
	SampleFunctionalInterface sampleFunctionalInterface = (a,b) -> a+b;
	
	int sum = sampleFunctionalInterface.sum(5,6);
	
	

}
