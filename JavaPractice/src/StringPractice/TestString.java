package StringPractice;

import java.util.*;

import java.text.SimpleDateFormat;
import java.util.stream.Stream;

public class TestString {
	
	static void modifyVal(Integer i){
		i=i+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String line ="This is a big string and i want to reverse each word how to do";
		

		
		
		String[] strArr = line.split("\\s+");
		
		Stream<String> stream = Arrays.stream(strArr);
		Arrays.asList(strArr).replaceAll(s-> new StringBuilder(s).reverse().toString());
		
		System.out.println(Arrays.toString(strArr));
		
         String orgStr = "Kotresh";
         //char[] revStr = new char[orgStr.length()];
         String revStr ="";
         
         for(int i=orgStr.length()-1;i>=0;i--){
        	 
        	 revStr= revStr+orgStr.charAt(i);
        	 
         }
         System.out.println("Reverese String "+revStr );
//         for(int j=0;j<revStr.length;j++){
//        	 System.out.print(revStr[j]);
//         }
       
		
		displayAnagrams("","AB");
		String val = "This is not a unique string and this is not a valid string";
		System.out.println("Unique strings count "+ uniqueWords(val));
		
		String test = "A,B,C,D";
		List<String> testList = new ArrayList<String>();
		
		testList = Arrays.asList(test.split(","));
		
		for(String tst : testList){
			System.out.println(tst);
		}
		
		
		System.out.println("-----------String Comparasion ----------------");
		
		String a = "Kotresh";
		//a.toUpperCase();
		
		
		String b = new String("Kotresh");
		
		String c ="Kotresh";
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		System.out.println(a==c);
		System.out.println(a.equals(c));
		
		Integer i = new Integer(42);
		System.out.println(i);
		modifyVal(i);
		System.out.println(i);
		b=b.concat(" T M");
		
		
		
		
		String inputString = "11-11-2012";
		//DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try{
            @SuppressWarnings("deprecation")
			Date date = new Date("11-11-2012");
            SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
            String convertedDateString = sdf.format(date);
            System.out.println(convertedDateString);
		}catch(Exception e){
			System.out.println(e);
		}
		
        
		c= b.toUpperCase();
		
		
		System.out.println("Value of A "+a);
		System.out.println("Value of B "+b);
		System.out.println("Value of C "+c);
		
		

	}
	
	
	public static int uniqueWords(String str){
		String[] strArr = str.split(" ");
		Set<String> hashSet = new HashSet<String>();
		
		for(int i=0;i<strArr.length;i++){
			hashSet.add(strArr[i]);
		}
		
		for(String strval : hashSet){
			System.out.println(strval);
		}
		
		return hashSet.size();
	}
	
	public static void displayAnagrams(String s1,String s2){
		if(s2.length()<=1) System.out.println(s1+s2);
		else{
			for(int i=0;i<s2.length();i++){
				
				String x = s2.substring(i, i+1);
				System.out.println("x:"+x);
				String y = s2.substring(0,i);
				System.out.println("y:"+y);
				String z = s2.substring(i+1);
				System.out.println("z:"+z);
				displayAnagrams(s1+x,y+z);
				System.out.println(s1+x+","+y+z);
			}
		}
	}

}
