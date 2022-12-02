package Exercicio;
import java.util.ArrayList;
import java.util.Scanner;


public class MenuPrincipal {

	public static void main(String[] args) {
		
		ArrayList<Aluno>alunos=new ArrayList<>();
		
		Scanner leitor= new Scanner (System.in);
		int opcao;
		do{
		System.out.println("**** MENU PRINCIPAL ****");
		System.out.println("1 - CADASTRAR ALUNO");
		System.out.println("2 - MOSTRAR TODOS OS ALUNOS");
		System.out.println("3 - PESQUISAR PELO RA DO ALUNO");
		System.out.println("4 - ALTERAR ALUNO");
		System.out.println("5 - EXCLUIR ALUNO");
		System.out.println("6 - FINALIZAR SISTEMA");
		System.out.print("Opção: ");
		
		opcao=leitor.nextInt();
		System.out.println("Opção escolhida foi "+opcao);
		
		switch(opcao) {
		case 1:
			System.out.println("**** CADASTRANDO ALUNO ****");
			
			System.out.print("RA: ");
			int ra= leitor.nextInt();
			
			System.out.print("Nome: ");
			String nome=leitor.next();
			
			Aluno aluno=new Aluno(ra,nome);
			alunos.add(aluno);
			
			break;
		case 2:
			System.out.println("**** MOSTRANDO TODOS ****");
			
			for(Aluno a:alunos) {
				System.out.println("RA: "+a.getRa());
				System.out.println("Nome: "+a.getNome());
				System.out.println();
			}
			break;
		case 3:
			System.out.println("**** PESQUISANDO PELO RA ****");
			
			System.out.println("Digite o RA: ");
			int raAPesquisar=leitor.nextInt();
			for(Aluno a:alunos) {
				if(raAPesquisar==a.getRa()) {
					System.out.println("RA: "+a.getRa());
					System.out.println("Nome: "+a.getNome());
					break;
				}
			}
			
			break;
		case 4:
			System.out.println("**** ALTERANDO ****");
			
			System.out.println("Digite o RA: ");
			raAPesquisar=leitor.nextInt();
			for(Aluno a:alunos){
				if(raAPesquisar==a.getRa()) {
					System.out.print("NOVO NOME: ");
					a.setNome(leitor.next());
					System.out.println("DADOS ALTERADOS COM SUCESSO");
					break;
				}
			}
			break;
		case 5:
			System.out.println("**** EXCLUINDO ALUNO ****");
			
			System.out.println("Digite o RA: ");
			raAPesquisar=leitor.nextInt();
			for(Aluno a:alunos){
				if(raAPesquisar==a.getRa()) {
					alunos.remove(a);
					System.out.println("ALUNO EXCLUÍDO COM SUCESSO!");
					break;
				}
			}
			System.out.println();
			break;
		case 6:
			System.out.println("**** FINALIZANDO SISTEMA ****");
			break;
		default:
			System.out.println("** OPÇÃO INVALIDA **");
			break;
			}
		}while(opcao!=6);
		leitor.close();
	}

}
