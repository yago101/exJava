package entities;

public class Estudante{
	private String nome;
	private String email;
	private int quarto;
	
	
	public Estudante(String nome, String email,int nQuarto) {
		
		this.nome = nome;
		this.email = email;
		this.quarto = nQuarto;
		
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getQuarto() {
		return quarto;
	}
	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}


	@Override
	public String toString() {
		return "Estudante [nome=" + nome + ", email=" + email + ", quarto=" + quarto + "]";
	}
	
	
	
}