package DataStructures;

public class BubbleSort {
	
	
	public static void sortUsingBubbleSort(int[] arr){
		int temp =0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a ={2,3,-1,1,5};
		System.out.println("Sort array using buuble sort");
		
		sortUsingBubbleSort(a);
		
		System.out.println(java.util.Arrays.toString(a));

	}

}
