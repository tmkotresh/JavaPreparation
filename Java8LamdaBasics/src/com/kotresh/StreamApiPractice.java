package com.kotresh;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamApiPractice {

	public static void main(String[] args) {
		Person p1 = new Person("Kotresh", 31, 10000);
		Person p2 = new Person("Aparna", 29, 15000);
		Person p3 = new Person("Rithanya", 03, 30000);

		List<Person> personList = new ArrayList<>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);

		personList.stream().filter(p -> p.getSalary() >= 15000).forEach(System.out::println);

		personList.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
        
		// Sum of total salary of all persons
		double sumVal = personList.stream().mapToDouble(p -> p.getSalary()).sum();
		System.out.println("Total Salary of All employees " + sumVal);
        
		//Find Person with highest salary
		Person p = personList.stream().max((m1, m2) -> {
			return p1.getSalary() - p2.getSalary();
		}).get();

		System.out.println(p.getName() + ": " + p.getSalary());
        
		// Sort By Name Length
		personList.stream().sorted((m1, m2) ->  m1.getName().length() - m2.getName().length())
				.forEach(System.out::println);
		
		

	}

}
