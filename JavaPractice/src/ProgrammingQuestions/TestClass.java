package ProgrammingQuestions;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacii(5);
	}
	
	static void fibonacii(int n){
		
	  int result =0;
	  
	  while(n!=0){
		  result = result+n;
		  System.out.println(result);
		  n--;
	  }
		
	}

}
