package entities;

import java.util.Locale;

public final class ImportedProduct extends Product {
	
	private double customsFee;
	
	public ImportedProduct() {
		super();
	}
	public ImportedProduct(String name, double price,double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	private double getCustomsFee() {
		return customsFee;
	}
	private void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	public double totalPrice() {
		return super.getPrice()+this.getCustomsFee();
	}
	
	@Override
	public String priceTag() {
		
		super.setPrice(totalPrice());
		return super.priceTag() + " (Customs fee: $ "+ String.format("%.2f", this.getCustomsFee())+")";
		
		
				}
	
	
}
