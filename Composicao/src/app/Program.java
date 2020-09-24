package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

/* Ler os dados de um trabalhador com N contratos
 * (N fornecido pelo usuário). Depois, solicitar
 * do usuário um mês e mostrar qual foi o salário
 * do funcionário nesse mês.
*/

	public class Program{
		public static void main(String[]args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter departament's name: ");
		String departamentName = sc.nextLine();
		
		System.out.print("Enter worker data: ");
		System.out.print("\nName: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker w1 = new Worker (workerName,WorkerLevel.valueOf(workerLevel), baseSalary,new Departament(departamentName));
		
		System.out.print("How many contracts to this worker: ");
		int nContracts = sc.nextInt();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");
		
		for(int i = 1; i<=nContracts;i++) {
			System.out.print("Enter contract #"+i+" data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date dateContract = sdf1.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract hi = new HourContract(dateContract, valuePerHour, hours);
			w1.addContract(hi);
		}
		System.out.print("Enter month and yar to calculate income (MM/YYYY): ");
		Calendar cl = Calendar.getInstance();
		Date search = sdf2.parse(sc.next());
		cl.setTime(search);
		System.out.print("Name: "+w1.getName());
		System.out.print(" Departament: "+ w1.getDepartament().getName());
		System.out.print(" Income for "+sdf2.format(search)+": ");
		System.out.print(w1.income(cl.get(Calendar.YEAR), cl.get(Calendar.MONTH)));
		sc.close();
			
		}
	}