package Collection;

import java.util.*;

public class SetTest<T> implements Comparable<T> {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SetTest other = (SetTest) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	private String name;
	private int age;
	public String getName() {
		return name;
	}

public void setName(String name) {
		this.name = name;
	}
public int getAge() {
		return age;
	}

public void setAge(int age) {
		this.age = age;
	}


//  public int compareTo(int age1){
//	return this.age-age1;
//  }



	public SetTest(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<String> hashSetObj = new HashSet<String>();
		hashSetObj.add("one");
		hashSetObj.add("two");
		hashSetObj.add("three");
		
		hashSetObj.add(null);
		
		Set<String> treeSetObj = new TreeSet<String>();
		
		treeSetObj.add("one");
		treeSetObj.add("two");
		treeSetObj.add("three");
		
		for(String hs : hashSetObj){
			System.out.println(hs);
		}
		
		for(String ts : treeSetObj){
			System.out.println(ts);
		}
		
		
		Set<Employee> empSet = new TreeSet<Employee>();
		empSet.add(new Employee("Kotresh",25));
		
		empSet.add(new Employee("Malli",29));
		empSet.add(new Employee("Aaradhya",30));
		
		System.out.println(empSet.size());
		for(Employee e: empSet){
			System.out.println(e.getData());
		}
		
		System.out.println("---------------");
		
		
		
//	   Set<SetTest> hashSetObj = new HashSet<SetTest>();
//	   Set<SetTest> treeSetObj = new TreeSet<SetTest>();
//	   
//	   hashSetObj.add(new SetTest("Kotresh",15));
//	   hashSetObj.add(new SetTest("Malli",21));
//	   
//	   
//	   treeSetObj.add(new SetTest("Kotresh",15));
//	   treeSetObj.add(new SetTest("Malli",21));
//	   treeSetObj.add(new SetTest("Raj",26));
//	  
//	  for(SetTest s1 : hashSetObj){
//		  System.out.println(s1.getName()+" "+s1.getAge());
//	  }
//	  
//	  for(SetTest s2 : treeSetObj){
//		  System.out.println(s2.getName()+" "+s2.getAge());
//	  }
//	  
//		
//		int[] intArr = { 1,1,2,2,3,4,5,5,6,8,8,9,9};
//		
//		Set<Integer> intSet = new LinkedHashSet<Integer>();
//		
//		for(int i : intArr){
//			intSet.add(i);
//		}
//		
//		for(Integer intVal : intSet){
//			System.out.println(intVal);
//		}
//		
//
	}

	
	public int compareTo(SetTest o) {
		// TODO Auto-generated method stub
		
		if(age==o.age)return 0;
		else if(age > o.age) return 1;
		return -1;
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
