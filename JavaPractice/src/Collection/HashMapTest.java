package Collection;
import java.util.*;
import java.util.Map.Entry;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> hashMap = new HashMap<>();
		
		hashMap.put(null, null);
		
		for(Map.Entry<String, String> map : hashMap.entrySet()) {
			System.out.println("Null key and Value in HashMap "+map.getKey()+" "+ map.getValue());
		}
		
		String str ="Kotresh";
		String str1 = "Kotresh";
		
		System.out.println("Str1 hashcode "+str1.hashCode());
		System.out.println("Str hashcode "+str.hashCode());
		
		Employee e1= new Employee("ram", 1000);
        Employee e2= new Employee("sai", 1001);
        Employee e3= new Employee("krishna", 1002);
        
        Map<Employee,String> map = new HashMap<Employee,String>();
        
        map.put(e1, "employee1");
       
        map.put(e2, "employee1");
        map.put(e3, "employee3"); 
        
        System.out.println(map.size());
        
        for(Entry<Employee,String> entry : map.entrySet()){
        	System.out.println(entry.getKey().getName() + " - "+ entry.getKey().getId());
        }
        
        System.out.println(map.get(e3));        
        System.out.println(map.get(new Employee("krishna", 1002)));

	}

}
