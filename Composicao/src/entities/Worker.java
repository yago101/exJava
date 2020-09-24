package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker{
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private Departament departament;
	private ArrayList<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
		
	}
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return this.departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}
	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}
	public double income(int year,int month) {
		double totalMes = this.baseSalary;
		Calendar calendar = Calendar.getInstance();
		for(HourContract c : contracts) {
			calendar.setTime(c.getDate());
			if(calendar.get(Calendar.YEAR)== year
					&& calendar.get(Calendar.MONTH) == month) {
				totalMes+= c.totalValue();
			}
		}
		return totalMes;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", level=" + level + ", baseSalary=" + baseSalary + ", contracts=" + contracts
				+ "]";
	}
	
}