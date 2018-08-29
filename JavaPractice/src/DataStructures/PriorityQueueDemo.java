package DataStructures;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] i = {1,2,3,4,5};
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int ia : i){
		pq.offer(ia);
		}
		
		Iterator itr = pq.iterator();
		
//		while(itr.hasNext()){
//			System.out.println(pq.peek());
//			//System.out.println(pq.poll());
//		}
		
		//System.out.println(pq.peek());
		System.out.println(pq.poll());
		
		for(int ia2: i) {
			System.out.println(ia2);
		}
	

	}

}
