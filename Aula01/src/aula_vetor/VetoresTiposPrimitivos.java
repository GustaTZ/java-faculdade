package aula_vetor;

public class VetoresTiposPrimitivos {

	public static void main(String[] args) {
		int[]numeros=new int[4];
		numeros[0]=500;
		numeros[1]=10000;
		numeros[2]=0;
		numeros[3]=-365;

			for(int i=0;i<numeros.length;i++) {
				System.out.println("numeros["+i+"] = "+ numeros[i]);
			}
			System.out.println();
			
			for(int numero:numeros) {
				System.out.println("numero: "+numero);
			}
			System.out.println("**************");
			
			String[]nomes= {"Maria","José","Carla"};
				for(String nome:nomes) {
					System.out.println("Nome: "+nome);
				}
	}

}
