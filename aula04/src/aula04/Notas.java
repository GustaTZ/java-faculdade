package aula04;
import java.util.Scanner;
public class Notas {
	public static void main(String[] args ) {
		Scanner teclado = new Scanner(System.in);
		float nota1, nota2, nota3, media;
		System.out.println("Informe as notas: ");
		System.out.print("\n\tNota1: ");
		nota1 = teclado.nextFloat();
		System.out.print("\tNota2: ");
		nota2 = teclado.nextFloat();
		System.out.print("\tNota3: ");
		nota3 = teclado.nextFloat();
		
		media = calculaMedia(nota1, nota2, nota3);
		System.out.println("\n\tA média é: " + media);
		
	}
	public static float calculaMedia(float n1, float n2, float n3) {
		float media;
		if (n1 < n2 && n1 < n3) {
			media = (n2 + n3) / 2;
		}else if (n2 < n3) {
			media = (n1 + n3) / 2;
		}else {
			media = (n1 + n2) / 2;
		}
		
		return media;
	}

}