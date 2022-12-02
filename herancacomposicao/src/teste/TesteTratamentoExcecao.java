package teste;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TesteTratamentoExcecao {
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		
		try {
		System.out.println("Digite um numero: ");
		int numero=leitor.nextInt();
		System.out.println("Numero digitado: "+numero);
		leitor.close();	
		System.out.println("Conexao Fechada com Sucesso");
		}catch (InputMismatchException e) {
		System.out.println("Erro no numero digitado");
		}finally {
		leitor.close();
		System.out.println("Conexao Fechada com Sucesso");
		}
	}
}
