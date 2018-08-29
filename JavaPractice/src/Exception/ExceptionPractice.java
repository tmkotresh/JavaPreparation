package Exception;

public class ExceptionPractice {
	
	
	
	
	static int tryfinalyTest() {
		try {
			return 1;
		} catch (Exception e) {
			return 2;
		}finally {
			return 3;
		}
	}
	
	static int trycatchTest(){
		int i =0;
		try{
			System.out.println("Inside try");
			int n = 5/i;
			return n;
		}catch(ArithmeticException e){
			System.out.println("Inside Catch Block");
			return 3;
		}finally{
			System.out.println("Inside finally block");
			return 5;
		}
		
	}
	
	public static int assignment() {
	    int number = 1;
	    try {
	       System.out.println("Inside try block");
	    	number = 3;
	        if (true) {
	            throw new Exception("Test Exception");
	        }
	        number = 2;
	    } catch (Exception ex) {
	    	 System.out.println("Inside catch block");
	        return number;
	    } finally {
	    	System.out.println("Inside finally block");
	        number = 4;
	       // return number;
	    }
	    //System.out.println("outside try block");
	    return number;
	}
	 
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			int i = 1/0;
		}catch(Throwable e) {
			
			System.out.println("Using throwable "+ e.getMessage());
		}
		
		int val = tryfinalyTest();
		
		System.out.println("Result from tryfinallyTest "+val);
		
		System.out.println(assignment());
		
		int n = trycatchTest();
		
		System.out.println(n);
		
		
		
		
		
		int num=0;
//		try{
//			num++;
//			System.out.println("test");
//			throw new Exception();
//			
//		}catch(Exception e){
//			num++;
//		}
		
		System.out.println("Number value "+ num);
		
//		try{
//			System.out.println("Inside the try block");
//			int i = 2;
//			int result = i/0;
//			System.out.println("After exception occured");
//		}catch(Exception e){
//			System.out.println("Inside the catch block "+e);
//		}
//		
//		System.out.println("After catch block");

	}

}
