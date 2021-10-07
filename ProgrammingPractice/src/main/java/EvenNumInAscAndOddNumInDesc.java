import java.util.Arrays;

public class EvenNumInAscAndOddNumInDesc {
	
	public static void  sortArr(int[] arr, int n) {
		for(int i =0;i<n;i++) {
			if(arr[i]%2!=0) {
				arr[i]*=-1;
			}
		}
		
		Arrays.sort(arr);
		
		for(int i =0;i<n;i++) {
			if(arr[i]%2!=0) {
				arr[i]*=-1;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		sortArr(arr,7);
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
