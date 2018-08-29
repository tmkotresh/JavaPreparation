import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;



class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		
		int len1 = s1.length();
		int len2 = s2.length();
		if(len1 > len2){
			return 1;
			
		}
		else if(len1 < len2){
			return -1;
		}
		return 0;
	}
	
}

class AlphabeticalComparator implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}
}



public class JavaFoundamentals {

	static void bubbleSortExample(int arr[]){
		int arrlen = arr.length;
		int temp=0;
		
		for(int i=0;i<arrlen;i++){
			for(int j=1;j<(arrlen-i);j++){
				if(arr[j-1]>arr[j]){
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		
	}
	
	static int factorial(int num){
		int result =1;
		while(num!=0){
			result = result*num;
			num--;
		}
		
		return result;
	}
    
	static boolean isPrime(int num){
		
		for(int i=2;i<num;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	
	static void stringReverse(String s){
		int n = s.length();
		char [] ch = new char[n];
		for(int i=0;i<n;i++) ch[i]=s.charAt(i);
		String revStr ="";
		
		for(int i = n-1;i>=0;i--) {
		
			revStr=revStr+String.valueOf(s.charAt(i));
		
		
		}
		System.out.println("Reverse String:"+ revStr);
	}
	
	
	static void fibonacci(int n){
		int num1=0, num2=1;
		
		for(int i =0;i<n ; i++){
			System.out.print(num1+" ");
			int sumOfprev2 = num1+num2;
			num1=num2;
			num2 = sumOfprev2;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//stringReverse("CTC");
		fibonacci(7);
	String ji = "100";
	
	ji="200";
	
	System.out.println("------"+ji);
	
		
		
		 
		
		String i ="iObject";
		String j =  new String ("iObject");
		
		if(i==j){
			System.out.println("Both i and j are equals");
		}else{
			System.out.println("Both i and j are not equal");
		}
		
		
		if(i.equals(j)) {
			System.out.println("Comparasion with equals and result is true");
		}
		
		
        String businessVal = null;
        String src = "HO/011/01100/1486";
        if(src!=null){
            int temp = src.indexOf("/");
                            int temp2 = src.indexOf("/", temp+1);
                            
           String unit = src.substring(0, temp) ;
           System.out.println(unit);
           businessVal= src.substring(temp+1, temp2);
           
           System.out.println(businessVal);
        }
		
        List<String> list = new ArrayList<>();
        
        list.add("Kotresh");
        list.add("T M");
        list.add("Kotresh");
        
        list.stream().forEach(str -> System.out.println("Values from List "+str));
        
        HashSet<String> set = new HashSet<>(list);
        
        set.stream().forEach(str -> System.out.println("Values from set" +str));
        
        HashSet<String> setObj = new HashSet<String> ();
        setObj.add("Kotresh");
       // setObj.addAll(null);
        setObj.add("Aparna");
        
        for(String s : setObj){
        	System.out.println("Set objects "+ s);
        }
		
		boolean val = isPrime(16);
		
		if(val){
			System.out.println("Prime number");
		}else System.out.println("Not a prime number");
		
		String name = "kotresh";
		stringReverse(name);
		
		System.out.println("\nFactorial of 5 is "+ factorial(5));
		int arr[] = {2,5,1,45,3,46};
		System.out.println("Before sorting "+Arrays.toString(arr));
		
		
		
		bubbleSortExample(arr);
		
		System.out.println("After sorting "+Arrays.toString(arr));
		
		
		int x=10,y=20;
		
		System.out.println(x+" "+y);
		
		x=x+y;
		
		y=x-y;
		
		x=x-y;
		
		System.out.println(x+" "+y);
		
		
	
	
	

} }

class Person{
	private int id;
	private String name;
	public Person(int id, String name) {
	
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString(){
		return "ID is "+ id +"; Name is : "+name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
