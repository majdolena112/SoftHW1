package pac;

public class Book {
	public  String BName;
	public int  quantity;
	public double  totalCost;
 
	public Book(String productName, int quantity, double totalPrice) {
		this.BName = productName;
		this.quantity =  quantity;
		this.totalCost = totalPrice;
	}
 
	public String getProductName() {
		return BName;
	}
 
	public void setProductName(String productName) {
		this.BName = productName;
	}
 
	public int getQuantity() {
		return quantity;
	}
 
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
 
	public double getTotalCost() {
		return totalCost;
	}
 
	public void setTotalPrice(double cost) {
		this.totalCost = cost;
	}

}
