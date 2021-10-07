package array.practice;

public class MaximumSumOfKDigits {
	
	public static int maximumSumOfK(int[] arr, int n, int k) {
		int max_sum = 0;
		int window_sum=0;
		for(int i =0;i<k;i++) {
			window_sum+=arr[i];
		}
		max_sum = window_sum;	
		for(int i =k ; i<n;i++) {
			max_sum += arr[i]-arr[i-k];
			max_sum = Math.max(max_sum, window_sum);
		}
				
		return max_sum;
	}

	public static void main(String[] args) {
		
		int[] arr = {100,200,300,400};
		System.out.println("Maximum Sum of for K elements "+ maximumSumOfK(arr, arr.length, 2));
		

	}

}
