package aula05;

public class Array02 {
	public static void main(String[]args) {
		//Criar um array com 10 posições 
		int maior=0;
		int numeros[] = new int[10];
				
		numeros[0]=2;
		numeros[1]=20;
		numeros[2]=5;
		numeros[3]=68;
		numeros[4]=34;
		numeros[5]=13;
		numeros[6]=55;
		numeros[7]=67;
		numeros[8]=12;
		numeros[9]=30;
		
				
		for (int i = 0; i <= 9; i++) {
			if(numeros[i]>maior) {
				maior=numeros[i];
			}
		}
		System.out.println(maior);
	}
}