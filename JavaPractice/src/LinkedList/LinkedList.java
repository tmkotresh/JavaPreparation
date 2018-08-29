package LinkedList;

public class LinkedList {
	
	int power(int n, int p) throws Exception{
	    if(n > 0 || p > 0){
	    	Double pow = Math.pow(n, p);
	    	
	    	int i = pow.intValue();
	    	return i;
	        
	        
	    }else{
	       throw new Exception("n and p should be non-negative");
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		
		    
		String A="madam";
        String rev = "";
        /* Enter your code here. Print output to STDOUT. */
        char[] ch = A.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
        	System.out.print(ch[i]);
            rev= rev+ch[i];
            
        }
        
        System.out.println("---"+rev);
        if(A.equals(rev)){
            System.out.println("Yes");
        }
		    
		    //reverese(name);
		    
		    
		    
	}

}
