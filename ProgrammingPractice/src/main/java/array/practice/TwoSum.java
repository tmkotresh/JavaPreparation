package array.practice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] result = sumOfTwo(nums,target);
		System.out.println(result[0]);
		System.err.println(result[1]);
	}
	
	static int[] sumOfTwo(int[] nums, int target) {
		Map<Integer,Integer> intMap = new HashMap<>();
		
		for(int i =0;i<nums.length;i++) {
			if(intMap.containsKey(target-nums[i])) {
				return new int[] {i,intMap.get(i)};
			}
			intMap.put(nums[i],i);
		}
		
		
		return null;
	}

}
