package Wrappers;

public class TestWrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Integer i = new Integer(15);
		String binaryVal = Integer.toBinaryString(i);
		
		System.out.println(binaryVal);
		char[] ch = binaryVal.toCharArray();
		for(int j=0;j<ch.length-1;j++){
			int cnt=0;
			if(ch[j]==1){
				System.out.println(ch[j]);
				if(ch[j]==ch[j+1]){
					cnt++;
				}
			}
			System.out.println(cnt++);
			
		}
		
		
	}

}
