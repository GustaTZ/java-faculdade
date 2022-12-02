package teste;

import estudoherança.Funcionario;

public class TesteEquals {

	public static void main(String[] args) {
		
		Funcionario funcionario1=new Funcionario();
		funcionario1.setMatricula(2010);
		funcionario1.setNome("Flavio Nunes");
		funcionario1.setSalarioBruto(3000);
		
		Funcionario funcionario2=new Funcionario();
		funcionario2.setMatricula(2010);
		funcionario2.setNome("Flavio Nunes");
		funcionario2.setSalarioBruto(3000);
		
		System.out.println(funcionario1.equals(funcionario2));
		System.out.println(funcionario1 == funcionario2);
	}

}
