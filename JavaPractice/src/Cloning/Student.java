package Cloning;

public class Student implements Cloneable{
	
	String name;
	int age;
	
	public Student(String newName, int newAge) {
		this.name= newName;
		this.age = newAge;
	}
	
	public Object clone() throws CloneNotSupportedException{
		Student st = (Student) super.clone();
		
		return st;
	}
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Kotresh",25);
		Student s2 = null;
		try {
			s2 = (Student)s1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(s1.age+" "+s1.name);
		System.out.println(s2.age+" "+s2.name);
		
		System.out.println(s1.hashCode());
		
		System.out.println(s2.hashCode());
		
		
	}
	
	

}
