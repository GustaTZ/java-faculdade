package aula09;

public class Gerente extends Funcionario {
	public double getBonificacao() {
		return this.salario*1.2+1000;
	}
}
