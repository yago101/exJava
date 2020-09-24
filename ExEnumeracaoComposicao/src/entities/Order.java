package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


import entities.enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat sdfOrder = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
	private static SimpleDateFormat sdfClientBirthDay = new SimpleDateFormat("dd/MM/yyyy"); 
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	private ArrayList<OrderItem> item = new ArrayList<OrderItem>();
	
	
	public Order(Date moment, OrderStatus status, ArrayList<OrderItem> item) {
		
		this.moment = moment;
		this.status = status;
		this.item = item;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public ArrayList<OrderItem> getItem() {
		return item;
	}
	
	public void addItem(OrderItem item) {
		this.item.add(item);
	}
	public void removeItem(OrderItem item) {
		this.item.remove(item);
	}
	public double total() {
		double totalOrder = 0.0;
		for(OrderItem it : this.item) {
			totalOrder += it.subTotal();
		}
		return totalOrder;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: " + sdfOrder.format(this.moment));
		sb.append("Order Status: " + this.getStatus());
		sb.append("Client: " + this.client.getName());
		sb.append(" (" +sdfClientBirthDay.format(this.client.getBirthDate())+") - " + this.client.getEmail());
		sb.append("Order Items:\n" );
		for(OrderItem its: this.item) {
			its.toString();
		}
		sb.append("Total price: "+total());
	}
	

}
