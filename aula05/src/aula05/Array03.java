package aula05;

public class Array03 {
	public static void main(String[]args) {
		//Criar um array com 3 linhas e 2 colunas 
		String escritores[][] = new String[3][2];
		
		escritores[0][0]="Carlos";
		escritores[0][1]="Drummond";

		escritores[1][0]="Clarice";
		escritores[1][1]="Lispector";
		
		escritores[2][0]="Jorge";
		escritores[2][1]="Amado";
		
		for (int i = 0; i <= 2; i++) {
			System.out.println("Nome armazenado na linha "+i+": ");
			System.out.println(escritores[i][0]+" "+escritores[i][1]);
		}
	}
}