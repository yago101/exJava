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
		
		public String getName() {
			return this.name;
		}
		public void setName(String na) {
			this.name = na;
		}
		public double getPrice() {
			return this.price;
		}
		public void setPrice(double pri) {
			this.price = pri;
		}
}
