package aula05;

public class Array01 {
	public static void main(String[]args) {
		//Criar um array com 3 posições
				String nomes[] = new String[3];
				
		nomes[0] = "Fulano";
		nomes[1] = "Beltrano";
		nomes[2] = "Sicrano";
				
		for (int i = 0; i <= 2; i++) {
			System.out.println("Na posição " + i + " o valor e: " + nomes[i]);
		}
		System.out.println(nomes[3]);
		
		System.out.println("Tamanho do vetor maior: "+nomes.length);
	}
}