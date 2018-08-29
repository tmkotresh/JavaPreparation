package ArrayPractice;

import java.util.Arrays;

import java.util.*;

public class TestArray {
	
	
	//Reverse an array in group of given size
	
	
	static void reverse(int arr[], int n, int k)
    {
		
		System.out.println("Sorted Array");
       
		int[] a = {1,4,3,5,7,8,9};
		
		//List<Integer> arrList = Arrays.asList(new Integer(a));
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 5));
		Arrays.binarySearch(a, 5);
		for(int an : a){
			System.out.print(an+" ");
		}
		
		System.out.println("-----------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		for (int i = 0; i < n; i += k)
        {
            int left = i;
            System.out.println("Left parameter value "+ left);
            // to handle case when k is not multiple
            // of n
           int right = Math.min(i + k - 1, n - 1);
           System.out.println("Right parameter value "+ right);
           System.out.println("Right - left  parameter value "+ (right-left));
           
           
           // int right =i+k-1;
            int temp;
             
           // if((right-left)-1 ==k){
            	 while (left < right)
                 {
                     temp=arr[left];
                     arr[left]=arr[right];
                     arr[right]=temp;
                     left+=1;
                     right-=1;
                 }
            //}
            // reverse the sub-array [left, right]
           
        }
    }
	
	
	public static void findMin(int[] arr){
		int minVal = arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<minVal){
				minVal= arr[i];
			}
		}
		System.out.println("Min val "+ minVal);
	}
	
	public static void findMax(int[] arr){
		int maxVal = arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>maxVal){
				maxVal= arr[i];
			}
		}
		System.out.println("Max val "+ maxVal);
	}
	
	public static void findNonDuplicate(int[] arr){
		int result =arr[0];
	   
	    for(int i:arr)
	    {
	        result ^= i;
	    }

	    System.out.println("Result is "+result);
	}

	public static void main(String[] args) {
		System.out.println("------------");
		
		
		//Array Store Exception example
		
//		Object[] intArr = new String[10];
//		intArr[0] = 5;
//		intArr[1] = "a";
//		
		//System.out.println(intArr[1]);
		
		
		String str[] = { "Geeks", "for", "Geeks" };
        for (int i = 0; i < str.length; i++)
            System.out.print(str[i]);
        
        int intstr[] = { 1,2,3 };
        for (int i = 0; i < str.length; i++)
            System.out.print(intstr[i]);
		
		
		
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
     
        int n = arr.length;
        
        System.out.println("-----"+ arr.length % k);
     
        reverse(arr, n, k);
        
        //loopArray(arr,k);
     
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        
        
    //}
		
//		int[][] data = {{123},{4,5,6}};
//		int[][] copy = data.clone();
//		
//		System.out.println(data[0][0]);
//		System.out.println(copy[0][0]);
//		
//		copy[1] = new int[]{300,400,500};
//		System.out.println(data[1][1]);
//		System.out.println(copy[1][1]);
//		
//	
//		int[] arr1 = {1,-2,3,-4,0,9,5};
//		
//		Arrays.sort(arr);
//		System.out.println("Length of an array "+arr1.length);
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.binarySearch(arr1, 9));
//	   
//		
//		List<Integer> arrList = new ArrayList<Integer>();
//		
//		for(int i:arr1){
//			arrList.add(i);
//		}
//		
//		Collections.reverse(arrList);
//		for(int i :arrList){
//			System.out.print(i);
//		}
//		
//		System.out.println("---------------");
//		findMin(arr1);
//		findMax(arr1);
//		
//		int[] arr2={1,2,1,3,3};
//		
//		findNonDuplicate(arr2);
		

	}
	
	private static int[] loopArray(int[] a, int k) {
		int i;
		int rem = a.length % k; //to fig out if any elements will be left at the end
		for(i = 0; i < a.length ; i = i + k) {
			a = reverseArray(a, i, i+k-1);
		}
		if(rem != 0) {
			reverseArray(a, a.length - rem, a.length - 1);
		}
		return a;
	}

	private static int[] reverseArray(int[] a, int start, int end) {
		int temp, i ,j;
		for(i = start, j = end; i < j && j < a.length ; i++, j--) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		return a;
	} 

}
