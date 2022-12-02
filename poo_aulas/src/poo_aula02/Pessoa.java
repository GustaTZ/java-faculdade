package poo_aula02;

public class Pessoa {
	String nome;
	int idade;
	public String getNome() {
	    return nome;
	}
	public void setNome(String nome) {
	    this.nome = nome;
	}
	public int getIdade() {
	    return idade;
	}
	public void setIdade(int idade) {
	    this.idade = idade;
	}
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Fulano");
		pessoa1.setIdade(25);
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
	}

}