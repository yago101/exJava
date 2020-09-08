package app;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Program{
	public static void main(String[]args) {
		
		//Criando objeto do tipo Date para imprimir o instante atual
		
		Date dt1 = new Date();
		
		
		//criando formato para coversão
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss"); 
		
		
		//utilizando o método fomart do obj sdf1 para moldar a saida do obj dt1
		System.out.println("Esse instante: " + sdf1.format(dt1));
		
		
	}
}