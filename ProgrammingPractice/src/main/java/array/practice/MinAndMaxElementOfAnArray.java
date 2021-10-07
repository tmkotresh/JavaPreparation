package array.practice;

public class MinAndMaxElementOfAnArray {
	
	public static void minAndMaxOfAnArray(int[] arr, int n) {
		int min = arr[0];
		int max = arr[n-1];
		
		for(int i =0; i < n ; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		System.out.println("Min and Max elements are "+min+" "+max);
	}

	public static void main(String[] args) {
		int[] arr = {2,3,1,4,5,-1};
		minAndMaxOfAnArray(arr, arr.length);
  
	}

}
