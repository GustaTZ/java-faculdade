package atividade;


public class Principal {

	public static void main(String[] args) {

		Aluno aluno=new Aluno();
		Professor prof=new Professor();
		//Aluno
			aluno.nome="Gustavo Torres";
			aluno.cpf="874.403.620-55";
			aluno.ra=331102;
			aluno.curso="ADS";
			
		//Professor
			prof.nome="Marcos Alexandruk";
			prof.cpf="060.297.280-91";
			prof.matricula=103;
			prof.salario=10000;
			
			System.out.println("Aluno: ");
			System.out.println(aluno.dadosPessoa());
			
			System.out.println("Professor: ");
			System.out.println(prof.dadosPessoa());

	}
}
