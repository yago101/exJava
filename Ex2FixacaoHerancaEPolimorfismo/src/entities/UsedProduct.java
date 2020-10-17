package entities;

import java.text.SimpleDateFormat;

import java.util.Date;

public final class UsedProduct extends Product {
	
	final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}
	public UsedProduct(String name, double price, Date manuDate) {
		super(name, price);
		this.manufactureDate = manuDate;
	}
	private Date getManufactureDate() {
		return manufactureDate;
	}
	private void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Override
	public String priceTag() {
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(getName());
		sb.append(" (used) $");
		sb.append(String.format("%.2f",super.getPrice()));
		sb.append(" (Manufacture date: " + sdf.format(this.getManufactureDate())+")");
		
		return sb.toString();
	}
}
