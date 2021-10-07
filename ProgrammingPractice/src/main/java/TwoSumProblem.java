import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

	// BruteForceApproach
	public static int[] twoSumUsingBruteForce(int[] arr, int target) {
		int[] resultArr = new int[2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					resultArr[0] = i;
					resultArr[1] = j;
				}
			}
		}
		return resultArr;
	}

	// Optimal Solution
	public static int[] twoSumUsingOptimalApproach(int[] nums, int target) {
      Map<Integer,Integer> intMap = new HashMap<>();
		
		for(int i =0;i<nums.length;i++) {
			if(intMap.containsKey(target-nums[i])) {
				return new int[] {intMap.get(target-nums[i]),i};
			}
			intMap.put(nums[i],i);
		}
		
		
		return new int[] {0,0};
        
	}
	
	//O(N) problem
	
	public static boolean isPairSum(int[] arr, int x) {
		int n = arr.length;
		
		for(int i =0;i<n;i++) {
			int left =i;
			int right = n-1;
			
			while(left<right) {
				if(arr[left]+arr[right]==x) {
					System.out.println(arr[left]+" "+arr[right]);
					return true;
				}
				if(arr[left]+arr[right]<x) {
					left++;
				}else {
					right--;
				}
			}
					
		}
		
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 9, 7, 2, 1,10 };
		int[] result = twoSumUsingBruteForce(arr, 11);
		int[] resultUsingOptimalSol = twoSumUsingOptimalApproach(arr, 11);
		System.out.println("Two indices which match the target 9 are " + result[0] + " " + result[1]);
		System.out.println("Two indices which match the target 9 using Optimal Sol are " + resultUsingOptimalSol[0]
				+ " " + resultUsingOptimalSol[1]);
		System.out.println("is Pair sum present for target 9 ? "+ isPairSum(arr, 11));

	}

}
