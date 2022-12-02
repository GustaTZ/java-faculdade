package Exercicio;

public class Aluno {
	
	public Aluno(int ra, String nome) {
		super();
		this.ra = ra;
		this.nome = nome;
	}
	
	private int ra;
	private String nome;
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
