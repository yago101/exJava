package entities;

public class Employee {

	 private Integer id;
	 private String name;
	 private Double salary;
	 
	 public Employee() {
		 
	 }
	 
	 public Employee(int id, String name,double salary){
		 this.id = id;
		 this.name = name;
		 this.salary = salary;
	 }
	 
	 public int getId() {
		 return this.id;
	 }
	 private void setId(int id) {
		 this.id = id;
	 }
	 private String getName() {
		 return this.name;
	 }
	 private void setName(String name) {
		 this.name =name;
	 }
	 private double getSalary() {
		 return this.salary;
	 }
	 private void setSalary(double salary) {
		 this.salary = salary;
	 }
	 
	 public void increaseSalary(double percIncrease) {
		 this.setSalary(this.getSalary()+(this.getSalary()*percIncrease/100));
	 }

	@Override
	public String toString() {
		return 
	id +", "+  name + ", " + salary ;
	}
	 
}
