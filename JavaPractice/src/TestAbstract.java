import java.math.BigInteger;

public abstract  class  TestAbstract {
	
	public TestAbstract(){
		
	}
	
	static void checkPrime(BigInteger b){
		
		System.out.println(b.isProbablePrime(5));
	}
	
	
	
	private static int maxConsecutiveOnes(int x)
    {
		
		
        // Initialize result
        int count = 0;
 
        // Count the number of iterations to
        // reach x = 0.
        while (x!=0)
        {
            // This operation reduces length
            // of every sequence of 1s by one.
            x = (x & (x << 1));
 
            count++;
        }
 
        return count;
    }

	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
	
		int n =5;
		String binary = Integer.toBinaryString(n);
		System.out.println(binary);
		
		String name = "kotresh";
		System.out.println("----"+name);
		
	
		
		String anotherName = name;
		
		anotherName = " Hi "+ anotherName;
		
		System.out.println(anotherName);
		
		System.out.println("----"+name);
		
		
		char[] ch = name.toCharArray();
		String rev ="";
		for(int i=ch.length-1;i>=0;i--){
			rev +=ch[i]; 
		}
		
		System.out.println("reverse "+ rev);
		
		StringBuilder sb = new StringBuilder(name);
		System.out.println(sb.reverse());
		
		
		int[] arr = {1,2,3,5,6};
		
		int len = arr.length+1;
		
		System.out.println("len "+ len);
		
		int sum = len*(len+1)/2;
		int result =0;
		
		for(int a : arr ){
			result+=a;
		}
		
		System.out.println("Result "+result);
		System.out.println("Sum "+ sum);
		
		System.out.println("missing number "+(result-sum));
		
		int num = 121;
		int temp = num;
		int rem; int  sumVal =0; int div;
		while(num>0){
			rem = num%10;
			sumVal = (sumVal *10)+rem;
			num = num/10;
			
		}
		
		System.out.println("result "+ sumVal);
		System.out.println(num);
		
		if(sumVal==temp){
			System.out.println("Palidrome");
		}
		
		
    }
}  
	
	



