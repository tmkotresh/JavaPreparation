
public class PalindromeNumber {
	
	public static boolean isPalindromeNum(int x) {
		int orgNum = x;
		int temp =0;
		while(x!=0) {
			int rem = x%10;
			temp = temp*10+rem;
			x = x/10;
		}
		
		if(orgNum == temp) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("is 121 Palindrome Number ? "+ isPalindromeNum(121));
		System.out.println("is 123 Palindrome Number ? "+ isPalindromeNum(123));

	}

}
