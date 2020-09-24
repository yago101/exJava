package entities;

public class OrderItem {

	private int quantity;
	private double price;
	private Product product;
	
	public OrderItem() {
		
	}
	public OrderItem(int quantity, double price, Product product) {
		
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double subTotal() {
		return this.getQuantity()*this.product.getPrice();
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.product.getNmae()+", ");
		sb.append(this.product.getPrice()+ ", ");
		sb.append("Quantity: " + this.quantity);
		sb.append("SubTotal: "+ subTotal());
		return sb.toString()+"\n";
	}
}
