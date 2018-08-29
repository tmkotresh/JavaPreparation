package StringPractice;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence =" I am a String and I am not a String";
		
		String[] strArray = sentence.split(" ");
		
		Map<String,Integer> strMap = new HashMap<String,Integer>();
		
		for(int i=0;i<strArray.length;i++){
			if(!strMap.containsKey(strArray[i])){
				strMap.put(strArray[i], 1);
				
			}else{
				strMap.put(strArray[i], strMap.get(strArray[i])+1);
			}
		}
		
		for(Map.Entry<String, Integer> entry:strMap.entrySet()){
			System.out.println("Key: "+entry.getKey()+" "+" Value: "+entry.getValue());
		}
			

	}

}
