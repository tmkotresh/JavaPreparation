package Threads;

@FunctionalInterface

interface MyFunctionalInterface{
	int incrementByFive(int n);
}


public class Mythread {
  
	static int cnt=0;
	static void display(String s1,String s2){
		if(s2.length()<=1){
			cnt++;
			System.out.println(s1+s2);
		}else{
			for(int i=0;i<s2.length();i++){
				String x = s2.substring(i,i+1);
				String y = s2.substring(0,i);
				String z = s2.substring(i+1);
				display(s1+x,y+z);
			}
		}
	}
	
	static void testMethod() {
		System.out.println("Inside the test method");
	}
	
	public static void main(String[] args){
		
		System.out.println("Started");
		
		//Thread t = Thread.currentThread();
		//t.start();
		
		
		
		
		String val = "abc";
		System.out.println("The anagrams are ");
		display("",val);
		System.out.println("the anagrams count are "+cnt);
		
		MyFunctionalInterface f = (num)-> num + 5;
		
		System.out.println(f.incrementByFive(10));
		
		
	}

}
