package Collection;
import java.util.*;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		list.add("Kotresh");
		list.add("APK");
		list.add("T M");
		
		for(String lst : list){
			
			System.out.println("Using for loop "+lst);
			
		}
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			//System.out.println("Using iterator "+itr.next());
			//itr.remove();
			System.out.println(itr.next());
		}
		

	}

}
