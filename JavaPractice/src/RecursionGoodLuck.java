
public class RecursionGoodLuck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Summation(2000));
		System.out.println(Factorial(5));
		System.out.println(Exponentiation(5,3));
	}
	
	public static int Summation(int n){
		if(n<=1){
			return 0;
		}else{
			return n+Summation(n-1);
		}
	}
	
	public static int Factorial(int n){
		if(n<=1){
			return 1;
		}else{
			return n*Factorial(n-1);
		}
	}
	
	public static int Exponentiation(int n,int p){
		if(p<=0){
			return 1;
		}else{
			return n * Exponentiation(n,p-1);
		}
		
	}

}
