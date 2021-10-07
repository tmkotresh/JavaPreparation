package array.practice;

public class SortArrays0s1sAnd2s {
	
	public static void sortArray(int[] arr, int n) {
		int count0=0;
		int count1=0;
		int count2=0;
		
		for(int i =0;i<n;i++) {
			if(arr[i]==0) count0++;
			else if(arr[i]==1)count1++;
			else if(arr[i]==2) count2++;
			
		}
		
		for(int i =0;i<count0;i++) {
			arr[i]=0;
		}
		for(int i=count0;i<(count0+count1);i++) {
			arr[i]=1;
		}
		for(int i=(count0+count1);i<n;i++) {
			arr[i]=2;
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,0,2,1,0,2};
		sortArray(arr,arr.length);
		for(int a : arr)
			System.out.print(a+" ");

	}

}
