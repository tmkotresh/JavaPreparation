package TimeAndSpaceComplexcity;

import java.time.ZoneId;
import java.util.concurrent.atomic.AtomicLong;

public class RunTimePractice {
	
	public static AtomicLong nextNumber = new AtomicLong();
	
	
	public static int findRepetations(String s, char c){
		int sum=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==c){
				sum++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();
		System.out.println(findRepetations("abcaslkghslkhgslkjglkdshglksgjlsja;jgoiewwlglkwhglkwhgoiwhglwgnlkwjlwaksahgowhglhalkghalkgheoihwlwlhglkwhgwihgahjlkghalkhgalhgoiehlglkag", 'a'));
		
		long endTime = System.currentTimeMillis();
		
		long duration = endTime-startTime;
		System.out.println("Test "+ duration + "ms");
		
		for(int i= 0;i<10;i++){
			long num = nextNumber.incrementAndGet();
			System.out.println("Next number is "+num );
		}
		
		String joined = String.join("/", "kotresh","T M","Oracle");
		System.out.println(joined);
		
		String ids = String.join(", ", ZoneId.getAvailableZoneIds());
		System.out.println(ids);
		

	}

}
