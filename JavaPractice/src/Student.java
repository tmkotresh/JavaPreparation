import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class Student {
	
	private String name;
	
	private int age;
	

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


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
	
	@Override
	public String toString(){
		String foo = name+" "+age;
		return foo;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student s1 = new Student("Kotresh",25);
          
          Student s2 = new Student("Malli",20);
          
          Student s3 = new Student("Kotresh",25);
          
          HashMap<Student,String> map = new HashMap<Student,String>();
          
          map.put(s1, "one");
          map.put(s1, "two");
          
          for(Map.Entry<Student,String> mapObj: map.entrySet()){
        	 System.out.println("Map---" +mapObj.getKey()); 
        	 System.out.println("Map val ---"+ mapObj.getValue());
        	  
          }
          
          ArrayList<Student> a1 = new ArrayList<Student>();
          
          a1.add(s1);
          a1.add(s2);
          
        
          
          Iterator<Student> it1 = a1.iterator();
          
          while(it1.hasNext()){
        	  System.out.println("---"+it1.next());
          }
          
          
          
          
          
	}

}
