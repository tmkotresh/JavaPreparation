package ProgrammingQuestions;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = "MADAM";
     if(isPalindrome(str)) System.out.println("Palindrome");
     
     if(isPalindromeCharArrApproach(str)) System.out.println("Palindrome");
		
	}
	
	public static boolean isPalindrome(String str){
		StringBuilder strBuilder = new StringBuilder(str);
		String revStr = strBuilder.reverse().toString();
		
		if(str.equals(revStr)) return true;
		
		
		return false;
			
		
	}
	
	public static boolean isPalindromeCharArrApproach(String str){
		
		char[] charArr = str.toCharArray();
		
		String revStr ="";
		for(char c :charArr ){
			revStr += c;
		}
		
		System.out.println(revStr);
		
		if(str.equals(revStr)) return true;
		
		return false;
	}
	
	

}
