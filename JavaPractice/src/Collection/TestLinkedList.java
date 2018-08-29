package Collection;

import java.util.LinkedList;

public class TestLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<String> students = new LinkedList<String>();
		
		students.add("Charlie");
		students.add("Sally");		
		students.add("Morgan");
		students.add("Jammy");
		students.add("Tailor");
		
		
		students.addFirst("Sarah");
		students.addLast("Hailey");
		
		students.add(2,"Tara");
		
		String firstStudent = students.getFirst();
		System.out.println("First "+firstStudent);
		
		String lastStudent = students.getLast();
		System.out.println("Last "+lastStudent);
		
		System.out.println(students.size());
		
		System.out.println(students);
		
		students.removeFirst();
		
		students.removeLast();
	}

}
