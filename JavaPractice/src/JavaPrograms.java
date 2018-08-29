
public class JavaPrograms {
	static int c;
	static void reverseString(String str){
		System.out.println("Orginal String "+ str);
		String revStr="";
		char[] strChar = new char[str.length()];
		strChar = str.toCharArray();
		
		for(int i=strChar.length-1;i>=0;i--){
			System.out.print(strChar[i]);
			
			 revStr = revStr+strChar[i];
		}
		System.out.println();
		System.out.println("Reverse String "+ revStr);
	}

	
	static void anaGramsOfString(String s1,String s2){
		 
		if(s2.length()<=1){
			System.out.println(s1+s2);
			c++;
		}else{
			for(int i=0;i<s2.length();i++){
				System.out.println("I:"+i);
				String x = s2.substring(i,i+1);
				System.out.println("X: "+x);
				String y = s2.substring(0,i);
				System.out.println("Y: "+x);
				String z = s2.substring(i+1);
				System.out.println("Z: "+z);
				anaGramsOfString(s1+x,y+z);
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString("kotresh");
		System.out.println(c);
		anaGramsOfString("","hi");
	}

}
