package entities;

import entities.enums.WorkerLevel;

public class Worker{
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private String getName() {
		return this.name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private WorkerLevel getLevel() {
		return this.level;
	}
	private void setLevel(WorkerLevel level) {
		this.level = level;
	} 
	private Double getBaseSalary() {
		return this.baseSalary;	
	}
	private void setBaseSlary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public void addContract(HourContract contract) {
		
	}
	public void removeContract(HourContract contract) {
		
	}
	public Double income(Integer year,Integer month) {
		
	}
	
}