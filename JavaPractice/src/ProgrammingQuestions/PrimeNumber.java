package ProgrammingQuestions;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, isPrime, n;
        System.out.println("All Prime Numbers Between 1 to 100");
 
        // For every number between 2 to 100, check
        //  whether it is prime number or not
        for (i = 2; i <= 100; i++) {
            isPrime = 0;
            // Check whether i is prime or not
            for (j = 2; j <= i / 2; j++) {
                // If any number between 2 to i/2 divides i
                // completely then i cannot be prime number
                if (i % j == 0) {
                    isPrime = 1;
                    break;
                }
            }
 
            if (isPrime == 0)
                System.out.print(i + " ");
        }

	}
	
	public static boolean checkPrime(int num){
		for(int i=2;i<num;i++){
			if(num%i==0) 
				return false;
			
		}
		return true;
	}
	

}