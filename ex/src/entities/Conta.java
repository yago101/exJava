package entities;

public class Conta {
	private int numConta;
	private String nomeTitular;
	private double saldo;
	private final static double Taxa = 5.0;

	public Conta(int nConta, String nTitular) {
		this.numConta = nConta;
		this.nomeTitular = nTitular;
		this.saldo = 0.0;
		
	}
	public Conta (int nConta,String nTitular,double vInicial) {
		this.numConta = nConta;
		this.nomeTitular = nTitular;
		this.saldo = vInicial;
		
	}
	
	private int getNumConta() {
		return this.numConta;
	}
	private String getNomeTitular() {
		return this.nomeTitular;
	}
	private void setNomeTitular(String nTitular) {
		this.nomeTitular = nTitular;
	}
	private double getSaldo() {
		return this.saldo;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void mudarNomeTitular(String nTitular) {
		setNomeTitular(nTitular);
		status();
	}
	public void depositar(double vDeposito) {
		setSaldo(getSaldo()+vDeposito);
		status();
	}
	public void sacar(double vSaque) {
		setSaldo(getSaldo()-(vSaque + Taxa));
		status();
		
	}
	
	public void status() {
		System.out.println( "Conta = " + numConta 
				+ "\nTitular =" + nomeTitular 
				+ "\nSaldo = " + saldo );
	}
	
}
