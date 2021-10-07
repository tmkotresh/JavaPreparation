package MapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapPractice {
	
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
	public HashMapPractice(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return 25;
	}
	
		@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashMapPractice other = (HashMapPractice) obj;
		return Objects.equals(name, other.name);
	}
	public static void main(String[] args) {
		Map<Integer,HashMapPractice> testMap = new HashMap<>();
		
		HashMapPractice h1 = new HashMapPractice("Kotresh",25);
		HashMapPractice h2 = new HashMapPractice("Malli",25);
		
		testMap.put(1, h1);
		testMap.put(1, h2);
		
		for(Map.Entry<Integer, HashMapPractice> map : testMap.entrySet()) {
			System.out.println(map.getKey());
			System.out.println(map.getValue().getName() + ":" + map.getValue().getAge());
		}
		
		
		
	}

}
