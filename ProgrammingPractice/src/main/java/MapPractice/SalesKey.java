package MapPractice;

public class SalesKey {
	public int orderId;
	public int productId;
	
	public SalesKey(int orderId, int productId) {
		super();
		this.orderId = orderId;
		this.productId = productId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
}
