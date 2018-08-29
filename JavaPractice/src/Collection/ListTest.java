package Collection;

import java.util.*;

public class ListTest {

	public static void main(String[] args) {

		List<String> a1 = new ArrayList<String>();
		List<String> a2 = new ArrayList<String>();
		
		a1.add("A");
		a1.add("B");
		a1.add("C");
		
		
		
		a2.add("C");
		a2.add("D");
		a2.add("E");
		
		a2.removeAll(a2);
		System.out.println("Hi");
		
		Iterator it = a1.iterator();
		while(it.hasNext()){
			System.out.println("---"+it.next());
		}
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
		List<String> tsTeamMembersUserNameList = new ArrayList<String>();
		List<String> tsTeamMembersDisplayNameList = new ArrayList<String>();
		 
		tsTeamMembersUserNameList.add("George");
		tsTeamMembersUserNameList.add("Greg");
		
		tsTeamMembersDisplayNameList.add("George Eliot");
		tsTeamMembersDisplayNameList.add("Greg Dsouza");
		
		
		
		int pos2 = tsTeamMembersDisplayNameList.indexOf("George Eliot");
		
		String userName = tsTeamMembersUserNameList.get(pos2);
		System.out.println(pos2);
		System.out.println(userName);
		
		

	}

}
