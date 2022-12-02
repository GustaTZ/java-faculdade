package aula04;
import java.util.Scanner;
public class Valores {
	public static void main(String[]args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe um valor interno: ");
		int a = tec.nextInt();
		
		switch(a) {
		case 0:
			System.out.println("A variavel A recebeu o valor de 0");
			break;
		case 1:
		System.out.println("A variavel A recebeu o valor de 0");
			break;
		case 2:
		System.out.println("A variavel A recebeu o valor de 0");
			break;
			default:
				System.out.println("A variavel A recebeu um valor diferente de 0, 1, 2");
		}
	}
}
