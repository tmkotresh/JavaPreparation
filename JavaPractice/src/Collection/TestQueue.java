package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("Charlie");
		queue.add("Sally");		
		queue.add("Morgan");
		queue.add("Jammy");
		queue.add("Tailor");
		
		System.out.println(queue);
		
		String nextInQueue = queue.peek();
		
		System.out.println(nextInQueue);
		
		for(int i=0; i<queue.size();i++) {
			
			queue.remove();
			
			System.out.println(queue);
		}
	}

}
