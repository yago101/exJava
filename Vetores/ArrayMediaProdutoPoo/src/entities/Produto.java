package entities;

public class Produto {
	private String nome;
	private double preco;
	
	
	public Produto(String nome, double preco) {
		
		this.nome = nome;
		this.preco = preco;
	}
	public String getNome() {
		return this.nome;
	}
	private void setNome(String n) {
		this.nome = n;
	}
	public double getPreco(){
		return this.preco;
	}
	private void setPreco(double n) {
		this.preco = n ; 
	}

	
	
}