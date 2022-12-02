package atividade;

public class Pessoa {
	String nome,cpf;
	
	public String dadosPessoa() {
		String dados="";
		dados+="Nome: "+nome+"\n";
		dados+="CPF: "+cpf+"\n";
		return dados;
	}
}
