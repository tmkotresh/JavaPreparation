import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import java.lang.ref.*;

import java.util.*;

public class TestPreparation  {
	

	
	

	public static int getX() {
		return x;
	}

	public static void setX(int x) {
		TestPreparation.x = x;
	}

	static int x =10;
	
	//List<Object> a = new ArrayList<Object>(String);
	
	
	public static void calSumProd(){
		int num = 123, sum=0,prod=1,n;
		
		System.out.println("Inside method ");
		
		while(num > 0){
			System.out.println("inside while loop");
		     n = num%10;
			sum = sum+n;
			prod = prod * n;
			num = num/10;
			
			
		}
		
		System.out.println("Sum "+sum);
		System.out.println("Product of number "+ prod);
	}
	
	private static String findDuplicateString(String[] arr){
		
		int j =10;
		
		HashSet<String> hashSet = new HashSet<String>();
		
		for(int i=0;i<arr.length;i++){
			if(!hashSet.add(arr[i])){
				String duplicate = arr[i];
				return  arr[i];
			}
		}
		
		return null;
	}
	
	private void doCalculation(){
		TestPreparation t = new TestPreparation();
		TestPreparation.getX();
	}
	
	
	static void findSum(int ar[], int n){
		for(int i =0;i<ar.length;i++){
			for(int j=i+1;j<ar.length;j++){
				if(ar[i]+ar[j]==n){
					System.out.println("The sum of "+ar[i]+" and "+ar[j]+" = "+n);
				}
			}
		}
	}
	
	
	static void decimaltobinary(int n ){
int[] binaryNum = new int[10];
		
		int i =0;
		while(n>0){
			binaryNum[i] = n%2;
			n=n/2;
			i++;
		}
		
		for(int j= i-1;j>=0;j--){
			System.out.print(binaryNum[j]);
		}
		System.out.println(" ");
	}
	
	
	
	public static void main(String[] args){
		
		String str ="NoValue";
		
		Integer intVal = Integer.parseInt(str);
		
		System.out.println(intVal);
		
		
		
		decimaltobinary(10);
		Integer a = new Integer(10);
		System.out.println("Binary Format of "+a+" "+ a.toBinaryString(a));

         String binaryString1 = "1010";
         String bindayString2 = "1100";
         
         Integer a1 = Integer.parseInt(binaryString1, 2);
         Integer a2 = Integer.parseInt(bindayString2, 2);
         System.out.println(a1+a2);
		
	
		int[] ar = { 1,2,3,4,5,7};
		
		int n = ar.length+1;
	    int sum =0;
	    for(int b : ar){
	    	sum+=b;
	    }
		
	    
	    int sumOfArr = n * ((n+1)/2);
	    
	    System.out.println("Missing Number "+(sumOfArr-sum));
	    
	    
		//findSum(ar,8);
		


		
//		Arrays.sort(ar);
//		System.out.println(ar[ar.length-2]);
		
		int largest = ar[0];
		
		int secondLargest= ar[0];
		
		for(int an : ar){
			if(an>largest) largest =an;
		}
		
		for(int ab : ar){
			if(ab<largest && ab >=secondLargest){
				secondLargest = ab;
			}
		}
		
		System.out.println(secondLargest);
		
		
//		TestPreparation t = new TestPreparation();
//		t.doCalculation();
		
		//calSumProd();
		
//		int[] arr ={1,2,3,4,5,6,7,9};
//		
//		String [] str = {"Aprna","kotresh","Aparna","Aparna"};
//		
//		String duplicate = findDuplicateString(str);
//		
//		System.out.println("Duplicate string in array ----------- "+ duplicate);
//		
//		int n = arr.length+1;
//		
//		int sum = (n*(n+1))/2;
//		System.out.println(sum);
//		int result =0;
//		
//		for(Integer arrSum: arr){
//			result+=arrSum;
//			
//		}
//		
//		for (String strAr : str){
//			System.out.println(strAr);
//		}
//		System.out.println(result);
//		
//		int missingNum = sum-result;
//		
//		System.out.println("Missing number in array "+ missingNum);
		
	
		
		
		
		
		
		
		
	}

}
