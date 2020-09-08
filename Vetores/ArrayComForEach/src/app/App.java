package app;

/*O for each � uma sintaxe opcional para se percorrer uma cole��o (Array)
 leitura: para cada um objeto 'apeliido' contido em 'cole��o', fa�a:
*Sintaxe : 
*       
*         for( tipoDaCole��o apelido : cole��o){
*         }
*/
public class App{
	public static void main(String[]args) {
		int[] arrayNumeros = new int [] {1,2,3,4,5};
		
		//A forma habitual para se percorrer o arrayNumeros
		for(int i = 0 ; i<arrayNumeros.length;i++) {
			System.out.println(arrayNumeros[i]);
		}
		
		//utilizando a sintaxe opcional for each
		
		for(int vetor: arrayNumeros) {
			System.out.println(vetor);
		}
	}
}