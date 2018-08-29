package Collection;

import java.util.*;


public class PracticeList {
	
	public static void main(String[] args){
		
		List<String> strList = new ArrayList<String>();
		strList.add("hello");
		
		Iterator itr = strList.iterator();
		
		while(itr.hasNext()){
			strList.remove(0);
			strList.add("Long");
			System.out.println(itr.next());
		}
		
//		for(String str : strList){
//			
//			strList.add("Long");
//			strList.remove(0);
//			strList.add("Long");
//			System.out.println(strList.get(0));
//		}
		
	}

}
