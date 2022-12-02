package aula_vetor;
import java.util.ArrayList;

public class ListaDeVetores {

	public static void main(String[] args) {
		
		ArrayList<String>nomes=new ArrayList<>();
		nomes.add("Maria");
		nomes.add("João");
		System.out.println(nomes);
		
		nomes.add("Pedro");
		nomes.add("Joana");
		nomes.add("Roberto");
		System.out.println(nomes);
		nomes.remove(2);
		System.out.println(nomes);
		System.out.println(nomes.get(3));
		System.out.println("O nome da pessoa na posição 3 é: %s"+ nomes.get(3));
		System.out.printf("O nome da pessoa na posição %d é: %s, e na posição %d é: %s", 3,nomes.get(3),2,nomes.get(2));
	}

}
