package aula06;
import java.util.InputMismatchException;
import java.util.Scanner;
public class teste {
	public static void main(String[]args) {
		int x;
		Scanner leitor=new Scanner(System.in);
		try {
		System.out.println("Digite um numero inteiro: ");
		x = leitor.nextInt();
		System.out.println("Voce digitou: "+x);
		leitor.close();
		}
		catch(InputMismatchException IME) {
			System.out.println("O valor informado não é um valor inteiro!!!");
		}
		System.out.println("\nO programa continuou...");
	}
}
