package function;

public class Order {
	private int orderID;
	private String state;
	private String creationDate;
	
	
	public Order(int orderID, String state, String creationDate) {
		super();
		this.orderID = orderID;
		this.state = state;
		this.creationDate = creationDate;
	}


	public int getOrderID() {
		return orderID;
	}


	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	
	
	
	
	
	
	

}
