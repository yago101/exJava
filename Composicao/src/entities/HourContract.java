package entities;

import java.util.Date;

public class HourContract{
	
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract() {
		
	}
	
	public HourContract(Date date, Double valuePerHour, Integer hours) {
		
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getValuePerHour() {
		return this.valuePerHour;
	}
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	public Integer getHours() {
		return this.hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Double totalValue() {
		return this.getHours()*this.getValuePerHour();
	}

	@Override
	public String toString() {
		return "HourContract [date=" + date + ", valuePerHour=" + valuePerHour + ", hours=" + hours + "]";
	}
	
}