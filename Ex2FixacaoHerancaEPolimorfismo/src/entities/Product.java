package entities;

public class Product {
	private String name;
	private double price; 
	
	public Product() {
		
	}
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	protected String getName() {
		return name;
	}
	protected  void setName(String name) {
	 this.name = name;	
	}
	protected  double getPrice() {
		return price;
	}
	protected  void setPrice(double price) {
		this.price = price;
	}
	
	public String priceTag() {
		return this.getName() + " $ "+String.format( "%.2f" ,this.getPrice());
	}
}
