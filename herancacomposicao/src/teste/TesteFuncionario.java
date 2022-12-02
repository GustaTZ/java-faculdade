package teste;

import estudoherança.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario func=new Funcionario();
		func.setMatricula(1010);
		func.setNome("Gustavo");
		func.setSalarioBruto(3000);
		func.setBonificacao(func.calcularBonificacao());
		
		System.out.println("Matricula: "+func.getMatricula());
		System.out.println("Nome: "+func.getNome());
		System.out.println("Salario Bruto: "+func.getSalarioBruto());
		System.out.println("Bonificação: "+func.getBonificacao());
		

	}

}
