
public class MinAndMaxInAnArray {
	
	public static int findMaxValue(int[] arr){
		int maxValue = arr[0];
		
		for(int a : arr){
			if(a>maxValue) maxValue=a;
			
		}
		System.out.println("Max Value "+ maxValue);
		return maxValue;
	}
	
	public static int findMinValue(int[] arr){
		int minValue = arr[0];
		
		for(int a : arr){
			if(a<minValue) minValue=a;			
		}
		System.out.println("Min Value "+ minValue);
		return minValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = { 10,2,15,6,7};
		findMaxValue(a);
		findMinValue(a);

	}

}
