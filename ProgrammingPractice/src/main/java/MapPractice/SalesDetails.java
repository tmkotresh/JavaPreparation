package MapPractice;

import java.util.HashMap;
import java.util.Map;

public class SalesDetails {
	public int quantity;
	
	
	public SalesDetails(int quantity) {
		super();
		this.quantity = quantity;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public static void main(String[] args) {
		Map<SalesKey, SalesDetails> salesMap = new HashMap<>();
		salesMap.put(new SalesKey(1,1), new SalesDetails(100));
		System.out.println(salesMap.get(new SalesKey(1,1)));

	}

}
