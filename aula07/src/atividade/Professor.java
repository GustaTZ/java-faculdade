package atividade;

public class Professor extends Pessoa {
	int matricula;
	float salario;
	
	@Override
	public String dadosPessoa() {
		String dados;
		dados = super.dadosPessoa();
		dados += "Matricula: " + matricula + "\n";
		dados += "Salario: " + salario + "\n";
		return dados;
	}
}
