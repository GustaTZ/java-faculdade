package aula;
import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {
		Scanner leitor= new Scanner (System.in);
		int opcao;
		do{
		System.out.println("**** MENU PRINCIPAL ****");
		System.out.println("1 - CADASTRAR");
		System.out.println("2 - MOSTRAR TODOS");
		System.out.println("3 - PESQUISAR PELO NOME");
		System.out.println("4 - ALTERAR");
		System.out.println("5 - EXCLUIR");
		System.out.println("6 - FINALIZAR SISTEMA");
		System.out.print("Opção: ");
		
		opcao=leitor.nextInt();
		System.out.println("Opção escolhida foi "+opcao);
		
		switch(opcao) {
		case 1:
			System.out.println("**** CADASTRANDO ****");
			break;
		case 2:
			System.out.println("**** MOSTRANDO TODOS ****");
			break;
		case 3:
			System.out.println("**** PESQUISANDO PELO NOME ****");
			break;
		case 4:
			System.out.println("**** ALTERANDO ****");
			break;
		case 5:
			System.out.println("**** EXCLUINDO ****");
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
