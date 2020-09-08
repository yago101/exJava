package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		Integer nEmployee, id, idSearch ;
		String name;
		Double salary, percIncrease;
		
		System.out.print("How many emplyees will be registered? ");
		nEmployee = tc.nextInt();
		
		List <Employee> listEmployee = new ArrayList<Employee>();
		
		for(int i = 0 ; i<nEmployee;i++) {
			System.out.println("Employee #"+(i+1) + " :");
			
			System.out.print("Id: ");
			id = tc.nextInt();
			System.out.print("Name: ");
			tc.nextLine();
			name = tc.nextLine();
			System.out.print("Salary: ");
			salary = tc.nextDouble();
			
			Employee e = new Employee(id,name,salary);
			
			listEmployee.add(e);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		idSearch = tc.nextInt();
		
		 
		Employee result = listEmployee.stream().filter(n -> n.getId() == idSearch).findFirst().orElse(null);
		if(result == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			percIncrease = tc.nextDouble();
			result.increaseSalary(percIncrease);
		}
		System.out.println("\nList of employees:");
		for(Employee x :listEmployee ) {
			System.out.println(x);
		}
	
		tc.close();
	}

}
