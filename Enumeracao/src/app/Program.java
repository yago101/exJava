package app;


import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import entities.Pedido;
import entities.enums.StatusPedido;

/*Utilizando enumera��es pela primeira vez. 
* A ideia � fazer com que seja possivel saber o status
de um pedido dentro de um processo de venda e envio.
*/


	public class Program{
		
		public static void main (String []args) {
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy HH:mm");
			Calendar data = Calendar.getInstance();
			
			//criando um pedido
			Pedido pd1 = new Pedido(2,sdf.format(data.getTime()), StatusPedido.AGUARDANDO_PAGAMENTO);
			/*usando o valor do statusPedido
			StatusPedido statusPedido = StatusPedido.ValueOf(teclado.next());
			*/
			//sa�da
			System.out.println(pd1);
		}
	}