package atividade;

public class Aluno extends Pessoa {
	int ra;
	String curso;
	
	@Override
	public String dadosPessoa() {
		String dados;
		dados = super.dadosPessoa();
		dados += "RA: " + ra + "\n";
		dados += "Curso: " + curso + "\n";
		return dados;
	}
}
